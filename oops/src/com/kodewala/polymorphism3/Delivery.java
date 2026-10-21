package com.kodewala.polymorphism3;


class Delivery {
    void deliver() {
        System.out.println("Normal delivery in 7 days");
    }
}

class StandardDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivery in 5 days");
    }
}

class ExpressDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivery in 1 day");
    }
}


