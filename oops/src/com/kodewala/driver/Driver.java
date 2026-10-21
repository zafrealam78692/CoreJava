package com.kodewala.driver;

import com.kodewala.oops.Payments;

public class Driver {

	public static void main(String[] args) {
		
		Payments payment=new Payments(200000);
		payment.doCredit(400);
		System.out.println(payment.getBalance());
		

	}

}
