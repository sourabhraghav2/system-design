package com.model;

import com.model.enumeration.BikeType;

import java.util.Map;
import java.util.Set;

public abstract class Inventory implements UserTransactions, Searchable, AdminTransaction {
    Set<Reservation> reservationList;
    Set<Bike> bookedVehicleList;
    Map<BikeStandLocation, Set<Bike>> locationVehicleMap;
    Map<BikeType, Set<Bike>> typeVehicleMap;
    LogTransaction logger;
}
