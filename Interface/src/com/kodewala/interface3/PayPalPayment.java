package com.kodewala.interface3;

public class PayPalPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment using PayPal");
        System.out.println("Amount: " + amount);
        System.out.println("PayPal Payment Successful");
		
	}

}
