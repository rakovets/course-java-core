package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Demo {
    public static void main(String[] args) {
        try {
            Task06.randomException();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("ArrayIndexOutOfBoundsException or NullPointerException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
