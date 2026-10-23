package com.kodwala.polymorphism;

public class NetBankingPayment extends Payment 
{
	@Override
	public void doPayment() 
	{
		System.out.println("NetBankingPayment.doPayment()....... NetBankingPayment ");
	}
}
