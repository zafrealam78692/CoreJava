package com.kodewala.oops.inheritance;

class Employee {

    int employeeId;
    String name;
    double salary;

    // Parent class constructor
    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Parent class method
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

// Child class inherits Employee
class Manager extends Employee {

    String department;

    Manager(int employeeId, String name, double salary,
            String department) {

        super(employeeId, name, salary);
        this.department = department;
    }

    // Child class method
    void displayDepartment() {
        System.out.println("Department: " + department);
    }
}


