package com.suwadith.oop;

public abstract class Vehicle {

    private String brand;

    public Vehicle() {
        this.brand = "unknown";
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void startTheEngine();
}
