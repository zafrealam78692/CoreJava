package com.kodewala.oops.inheritance3;

public class Driver {

    public static void main(String[] args) {

        ElectronicProduct e = new ElectronicProduct(
            101, "Laptop", 55000.0, 3
        );

        System.out.println("--- Electronic Product Details with warantee---");
        e.displayAllDetails();
    }
}
