package com.example.vehiclehealth;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
//import android.app.ProgressDialog;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText usernameLogin, passwordLogin;
    private Button buttonLogin,buttonRegister;
    // private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(SharedPrefManager.getInstance(this).isLoggedIn()){
            finish();
            startActivity(new Intent(this, Dashboard.class));
            return;
        }

        buttonLogin=findViewById(R.id.buttonLogin);
        buttonRegister=findViewById(R.id.buttonRegister);

        usernameLogin=findViewById(R.id.username);
        passwordLogin=findViewById(R.id.password);


        // progressDialog = new ProgressDialog(this);
        // progressDialog.setMessage("Please wait...");

        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);

    }

    private void userLogin(){
        final String username = usernameLogin.getText().toString();
        final String password = passwordLogin.getText().toString();

        // progressDialog.show();
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://192.168.1.77/validateData.php";

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // progressDialog.dismiss();
                        try {
                            JSONObject obj = new JSONObject(response);
                            if(!obj.getBoolean("error")){
                                Toast.makeText(getApplicationContext(), obj.getString("message"),Toast.LENGTH_LONG).show();
                                startActivity(new Intent(getApplicationContext(), Dashboard.class));
                                SharedPrefManager.getInstance(getApplicationContext())
                                        .userLogin(
                                                obj.getString("username"),
                                                obj.getString("fullname"),
                                                obj.getString("email"),
                                                obj.getString("phone")
                                        );

                                finish();
                            }else{
                                Toast.makeText(getApplicationContext(), obj.getString("message"),Toast.LENGTH_LONG).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // progressDialog.dismiss();

                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", username);
                params.put("password", password);
                return params;
            }

        };

        queue.add(stringRequest);
    }

    @Override
    public void onClick(View view) {
        if(view == buttonLogin){
            userLogin();
        }
        if(view == buttonRegister)
            startActivity(new Intent(this, Register.class));
    }
}
