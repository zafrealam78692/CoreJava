package com.kodewala.oops.inheritance;

public class Driver {

    public static void main(String[] args) {

        Manager m = new Manager(
            101, "Zafre", 100000, "IT"
        );

        System.out.println("--- Manager Details ---");

        m.displayDetails();
        m.displayDepartment();
    }
}