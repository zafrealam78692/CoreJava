package com.kodewala.encapsulation;

public class Driver {

    public static void main(String[] args) {

        BankAccount sender =
            new BankAccount("SAAJAN", "ACC101", 10000);

        BankAccount receiver =
            new BankAccount("Amit", "ACC102", 5000);

        System.out.println("Sender: " +
                           sender.getAccountHolderName());

        System.out.println("Sender Balance: Rs. " +
                           sender.getBalance());

        System.out.println("\n--- Fund Transfer ---");

        sender.transferFund(receiver, 3000);

        System.out.println("\n--- Updated Balances ---");

        System.out.println("Sender Balance: Rs. " +
                           sender.getBalance());

        System.out.println("Receiver Balance: Rs. " +
                           receiver.getBalance());
    }
}

