package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        Task6 testMultipleExceptions = new Task6();

        try {
            testMultipleExceptions.getOneOfThreeExceptions(1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            testMultipleExceptions.getOneOfThreeExceptions(2);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            testMultipleExceptions.getOneOfThreeExceptions(3);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
