package com.kodewala.String4;
class user
{
	String firstname;

	public user(String firstname) {
		super();
		this.firstname = firstname;
	}
}
public class Driver4{

	public static void main(String[] args) {
    String name1="saajan";
    String name2="saajan";
    String name3="saajan"; 
    String name4="saajan";
    String name5="saajan";
 System.out.println(name1 == name2);
 System.out.println(name1.equals(name2));
 user user1 =new user("kodewala");
 user user2 =new user("kodewala");
  System.out.println(user1.equals(user2));
		
	}
}
