package com.kodewala.trainBookingProj;

public interface IBooking {
    // Abstract methods
    public abstract Booking book();

    public abstract void cancelBooking();

    public abstract Booking checkStatus();

    public abstract SearchResult search();

    // Default method (Java 8)
    public default void autoUpgrade() {

        System.out.println("Auto upgrade feature...");
    }

    // Static method (Java 8)
    public static void printTicket(
            String path, String contents) {

        System.out.println("Printing ticket...");
        System.out.println(contents);
    }
}
