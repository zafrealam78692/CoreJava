package com.kodewala.oops;

public class Payments {

	public int balance;

	public Payments(int balance) {
		super();
		this.balance = balance;
	}
	//setter

	public void doDebit(int _amount) {
		//modifying balance
		 balance=balance - _amount;
	}

	public void doCredit(int _amount) {
		if(_amount>0) {
			
		//modifying the data
		 balance=balance + _amount;
	}
	}
	
	public int getBalance() {
		return balance;
	}
}


