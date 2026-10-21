package com.kodewala.polymorphism;

public class Driver {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 50.6));
        System.out.println(c.add(10, 20, 30));
    }
}
