package com.example.vehiclehealth;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.vehiclehealth.Login;
import com.example.vehiclehealth.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity implements View.OnClickListener {


    private EditText nameRegister,usernameRegister,phoneRegister,emailRegister, passwordRegister;
    private Button buttonLogin,buttonRegister;
    // private ProgressDialog progressDialog;

    // private TextView textViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        if(SharedPrefManager.getInstance(this).isLoggedIn()){
            finish();
            startActivity(new Intent(this, Dashboard.class));
            return;
        }

        buttonRegister=findViewById(R.id.signup);
        buttonLogin=findViewById(R.id.loginView);

        nameRegister=findViewById(R.id.fullName);
        usernameRegister=findViewById(R.id.username);
        phoneRegister=findViewById(R.id.phone);
        emailRegister=findViewById(R.id.fullName);
        passwordRegister=findViewById(R.id.password);

        // textViewLogin = (TextView) findViewById(R.id.textViewLogin);

        // progressDialog = new ProgressDialog(this);

        buttonRegister.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);
    }

    private void registerUser() {
        final String name = nameRegister.getText().toString();
        final String mail = emailRegister.getText().toString();
        final String phone = phoneRegister.getText().toString();
        final String username = usernameRegister.getText().toString();
        final String password = passwordRegister.getText().toString();

        // progressDialog.setMessage("Registering user...");
        // progressDialog.show();
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://192.168.1.77/insertData.php";
        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // progressDialog.dismiss();

                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            Toast.makeText(getApplicationContext(), jsonObject.getString("message"), Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), Login.class));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
//                        progressDialog.hide();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params=new HashMap<>() ;
                params.put("name",name);
                params.put("username",username);
                params.put("email",mail);
                params.put("phone",phone);
                params.put("password",password);
                return params;
            }
        };


        queue.add(stringRequest);


    }

    @Override
    public void onClick(View view) {
        if (view == buttonRegister)
            registerUser();
        if(view == buttonLogin)
            startActivity(new Intent(this, Login.class));
    }
}
