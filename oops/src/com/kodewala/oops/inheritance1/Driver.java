package com.kodewala.oops.inheritance1;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount account =
            new SavingsAccount("Saajan", 1000001,"Maghar");

        account.displayBalance();
        account.displayInterestRate();
        
    }
}
