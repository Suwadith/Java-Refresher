package com.suwadith.oop;

public class Car extends Vehicle {

    private String series;

    public Car(String brand) {
        super(brand);
    }

    public Car(String brand, String series) {
        super(brand);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public void startTheEngine() {
        System.out.println("Starting " + getBrand() + " " + getSeries() + "'s Engine");
    }
}
