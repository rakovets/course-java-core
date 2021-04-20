package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        double random = Math.random();
        System.out.println("random = " + random);

        try {
            task6.randomException(random);
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("This is ArithmeticException or NullPointerException");
        } catch (NumberFormatException ex) {
            System.out.println("This is NumberFormatException");
        }
    }
}
