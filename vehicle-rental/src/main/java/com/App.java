package com;

import com.repo.BikeRepo;
import com.service.impl.BikeRepoImplementation;

public class App {
    BikeRepo inventory;

    public App() {
        inventory = new BikeRepoImplementation();
    }

    public static void main(String[] args) {


    }
}