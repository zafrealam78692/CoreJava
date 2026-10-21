package com.kodwala.string3;

class user
{
	String firstname;

	public user(String firstname) {
		super();
		this.firstname = firstname;
	}
}
public class Driver{

	public static void main(String[] args) {

 String city1="Bangalore";
 String city2="Bangalore";
 String city3="Bangalore"; 
 String city4="Bangalore";
 String city5="Bangalore";
 System.out.println(city1 == city2);
 System.out.println(city1.equals(city2));
 
 user user1 =new user("kodewala");
 user user2 =new user("kodewala");
  System.out.println(user1.equals(user2));
		 
 
	}

}

