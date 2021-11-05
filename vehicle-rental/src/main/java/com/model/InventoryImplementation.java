package com.model;

import com.model.enumeration.BikeType;

import java.util.Set;

public class InventoryImplementation extends Inventory {
    @Override
    public boolean addBike(Bike bike) {
        return false;
    }

    @Override
    public boolean removeBike(Bike bike) {
        return false;
    }

    @Override
    public Set<Bike> searchByType(BikeType type) {
        return null;
    }

    @Override
    public Set<Bike> searchByLocation(BikeStandLocation location) {
        return null;
    }

    @Override
    public boolean bookBike(Bike bike) {
        return false;
    }

    @Override
    public boolean checkoutBike(Bike bike) {
        return false;
    }

    @Override
    public boolean returnBike(Bike bike) {
        return false;
    }
}
