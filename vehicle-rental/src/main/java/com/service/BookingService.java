package com.service;

import com.model.Bike;


public interface BookingService {
    public boolean bookBike(Bike bike, String customerId);
    public boolean checkoutBike(Bike bike, String notificationId);
    public boolean returnBike(Bike bike);
}
