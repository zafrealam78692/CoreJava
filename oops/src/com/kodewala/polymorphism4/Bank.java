package com.kodewala.polymorphism4;


class Bank {

    // Transfer using account number
    void transferMoney(long accountNumber) {
        System.out.println(
            "Transfer initiated to account: " + accountNumber
        );
    }

    // Transfer using account number and amount
    void transferMoney(long accountNumber, double amount) {
        System.out.println(
            "Transferred Rs. " + amount +
            " to account: " + accountNumber
        );
    }

    // Transfer using UPI ID and amount
    void transferMoney(String upiId, double amount) {
        System.out.println(
            "Transferred Rs. " + amount +
            " to UPI ID: " + upiId
        );
    }
}


