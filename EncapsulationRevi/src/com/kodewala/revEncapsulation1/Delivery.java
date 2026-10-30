package com.kodewala.revEncapsulation1;

public class Delivery 
{
public void doDeliver()
{
	System.out.println("Delivery.doDelivey()......Delivery");
}
}
class ExpressBee extends Delivery
{
	@Override
	public void doDeliver()
	{
		System.out.println("ExpressBee.doDeliver().....ExpressBee");
	}
}
class Ekart extends Delivery
{
	@Override
	public void doDeliver()
	{
		System.out.println("Ekart.doDeliver().....Ekart");
	
	}
 }





