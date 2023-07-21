package com.example.minor2;

import android.graphics.drawable.Drawable;

public class ProductModel {
    String brandModel, vehiclePlate, serviceType,date ;
    Long serviceRate;
    String serviceId;

    public ProductModel(String brandModel, String vehiclePlate, String serviceType, String date, Long serviceRate, String serviceId) {
        this.brandModel = brandModel;
        this.vehiclePlate = vehiclePlate;
        this.serviceType = serviceType;
        this.date = date;
        this.serviceRate= serviceRate;
        this.serviceId= serviceId;
    }

    public String getBrandModel() {
        return brandModel;
    }
    public String getVehiclePlate() {
        return vehiclePlate;
    }
    public String getServiceType() {
        return serviceType;
    }
    public String getDate() {
        return date;
    }
    public Long getServiceRate() {
        return serviceRate;
    }
    public String getServiceId() {
        return serviceId;
    }


}
