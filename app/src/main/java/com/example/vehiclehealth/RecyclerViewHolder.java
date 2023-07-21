package com.example.minor2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView service_rate,date,serviceType,number_plate,brandModel;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        service_rate=itemView.findViewById(R.id.service_rate);
        date=itemView.findViewById(R.id.date);
        serviceType=itemView.findViewById(R.id.serviceType);
        number_plate=itemView.findViewById(R.id.number_plate);
        brandModel=itemView.findViewById(R.id.brandModel);
    }
}
