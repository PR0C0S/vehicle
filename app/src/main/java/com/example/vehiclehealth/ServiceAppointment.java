package com.example.minor2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class ServiceAppointment extends AppCompatActivity {

    String[] type ={"Regular Maintenance", "Flat Tyre", "Battery Replacement", "Car Oil Change","Tinting Mirror","Car Suspension","Brake Inspection","Car AC Inspection","Check Spark Plugs","Car Transmission"};

    AutoCompleteTextView serviceType;

    ArrayAdapter<String> adapterItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_appointment);

        serviceType = findViewById(R.id.serviceType);
        adapterItem = new ArrayAdapter<String>(this,R.layout.list_services,type);

        serviceType.setAdapter(adapterItem);

    }
}
