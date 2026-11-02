package com.kodewala.interface3;

public class DebitCrd implements Payment {

	@Override
	public void makePayment(double amount) {
		
		System.out.println("Payment using Debit Card");
        System.out.println("Amount: " + amount);
        System.out.println("Debit Card Payment Successful");
	
	}

}
