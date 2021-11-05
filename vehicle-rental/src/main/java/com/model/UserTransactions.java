package com.model;

public interface UserTransactions {
    public boolean bookBike(Bike bike);
    public boolean checkoutBike(Bike bike);
    public boolean returnBike(Bike bike);
}
