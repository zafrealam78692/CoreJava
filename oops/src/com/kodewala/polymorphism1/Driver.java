package com.kodewala.polymorphism1;

public class Driver {
    public static void main(String[] args) {

        Subscription user;

        user = new FreeUser();
        user.watchContent();

        user = new PremiumUser();
        user.watchContent();
    }
}
