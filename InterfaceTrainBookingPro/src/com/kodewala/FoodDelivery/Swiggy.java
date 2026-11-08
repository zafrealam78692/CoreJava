package com.kodewala.FoodDelivery;

public class Swiggy implements FoodDelivery {

	@Override
	public void orderFood(String food) {
		
	    System.out.println("Swiggy ordered: " + food);
	}

	@Override
	public void trackOrder() {
		 System.out.println("Swiggy order is being delivered");
		
	}

}
