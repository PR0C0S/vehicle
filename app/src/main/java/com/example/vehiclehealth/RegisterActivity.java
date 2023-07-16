package com.example.minor2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterActivity extends AppCompatActivity {

    TextView fullname,email, username, phone, pass, cpass;
    MaterialButton registerBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialButton registerbtn = (MaterialButton) findViewById(R.id.registerBtn);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,DashboardActivity.class);
                startActivity(i);
            }
        });


//        fullname = (TextView) findViewById(R.id.fullname);
//        email = (TextView) findViewById(R.id.email);
//        phone = (TextView) findViewById(R.id.phone);
//        username = (TextView) findViewById(R.id.username);
//        pass = (TextView) findViewById(R.id.password);
//        cpass = (TextView) findViewById(R.id.cpassword);
//
//        registerBtn = (MaterialButton) findViewById(R.id.registerBtn);

//        registerBtn.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                new DatabaseHelper().execute();
//
//                if(pass.equals(cpass)){
//                    new DatabaseHelper().execute();
//                }
//                else{
//                    Toast.makeText(RegisterActivity.this, "Password and Confirm password doesn't match. TRY AGAIN", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
//    class DatabaseHelper extends AsyncTask<Void,Void,Void> {
//
//        String query="insert into userprofile(fullname,email,phone,username,password) values(?,?,?,?,?)";
//        @Override
//        protected Void doInBackground(Void... voids) {
//            try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2","root","");
//                PreparedStatement pstmt = conn.prepareStatement(query);
//
//                pstmt.setString(2, String.valueOf(fullname));
//                pstmt.setString(3, String.valueOf(email));
//                pstmt.setString(4, String.valueOf(phone));
//                pstmt.setString(4, String.valueOf(username));
////                String pass = md5(password);
//                pstmt.setString(5, String.valueOf(pass));
//
//                int result = pstmt.executeUpdate();
//                if(result != -1){
//                    Intent i = new Intent(RegisterActivity.this,LoginActivity.class);
//                    startActivity(i);
//                }
//                else {
//
//                }
//
//
//            }
//            catch (Exception e){
//                e.toString();
//            }
//            return null;
//        }
//    }
}