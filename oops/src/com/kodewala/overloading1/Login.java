package com.kodewala.overloading1;

public class Login {

	public void doLogin(String mobole,int otp)
	{
		System.out.println("Login.DoLogin(string mobole ,int otp)");
	}
	public String doLogin(String email,String password)
	{
		System.out.println("Login.doLogin(string email,string password)");
		return"some value";

	}
	public void doLogin(String gmail)
	{
		System.out.println("Login.doLogin(string mail)");
	}
}
