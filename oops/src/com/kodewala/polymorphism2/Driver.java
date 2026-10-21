package com.kodewala.polymorphism2;
public class Driver {
    public static void main(String[] args) {

        Payment payment;

        payment = new UpiPayment();
        payment.pay(1500);

        payment = new CardPayment();
        payment.pay(12500);
        
        
            payment = new NetBanking();
            payment.pay(1000);
        
        
    }
   
}
