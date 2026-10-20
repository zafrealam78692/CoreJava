package com.kodewala.constructor2;

public class Driver {
    public static void main(String[] args) {
        BankAccount a1 =
            new BankAccount("zafre", 123456789L, 5000,"London");

        BankAccount a2 =
            new BankAccount("Aadi", 987654321L, 10000,"Paris");
        
        BankAccount a3 =
                new BankAccount("Mantasa", 887124321L, 60000,"Mau");
        

        a1.displayAccount();
        System.out.println("---------------");
        a2.displayAccount();
        System.out.println("---------------");
        
        a3.displayAccount();
        
    }
}