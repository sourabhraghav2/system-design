package com.model;

import com.model.enumeration.BikeStatus;

import java.util.List;

public abstract class Bike {
    protected String vehicleNumber;
    protected Integer capacity;
    protected BikeStatus status;
    protected List<Accessories> accessories;
    protected Integer mileage;
    protected BikeStandLocation location;
    abstract public Integer estimatePrice(Integer km);
}
