package com.kodewala.object;

class AccountMgmt {

    public AccountMgmt() {
        System.out.println("AccountMgmt.AccountMgmt()......");
    }
}

public class Account extends AccountMgmt {

    String accountNumber;

    // Instance Initialization Block (IIB)
    // Executes whenever an object is created
    {
        System.out.println("Account IIB");
    }

    public Account(String accountNumber) {
        super();

        // The IIB executes before the constructor body
        System.out.println("Account(String accountNumber)");

        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        Account account = new Account("ACC101");

        System.out.println("Account Number: " + account.accountNumber);
    }
}