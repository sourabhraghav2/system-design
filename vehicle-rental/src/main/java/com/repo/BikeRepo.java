package com.repo;

import com.model.*;
import com.model.enumeration.BikeType;


import java.util.List;
import java.util.Map;

import com.common.logger.*;


public abstract class BikeRepo {
    public Map<BikeStandLocation, Map<BikeType, List<Bike>>> locationVehicleMap;
    public Log logger;
}
