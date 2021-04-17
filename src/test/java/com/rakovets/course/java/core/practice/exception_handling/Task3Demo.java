package com.rakovets.course.java.core.practice.exception_handling;

public class Task3Demo {
    public static void main(String[] args) {
        try {
            int result = Task3.YearOfBirth.getYearOfBirth(2021, -35);
            System.out.println(result);
        } catch (Task3.AgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
