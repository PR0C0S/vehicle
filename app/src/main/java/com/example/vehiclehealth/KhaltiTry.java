package com.example.minor2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.minor2.ProductModel;
import com.example.minor2.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class KhaltiTry extends AppCompatActivity {

    RecyclerView rvProducts;
    RecyclerAdapter myAdapter;
    LinearLayoutManager layoutManager;
    List<ProductModel> myProducts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_appointment);

        rvProducts = findViewById(R.id.rv_products);
        layoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);

        rvProducts.setLayoutManager(layoutManager);

//        Drawable drawable1 =  getResources(getIdentifier("ic_product1", "drawable", getPackageName());
//        Drawable drawable1 =  getResources().getDrawable(getResources()
//                .getIdentifier("ic_product1", "drawable", getPackageName()));

        myProducts.add(new ProductModel("Hyundai Creta","Ba-10-PA-8560","Regular Maintenance","30/07/2023",1000L,"0011"));

        myAdapter = new RecyclerAdapter(this,myProducts);
        rvProducts.setAdapter(myAdapter);

    }
}