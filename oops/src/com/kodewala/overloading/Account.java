package com.kodewala.overloading;

public class Account {
	
	int miniBalance =10000;
	
	public String openAccount(String name, int initbalance)
	
	{
		System.out.println("Account .openAccount()..........");
		return "some string";
		
	}

}
class savingAccount extends Account
{
	@Override
	public String openAccount(String name,int initBal)
	{
		System.out.println("Saving account ..open account().....");
		return "some other things";
	}
}
class RecurringAccount extends savingAccount {

    @Override
    public String openAccount(String name, int initBal) {
        System.out.println("RecurringAccount.openAccount() called");
		return "do some other";
        
    }
}