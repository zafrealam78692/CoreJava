package com.kodewala.trainBookingProj;


public class Booking {

    int bookingId;
    String passengerName;
    String trainName;
    String status;

    public Booking(int bookingId,
                   String passengerName,
                   String trainName,
                   String status) {

        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.status = status;
    }

    public void displayBooking() {

        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Train: " + trainName);
        System.out.println("Status: " + status);
    }
}
