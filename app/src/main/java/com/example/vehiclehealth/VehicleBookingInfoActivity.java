package com.example.minor2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class VehicleBookingInfoActivity extends AppCompatActivity {

    TextView my_car, home,booking,history,profile ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_booking_info);

        TextView book1 = (TextView) findViewById(R.id.book1);

        my_car = (TextView) findViewById(R.id.my_car);
        booking = (TextView) findViewById(R.id.booking);
        history = (TextView) findViewById(R.id.history);
        profile = (TextView) findViewById(R.id.profile);
        home = (TextView) findViewById(R.id.home);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VehicleBookingInfoActivity.this,ServiceAppointment.class);
                startActivity(i);
            }
        });


        my_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VehicleBookingInfoActivity.this,MyVehicleActivity.class);
                startActivity(i);
            }
        });


        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VehicleBookingInfoActivity.this,BookingActivity.class);
                startActivity(i);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VehicleBookingInfoActivity.this,ServicesActivity.class);
                startActivity(i);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VehicleBookingInfoActivity.this,UserProfileActivity.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VehicleBookingInfoActivity.this,MainDashboard.class);
                startActivity(i);
            }
        });

    }
}