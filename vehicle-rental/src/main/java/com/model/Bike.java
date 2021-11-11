package com.model;

import com.model.accessories.Accessories;
import com.model.enumeration.BikeStatus;
import com.model.enumeration.BikeType;
import lombok.Data;

import java.util.List;
@Data
public abstract class Bike {
    protected String vehicleNumber;
    protected Integer capacity;
    protected BikeStatus status;
    protected List<Accessories> accessories;
    protected Integer mileage;
    protected BikeStandLocation location;
    protected BikeType type;

    abstract public Integer estimatePrice(Integer km);
}
