package com.kodewala.polymorphism12;

public class Employee {

	public void markln() {
		System.out.println("Employee.markln()..........Employee markin IN");
	}
	}
 class HRManager extends Employee{
	 @Override
	 public void markln() 
	 {
		 System.out.println("HRManagar.markln().......HRManager marking IN");
	 
	 }
 }
 