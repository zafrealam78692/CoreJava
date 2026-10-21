package com.kodewala.oops.inheritance4;

public class Driver {

    public static void main(String[] args) {

        HealthInsurance h = new HealthInsurance(
            101, "Rahul Sharma", 12000, 500000, 2
        );

        System.out.println("--- Health Insurance Details ---");
        h.displayHealthInsuranceDetails();
    }
}