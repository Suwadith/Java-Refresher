package com.suwadith.oop;

public class Van extends Vehicle {

    private int seats;

    public Van(String brand) {
        super(brand);
    }

    public Van(String brand, int seats) {
        super(brand);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void startTheEngine() {
        System.out.println("Starting " + getBrand() + " with" + getSeats() + " seats");
    }

}
