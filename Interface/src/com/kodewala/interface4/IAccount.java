package com.kodewala.interface4;

@FunctionalInterface
public interface IAccount 
{

	String openAccount(String name, String address, int balance); // Only one abstract method - SAM + one abstract method from IAccountMgmt

	
}

