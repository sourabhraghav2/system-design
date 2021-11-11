package com.model.user;

import com.model.Bike;

public class Admin extends User {

    public boolean addOtherAdmin(User user) {
        return false;
    }
    public boolean addBike(Bike bike) {
        return false;
    }
    public boolean removeBike(Bike bike) {
        return false;
    }
}
