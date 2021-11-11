package com.service;

import com.model.Bike;

public interface InventoryService {
    public boolean addBike(Bike bike);
    public boolean removeBike(Bike bike);
}
