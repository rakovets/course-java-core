package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {

    public static void randomException() throws ArithmeticException, NumberFormatException, IllegalArgumentException {
        int x = (int) (Math.random() * 3);

        if (x == 0) {
            throw new ArithmeticException();
        }
        if (x == 1) {
            throw new NumberFormatException();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            randomException();
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Arithmetic or Number exceptions are caught");
        } catch (IllegalArgumentException ill) {
            System.out.println("IllegalArgumentException caught");
        }
    }
}
