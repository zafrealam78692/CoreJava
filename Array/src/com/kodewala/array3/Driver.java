package com.kodewala.array3;

public class Driver {
    public static void main(String[] args) {
        User[] users = {
            new User("Rahul", "Free","kld"),
            new User("Amit", "Premium","gkp"),
            new User("Priya", "Premium","mau"),
            new User("Neha", "Free","surat"),
            new User ("zafar","Premium","Maghar"),
        };

        int count = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i].plan.equals("Premium")) {
                count++;
            }
        }

        System.out.println("Total Premium users: " + count);
    }
}
