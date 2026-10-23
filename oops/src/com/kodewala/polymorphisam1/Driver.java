package com.kodewala.polymorphisam1;

{
	
}

public class Driver {

	public static void main(String[] args) {
		
		User u1= new User();//user class is referring user class objec
		AdminUser au1=new AdminUser();//parent class can refer child object---.auto up casting
		Object au3=new FinanceUser();
		AdminUser au=(AdminUser) new User();//child class referring to parent class object--> down casting
		
	

	}

}
