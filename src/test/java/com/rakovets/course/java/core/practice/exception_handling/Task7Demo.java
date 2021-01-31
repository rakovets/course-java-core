package com.rakovets.course.java.core.practice.exception_handling;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            Task7.fiftyPercentChance();
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException caught");
        } catch (IllegalArgumentException i) {
            System.out.println("IllegalArgumentException caugth");
        } finally {
            System.out.println("Program is finished");
        }
    }
}
