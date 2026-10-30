package com.kodewala.revEncapsulation;

public class Account {
	private int balance;
	//this method will modify the balance
	public void credit()
	{
		//chek the balance trasfer
		checkBalance();
		//chek the pin of sender
		validatePin("tshgt92");
		//debit the amount
		//credit the amount
		System.out.println("Account.credit().....doing fund transfer");
	}

	int checkBalance()
	{
		System.out.println("Account.checkBalance()");
		return 3000;
	}
	private boolean validatePin(String userId)
	{
		System.out.println("Account.validatePin()....");
		return true;
	}

	public void balance(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
