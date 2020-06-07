package com.suwadith.oop;

public class Main {

    public static void main(String[] args) {
        User bob = new User("bobby");
        User george = new User("gijoe7");

        //Regular usage of getters. (Encapsulation)
        System.out.println(bob.getUsername());
        System.out.println(george.getUsername());

        //Inheritance
        Student jill = new Student("jill265", "Senior");
        System.out.println(jill.getUsername());
        System.out.println(jill.getCurrentClass());

        //Won't work because of abstraction. can be used when extended and used through a child object.
        //Vehicle vh1 = new Vehicle("BMW");

        //Abstraction
        Car bm3 = new Car("BMW", "M3");
        System.out.println(bm3.getBrand());
        System.out.println(bm3.getSeries());


        Car mcf1 = new Car("McLaren", "F1");
        Car tesr = new Car("Tesla", "Roadster");

        Van mitsulan = new Van("Mitsubishi", 4);

        mcf1.startTheEngine();

        Car[] cars = new Car[]{bm3, mcf1, tesr};

//        System.out.println(cars[0].getSeries());

        for(Car car: cars) {
            System.out.println(car.getBrand() + " - " + car.getSeries());
        }

        for(int i =0; i<cars.length; i++) {
            System.out.println(cars[i].getBrand() + " - " + cars[i].getSeries());
        }


        //Polymorphism
        Vehicle[] vehicles = new Vehicle[]{bm3, mcf1, tesr, mitsulan};

        for(Vehicle vehicle: vehicles) {
            displayVehicleType(vehicle);
        }

    }

    public static void displayVehicleType(Vehicle vehicle) {
        if(vehicle instanceof Van) {
            System.out.println(vehicle.getBrand() + " has " + ((Van) vehicle).getSeats() + " seats. And it's a Van.");
        }
    }

}
