package com.kodewala.polymorphism2;

class Payment {

    void pay(double amount) {
        System.out.println("Processing payment: " + amount);
    }
}

class UpiPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

class CardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Card");
    }
}

class NetBanking extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Net Banking");
    }
}

