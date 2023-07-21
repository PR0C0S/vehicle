package com.example.minor2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class UpdateServiceDateActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_service_date);

        MaterialButton btn_update = (MaterialButton) findViewById(R.id.btn_update);
        MaterialButton btn_cancel = (MaterialButton) findViewById(R.id.btn_cancel);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UpdateServiceDateActivity.this,IndividualVehicleDetailActivity.class);
                startActivity(i);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UpdateServiceDateActivity.this,IndividualVehicleDetailActivity.class);
                startActivity(i);
            }
        });
    }
}
