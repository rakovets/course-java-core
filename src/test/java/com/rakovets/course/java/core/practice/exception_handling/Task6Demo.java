package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        Task6 task6 = new Task6();

        try {
            task6.randomException(10);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("This is ArithmeticException or NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("This is NumberFormatException");
        }

        try {
            task6.randomException(40);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("This is ArithmeticException or NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("This is NumberFormatException");
        }

        try {
            task6.randomException(80);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("This is ArithmeticException or NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("This is NumberFormatException");
        }
    }
}
