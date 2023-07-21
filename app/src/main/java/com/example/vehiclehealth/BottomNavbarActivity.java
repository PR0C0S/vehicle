package com.example.minor2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomNavbarActivity extends AppCompatActivity {

    TextView my_car, home,booking,history,profile ;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navbar);

        my_car = (TextView) findViewById(R.id.my_car);
        booking = (TextView) findViewById(R.id.booking);
        history = (TextView) findViewById(R.id.history);
        profile = (TextView) findViewById(R.id.profile);
        home = (TextView) findViewById(R.id.home);

        //admin and admin

        my_car.setOnClickListener(new View.OnClickListener() {
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

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,ServicesActivity.class);
                startActivity(i);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,UserProfileActivity.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BottomNavbarActivity.this,MainDashboard.class);
                startActivity(i);
            }
        });

    }
}
