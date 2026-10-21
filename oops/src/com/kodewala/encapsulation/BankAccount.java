package com.kodewala.encapsulation;

class BankAccount {
    // Private attributes: direct access is restricted
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, String accNo, double balance) {
        this.accountHolderName = name;
        this.accountNumber = accNo;

        if (balance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative."
            );
        }

        this.balance = balance;
    }

    // Read-only access to account details
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Other classes can read the balance
    public double getBalance() {
        return balance;
    }

    // Controlled fund transfer
    public boolean transferFund(BankAccount receiver,
                                double amount) {

        // Amount is a local variable (method parameter)
        if (receiver == null) {
            System.out.println("Invalid receiver account.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return false;
        }

        if (amount > this.balance) {
            System.out.println("Insufficient balance.");
            return false;
        }

        if (receiver == this) {
            System.out.println("Cannot transfer to the same account.");
            return false;
        }

        // Update balances only after validation
        this.balance -= amount;
        receiver.balance += amount;

        System.out.println("Fund transfer successful.");
        System.out.println("Transferred Amount: Rs. " + amount);

        return true;
    }
}

