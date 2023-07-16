package com.example.minor2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomNavbarActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navbar);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView my_vehicle = (TextView) findViewById(R.id.my_vehicle);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView booking = (TextView) findViewById(R.id.booking);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView services = (TextView) findViewById(R.id.services);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView my_profile = (TextView) findViewById(R.id.my_profile);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) FloatingActionButton home = (FloatingActionButton) findViewById(R.id.home);
        //admin and admin

        my_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,MyVehicleActivity.class);
                startActivity(i);
            }
        });


        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,BookingActivity.class);
                startActivity(i);
            }
        });

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,ServicesActivity.class);
                startActivity(i);
            }
        });

        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,UserProfileActivity.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,DashboardActivity.class);
                startActivity(i);
            }
        });

    }
}
