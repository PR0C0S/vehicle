package com.example.minor2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class UserUpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_update);

        MaterialButton btn_update = (MaterialButton) findViewById(R.id.btn_update);
        MaterialButton btn_cancel = (MaterialButton) findViewById(R.id.btn_cancel);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserUpdateActivity.this,UserProfileActivity.class);
                startActivity(i);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserUpdateActivity.this,DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}