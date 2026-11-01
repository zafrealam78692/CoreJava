package com.kodewala.trainBookingProj;


public class SearchResult {

    String trainName;
    String source;
    String destination;
    double fare;

    public SearchResult(String trainName,
                        String source,
                        String destination,
                        double fare) {

        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    public void displaySearchResult() {

        System.out.println("Train: " + trainName);
        System.out.println("From: " + source);
        System.out.println("To: " + destination);
        System.out.println("Fare: " + fare);
    }
}
