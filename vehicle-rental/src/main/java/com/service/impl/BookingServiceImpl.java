package com.service.impl;

import com.model.Bike;
import com.service.BookingService;
import com.repo.UserRepo;

public class BookingServiceImpl implements BookingService {
    private UserRepo userMap;

    @Override
    public boolean bookBike(Bike bike, String customerId) {return false;}

    @Override
    public boolean checkoutBike(Bike bike, String notificationId) {return false;}

    @Override
    public boolean returnBike(Bike bike) {return false;}
}
