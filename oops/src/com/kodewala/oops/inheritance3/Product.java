package com.kodewala.oops.inheritance3;

class Product {

    int productId;
    String productName;
    double price;

    // Parent class constructor
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Parent class method
    void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}

// Child class
class ElectronicProduct extends Product {

    int warrantyPeriod;

    // Child class constructor
    ElectronicProduct(int productId, String productName,
                      double price, int warrantyPeriod) {

        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Display all details
    void displayAllDetails() {
        displayProductDetails();
        System.out.println("Warranty Period: "
                           + warrantyPeriod + " years");
    }
}


