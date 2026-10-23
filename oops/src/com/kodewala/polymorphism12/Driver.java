package com.kodewala.polymorphism12;

public class Driver {

    public static void main(String[] args) {

        Employee e2 = new HRManager();

        e2.markln();

        System.out.println(e2.hashCode());
    }
}