package com.example.minor2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainDashboard extends AppCompatActivity {

    TextView view_all, my_car, home,booking,history,profile, total_km, last_servicing, fuel_refill ;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        view_all =(TextView)findViewById(R.id.viewAll);
        my_car = (TextView) findViewById(R.id.my_car);
        booking = (TextView) findViewById(R.id.booking);
        history = (TextView) findViewById(R.id.history);
        profile = (TextView) findViewById(R.id.profile);
        home = (TextView) findViewById(R.id.home);


        my_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainDashboard.this,MyVehicleActivity.class);
                startActivity(i);
            }
        });


        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainDashboard.this,VehicleBookingInfoActivity.class);
                startActivity(i);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainDashboard.this,ServicesActivity.class);
                startActivity(i);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainDashboard.this,UserProfileActivity.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainDashboard.this,MainDashboard.class);
                startActivity(i);
            }
        });

        view_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainDashboard.this,ServicesActivity.class);
                startActivity(i);
            }
        });

//        last_servicing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainDashboard.this,UpdateServiceDateActivity.class);
//                startActivity(i);
//            }
//        });

//        fuel_refill.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainDashboard.this,AddFuelRefillActivity.class);
//                startActivity(i);
//            }
//        });

    }
}
