package com.model;

import com.model.enumeration.BikeType;

import java.util.Set;

public interface Searchable {
    public Set<Bike> searchByType(BikeType type);

    public Set<Bike> searchByLocation(BikeStandLocation location);
}
