package com.model;

public abstract class LogTransaction {
    abstract public String viewLogForVehicle(String bikeId);
    abstract public String updateLogForVehicle(String bikeId);
    abstract public String viewAll();
}
