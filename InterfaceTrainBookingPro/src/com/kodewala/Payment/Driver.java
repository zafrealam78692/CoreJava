package com.kodewala.Payment;

public class Driver {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        Payment p1 = new GooglePay();
        service.makePayment(p1, 50000);

        Payment p2 = new PhonePay();
        service.makePayment(p2, 30000);

        Payment p3 = new Paytm();
        service.makePayment(p3, 20000);

    }
}