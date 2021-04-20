package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            Task6.threeExceptions();
        } catch (ArithmeticException | NullPointerException e) {
            System.err.println("you divide by zero or your string is null");
        } catch (NumberFormatException e) {
            System.err.println("error converting string to number");
        }
    }
}
