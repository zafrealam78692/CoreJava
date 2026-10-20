package com.kodewala.array;

public class Driver {
    public static void main(String[] args) {

        // Create customer objects
        Customer[] customers = {
            new Customer("Zafre", 1500, "9876543210"),
            new Customer("Alam", 5000, "9876543211"),
            new Customer("Saajan", 1800, "9876543212"),
            new Customer("Zaheer", 2500, "9876543213"),
            new Customer("Shams", 1000, "9876543214")
        };

        System.out.println("Customers with balance less than Rs. 2000:");
        System.out.println("-------------------------------------------");

        // Explore the for loop
        for (int i = 0; i < customers.length; i++) {

            if (customers[i].accountBalance < 2000) {
                System.out.println(
                    "Customer Name: " + customers[i].customerName
                );

                System.out.println(
                    "Account Balance: Rs. "
                    + customers[i].accountBalance
                );

                System.out.println();
            }
        }
    }
}
