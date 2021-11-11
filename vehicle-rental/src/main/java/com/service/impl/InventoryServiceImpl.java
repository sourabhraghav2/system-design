
package com.service.impl;

import com.model.Bike;
import com.service.InventoryService;
import com.repo.UserRepo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    UserRepo userRepo;

    @Override
    public boolean addBike(Bike bike) {
        return false;
    }

    @Override
    public boolean removeBike(Bike bike) {
        return false;
    }
}
