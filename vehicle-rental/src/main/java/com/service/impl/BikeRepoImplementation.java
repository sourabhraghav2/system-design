package com.service.impl;

import com.model.Bike;
import com.repo.BikeRepo;
import com.service.Searchable;

import java.util.List;

public class BikeRepoImplementation extends BikeRepo implements Searchable {

    @Override
    public List<Bike> findBikeByModel(String model) {return null;}

    @Override
    public List<Bike> findBikeByLocation(int longitude, int latitude) {return null;}

    @Override
    public List<Bike> findBikeBySize(int size) {return null;}
}
