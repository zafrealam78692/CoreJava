package com.kodewala.oops.inheritance2;


class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}


