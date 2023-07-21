package com.example.minor2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;


public class IndividualVehicleDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_vehicle_detail);

        MaterialButton edit_btn = (MaterialButton) findViewById(R.id.btn_edit);
        MaterialButton back_btn = (MaterialButton) findViewById(R.id.btn_back);

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IndividualVehicleDetailActivity.this,UpdateServiceDateActivity.class);
                startActivity(i);
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IndividualVehicleDetailActivity.this,MyVehicleActivity.class);
                startActivity(i);
            }
        });
    }
}