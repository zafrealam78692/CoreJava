package com.kodewala.interface3;

public class PaymentDriver {

	public static void main(String[] args) {
		
		Payment payment;

        payment = new CreditCardPayment();
        payment.makePayment(5000);
        
        System.out.println("------------------");

        payment = new UpiPayment();
        payment.makePayment(2000);

        System.out.println("------------------");

        payment = new PayPalPayment();
        payment.makePayment(3000);
        
        System.out.println("------------------");

        payment = new DebitCrd();
        payment.makePayment(10000);
	}

}
