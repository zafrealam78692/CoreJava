package com.kodewala.abstraction3;

abstract class PaymentService {

    // Public method exposed to other classes
    public void makePayment(String accountNumber, double amount) {

        if (validatePayment(accountNumber, amount)) {
            processTransaction(amount);
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed: Invalid payment details.");
        }
    }

    // Hidden core functionalities

    private boolean validatePayment(String accountNumber, double amount) {
        System.out.println("Validating payment details...");

        return accountNumber != null
                && !accountNumber.isEmpty()
                && amount > 0;
    }

    private void processTransaction(double amount) {
        System.out.println("Processing transaction of Rs. " + amount);
        System.out.println("Transaction completed.");
    }
}

// Other classes use only the public method
class Customer {

    public void payBill() {
        PaymentService payment = new PaymentService() {};

        payment.makePayment("ACC12345", 25000.00);
    }
}


