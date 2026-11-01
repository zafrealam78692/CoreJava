package com.kodewala.Payment;


public class Paytm implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment through Paytm: " + amount
        );
    }

    @Override
    public void refund(double amount) {

        System.out.println(
            "Paytm refund: " + amount
        );
    }
}