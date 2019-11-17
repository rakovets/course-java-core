package com.rakovets.course.challenge.exception;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(2);
        try {
            if (num == 1) {
                throwMethodFiftyPercent();
            } else System.out.println("\nThe exception did not work!");
        } catch (ArithmeticException ex) {
            System.out.println("\nThe exception worked!\n" + "Exception Handling: Be careful - it's a -ArrayIndexOutOfBoundsException ");
            ex.printStackTrace();
        } finally {
            System.out.println("Finally: A method that throws an exception in 50% of cases");
        }
        System.out.println("\n" +
                "Program Finished");
    }

    static void throwMethodFiftyPercent() throws ArrayIndexOutOfBoundsException {
        int[] ints = new int[6];
        ints[8] = 9;
    }
}
