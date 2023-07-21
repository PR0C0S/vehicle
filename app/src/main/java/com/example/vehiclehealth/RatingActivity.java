package com.example.minor2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RatingActivity extends AppCompatActivity implements View.OnClickListener{

    RatingBar rating_bar;
    MaterialButton rate, cancel;
    

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        
        rating_bar = (RatingBar)findViewById(R.id.rating_bar);
        rate = (MaterialButton) findViewById(R.id.btn_rate);
        cancel = (MaterialButton) findViewById(R.id.btn_cancel);

        rate.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (v == rate)
            rating();
        if(v == cancel)
            startActivity(new Intent(this, MainDashboard.class));
    }

    private void rating() {
        String rating=String.valueOf(rating_bar.getRating());
        Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,RatingAcknowledgementActivity.class);
        startActivity(i);
    }
}
