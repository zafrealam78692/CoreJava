package com.kodewala.encapsulation1;


class Employee {

    // 1. Private attributes
    private int employeeId;
    private String name;
    private double salary;

    // 2. Constructor
    public Employee(int employeeId, String name, double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(
                "Salary cannot be negative."
            );
        }

        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // 3. Getter methods: allow reading employee details
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // 4. Controlled salary update
    public boolean updateSalary(double newSalary) {

        if (newSalary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            return false;
        }

        salary = newSalary;
        System.out.println("Salary updated successfully.");
        return true;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs. " + salary);
    }
}

