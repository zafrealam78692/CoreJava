package com.kodewala.encapsulation1;

public class Driver {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Alam", 50000);

        System.out.println("--- Employee Details ---");
        emp.displayDetails();

        System.out.println("\n--- Updating Salary ---");
        emp.updateSalary(60000);

        System.out.println("\n--- Updated Details ---");
        emp.displayDetails();

        System.out.println("\n--- Invalid Salary Update ---");
        emp.updateSalary(-1000);
    }
}

