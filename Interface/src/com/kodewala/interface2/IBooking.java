package com.kodewala.interface2;

public interface IBooking {
 //what to do
	public abstract Booking book();
	public abstract void cancelBooing();
	public abstract Booking checkStatus();
	SreachResult serach();
	
	//optonal ---2020
	public default void autoUpgarde()// to same of the classes
	{
		//500 lines (cheking status,connecting with database (25 lines),upgrade)
		connecttoDB();
		System.out.println("IBooking.autoUpgrade()........");
	}
	
	//Optional----2020
	public default void sendNotification()//to some of the classes
	{
		//200 lines (connecting with the database(25 loines),get user details and send notififcation)
		connecttoDB();
		System.out.println("IBooking.sendNotification()................");
	}
	private static void connecttoDB()
	{
		System.out.println("IBooking.connectDB()");
	}
	
	// common or utility method
	public static void printTicket(String path, String contents )
	{
		//200 lines ...->printing the ticket
		System.out.println("printing ticket ...ststic method....");
	}
}
