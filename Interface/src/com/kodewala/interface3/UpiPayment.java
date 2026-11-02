package com.kodewala.interface3;

public class UpiPayment implements Payment{

	@Override
	public void makePayment(double amount) {
		   System.out.println("Payment using UPI");
	        System.out.println("Amount: " + amount);
	        System.out.println("UPI Payment Successful");

		
	}

}
