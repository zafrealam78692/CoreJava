package com.kodewala.trainBookingProj;

public class Driver {
    public static void main(String[] args) {

        // Creating object
        IBooking booking = new TrainBooking();

        // Search train
        SearchResult result = booking.search();
        result.displaySearchResult();

        System.out.println("----------------");

        // Book train
        Booking b = booking.book();
        b.displayBooking();

        System.out.println("----------------");

        // Check booking status
        Booking status = booking.checkStatus();
        status.displayBooking();

        System.out.println("----------------");

        // Default method
        booking.autoUpgrade();

        System.out.println("----------------");

        // Static method
        IBooking.printTicket(
            "D:/ticket.pdf",
            "Rajdhani Express Ticket"
        );

        System.out.println("----------------");

        // Cancel booking
        booking.cancelBooking();

        // Check status again
        booking.checkStatus().displayBooking();
    }
}
