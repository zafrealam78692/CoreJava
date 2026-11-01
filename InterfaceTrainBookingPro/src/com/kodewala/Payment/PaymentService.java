package com.kodewala.Payment;

public class PaymentService {

    public void makePayment(Payment payment, double amount) {

        payment.pay(amount);

    }
}