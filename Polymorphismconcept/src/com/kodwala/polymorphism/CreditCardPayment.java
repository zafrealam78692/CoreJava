package com.kodwala.polymorphism;

public class CreditCardPayment  extends Payment
{
	@Override
	 public void doPayment()
	   {
		   System.out.println("CreditCardPayment.doPayment()....... CreditCardPayment ");
	   }
}

