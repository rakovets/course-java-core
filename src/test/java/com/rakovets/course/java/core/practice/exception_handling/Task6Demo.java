package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            Task6.randomException();
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Arithmetic or Number exceptions are caught");
        } catch (IllegalArgumentException ill) {
            System.out.println("IllegalArgumentException caught");
        }
    }
}
