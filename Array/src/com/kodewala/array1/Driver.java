package com.kodewala.array1;

public class Driver {
    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Rohit", 75),
            new Student(2, "Anjali", 32),
            new Student(3, "Karan", 45),
            new Student(4, "Simran", 28),
            new Student(5,"Alam", 89),
            new Student(6,"zafar", 71)
        };

        for (int i = 0; i < students.length; i++) {
            if (students[i].marks >= 40) {
                System.out.println(
                    students[i].name + " : PASS (" +
                    students[i].marks + ")"
                );
            } else {
                System.out.println(
                    students[i].name + " : FAIL (" +
                    students[i].marks + ")"
                );
            }
        }
    }
}
