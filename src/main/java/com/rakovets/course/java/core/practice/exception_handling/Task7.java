package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {

    public static void fiftyPercentChance() throws ArithmeticException, NumberFormatException {
        int x = (int) (Math.random() * 2);

        if (x == 0) {
            throw new ArithmeticException();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            fiftyPercentChance();
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException caught");
        } catch (IllegalArgumentException i) {
            System.out.println("IllegalArgumentException caugth");
        } finally {
            System.out.println("Program is finished");
        }
    }
}
