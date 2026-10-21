package com.kodewala.string5;
public class Driver5 {

	public static void main(String[] args) {
		
		String s1="Kodewala";
		String s2=new String("Academy");
		System.out.println(s1==s2);
		
		String s3=new String("Kodewala");
		String s4=new String("Kodewala");
         System.out.println(s1==s3);
		System.out.println(s4 == s3);
		System.out.println(s4.equals(s3));	
		
	}
}
