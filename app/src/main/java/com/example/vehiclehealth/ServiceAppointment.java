package com.example.minor2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class ServiceAppointment extends AppCompatActivity {

    String[] type ={"Regular Maintenance", "Flat Tyre", "Battery Replacement", "Car Oil Change","Tinting Mirror","Car Suspension","Brake Inspection","Car AC Inspection","Check Spark Plugs","Car Transmission"};

    AutoCompleteTextView serviceType;

    ArrayAdapter<String> adapterItem;

    MaterialButton btn_confirm, btn_cancel;
    TextView service_rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_appointment);

        serviceType = findViewById(R.id.serviceType);
        adapterItem = new ArrayAdapter<String>(this,R.layout.list_services,type);

        serviceType.setAdapter(adapterItem);


        btn_cancel =(MaterialButton) findViewById(R.id.btn_cancel);
        btn_confirm =(MaterialButton) findViewById(R.id.btn_confirm);

        service_rate= (TextView) findViewById(R.id.service_rate);

        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceAppointment.this, KhaltiTry.class);
                startActivity(i);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceAppointment.this,VehicleBookingInfoActivity.class);
                startActivity(i);
            }
        });

    }
}
