package com.service;

import com.model.Bike;

import java.util.List;

public interface Searchable {
    List<Bike> findBikeByModel(String model);
    List<Bike> findBikeByLocation(int longitude, int latitude);
    List<Bike> findBikeBySize(int size);
}
