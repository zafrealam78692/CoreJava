package com.kodewala.revEncapsulation1;

public class Driver {
	 public static void main(String[] args) {
		 
		 Delivery delivery=(Delivery) new ExpressBee();
		 delivery.doDeliver();
		 Delivery del=new ExpressBee();
		 ExpressBee expressBee=(ExpressBee)del;
		 expressBee.doDeliver();
	 }
	 }