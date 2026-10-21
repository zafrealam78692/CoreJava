package com.kodewala.String7;

public class Driver7 {

	public static void main(String[] args) {
	
		//String s1="this"+" is from "+ " kodewala academy Bangalore";
		
		 String s1="this is from kodewala academy bangalore";
		 
		 System.out.println(s1);
		 
		 String s2="Kodwala";//Scp area 
		 
		 String s3="Academy";//scp area 
		 
		 String s4=s2+s3;//heap---->new string builder 
		 System.out.println(s4);
		 
		 String s5 ="KodewalaAcademy";//scp
		 System.out.println(s5==s4.intern());//false
		 
		 
	}

}
