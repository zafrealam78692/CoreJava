package com.kodewala.oops.inheritance1;

class BankAccount {
    String accountHolder;
    double balance;
    String city;

    BankAccount(String name, double balance,String city) {
        this.accountHolder = name;
        this.balance = balance;
        this.city=city;
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("city: "  +city);
       
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 5.0;

    SavingsAccount(String name, double balance,String city) {
        super(name, balance,city);
    }

    void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


