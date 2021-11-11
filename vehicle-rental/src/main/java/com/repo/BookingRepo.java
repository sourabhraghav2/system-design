package com.repo;

import com.model.Booking;

import java.util.List;
import java.util.Map;

public abstract class BookingRepo  {
    protected Map<String, Booking> activeBookingList;
    protected List<Booking> completedBookingList;
}
