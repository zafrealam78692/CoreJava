package com.kodewala.constructor2;


class BankAccount {
    String customerName;
    long accountNumber;
    double balance;
    String city;

    // Constructor
    BankAccount(String customerName, long accountNumber,
                double balance,String city) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.city=city;
        
    }

    void displayAccount() {
        System.out.println("Customer: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("city:     " + city);
        
    }
}


