package com.kodewala.trainBookingProj;

public class TrainBooking implements IBooking {

    Booking booking;
    // Implement book() method
    @Override
    public Booking book() {

        System.out.println("Train booking successful!");

        booking = new Booking(
            101,
            "Zafre Alam",
            "Rajdhani Express",
            "CONFIRMED"
        );

        return booking;
    }

    // Implement cancelBooking() method
    @Override
    public void cancelBooking() {

        System.out.println("Train booking cancelled!");

        if (booking != null) {
            booking.status = "CANCELLED";
        }
    }

    // Implement checkStatus() method
    @Override
    public Booking checkStatus() {

        System.out.println("Checking booking status...");

        return booking;
    }

    // Implement search() method
    @Override
    public SearchResult search() {

        System.out.println("Searching trains...");

        SearchResult result = new SearchResult(
            "Rajdhani Express",
            "Delhi",
            "Mumbai",
            3500.0
        );

        return result;
    }
}
