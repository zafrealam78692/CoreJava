package com.kodewala.Payment;

public class PhonePay implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment through PhonePay: " + amount
        );
    }

    @Override
    public void refund(double amount) {

        System.out.println(
            "PhonePe refund: " + amount
        );
    }
}