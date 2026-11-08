package com.kodewala.FoodDelivery;

public class Zomato implements FoodDelivery{

	@Override
	public void orderFood(String food) {
		 System.out.println("Zomato ordered: " + food);
	}

	@Override
	public void trackOrder() {
		 System.out.println("Zomato order is on the way");
    }
	}

