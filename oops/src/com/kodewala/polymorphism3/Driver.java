package com.kodewala.polymorphism3;

public class Driver {
    public static void main(String[] args) {
        Delivery d;

        d = new Delivery();
        d.deliver();
        
        d = new StandardDelivery();
        d.deliver();

        d = new ExpressDelivery();
        d.deliver();
    }
}
