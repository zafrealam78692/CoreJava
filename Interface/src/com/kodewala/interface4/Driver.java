package com.kodewala.interface4;

public class Driver  {

	
	
	public static void main(String[] args) {
		
		IAccount account = (name, add,amt) -> 
		{
			System.out.println(" Opening Account... for "+name);
			
			return "Account Opened";
		};
		
		String result = account.openAccount("Kodewala", "BTM Bangalore", 1000);

	}

}
