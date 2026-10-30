package com.kodewala.revEncapsulation;

public class Driver {

	public static void main(String[] args) {
	 Account acc = new Account();
	 acc.credit();
	 acc.balance(12000);
	 System.out.println("balance " +acc.checkBalance());
		

	}

}
