package com.kodewala.polymorphism1;


class Subscription {

    void watchContent() {
        System.out.println("Watching standard content");
    }
}

class FreeUser extends Subscription {

    @Override
    void watchContent() {
        System.out.println("Watching free content with ads");
    }
}

class PremiumUser extends Subscription {

    @Override
    void watchContent() {
        System.out.println("Watching premium content");
    }
}


