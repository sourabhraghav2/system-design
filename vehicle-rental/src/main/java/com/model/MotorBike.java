package com.model;

public class MotorBike extends Bike {
    @Override
    public Integer estimatePrice(Integer km) {
        return super.mileage * km;
    }
}
