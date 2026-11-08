package com.kodewala.FoodDelivery;

public class Driver {
    public static void main(String[] args) {

        FoodDelivery f;

        f = new Zomato();
        f.orderFood("Pizza+Sirmal+veg manchurian");
        f.trackOrder();

        f = new Swiggy();
        f.orderFood("Burger+ chikent tikka");
        f.trackOrder();
    }
}