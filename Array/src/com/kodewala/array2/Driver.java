package com.kodewala.array2;

public class Driver {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Mouse", 300),
            new Product("Keyboard", 800),
            new Product("Laptop", 55000),
            new Product("USB Cable", 150),
            new Product("Mobile charger",400),
        };

        for (int i = 0; i < products.length; i++) {
            if (products[i].price < 5000) {
                System.out.println(products[i].name +
                    " : Rs. " + products[i].price);
            }
        }
    }
}
