package com.kodewala.polymorphism4;

public class Driver {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.transferMoney(33134688513L);
        bank.transferMoney(33134688513L, 5000);
        bank.transferMoney("zafar@upi", 2000);
    }
}