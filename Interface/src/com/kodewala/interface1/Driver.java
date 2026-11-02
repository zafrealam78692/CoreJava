package com.kodewala.interface1;

public class Driver {

	public static void main(String[] args) {
		IDiscount discount=new FlightBooking();
		int result =discount.calculateDiscount(200, 20);
		System.out.println(result);
	}

}
