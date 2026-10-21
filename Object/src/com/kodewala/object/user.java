package com.kodewala.object;

public class user {
	
	String userName;
	String userId;
	String mobileNmuber;
	
	//static block will get executed just after class loading
	static
	{
		System.out.println("i am in static init block");
	}
	public user(String userName, String userId, String mobileNmuber) {
		super();//either super or this
		System.out.println("User.user(String userName,String userId,String mobileNumber)....constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNmuber = mobileNmuber;
	}
	

}
