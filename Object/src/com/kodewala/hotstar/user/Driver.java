package com.kodewala.hotstar.user;

public class Driver {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            User user = new User("guest", "free");
        }

        // Other user examples
        // User u1 = new User("guest", "free");
        // User u2 = new User("guest", "free");
        // User u3 = new User("guest", "free");

        // User u4 = new User("Kodewala", "kw123", "paid");
        // User u5 = new User("KodewalaAcademy", "kw123456", "paid");

        System.out.println("Total live users are: " + User.liveUserCounts);
    }
}
