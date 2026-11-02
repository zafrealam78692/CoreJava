package com.kodewala.interface3;

public class CreditCardPayment implements Payment{

	@Override
	public void makePayment(double amount) {

		 System.out.println("Payment using Credit Card");
	        System.out.println("Amount: " + amount);
	        System.out.println("Credit Card Payment Successful");
		
	}

}
