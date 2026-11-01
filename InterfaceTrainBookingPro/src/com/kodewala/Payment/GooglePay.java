package com.kodewala.Payment;



public class GooglePay implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment through Google Pay: " + amount
        );
    }

    @Override
    public void refund(double amount) {

        System.out.println(
            "Google Pay refund: " + amount
        );
    }
}