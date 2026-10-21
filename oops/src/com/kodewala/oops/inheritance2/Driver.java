package com.kodewala.oops.inheritance2;

public class Driver {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
        Bike b = new Bike();
        b.start();
        b.ride();
    }
}