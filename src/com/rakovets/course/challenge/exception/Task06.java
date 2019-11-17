package com.rakovets.course.challenge.exception;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(3) + 1;
        try {
            randomThrowMethod(num);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            if (num == 1) {
                System.out.println("\nBe careful - Null Pointer Exception");
                ex.printStackTrace();
            } else if (num == 2) {
                System.out.println("\nBe careful  - ArrayIndexOutOfBoundsException");
                ex.printStackTrace();
            } else System.out.println("\nBe careful -Division by 0");
            ex.printStackTrace();
        }
        System.out.println("Program finished");
    }

    static void randomThrowMethod(int num) throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {
        switch (num) {
            case 1:
                String program = null;
                program.length();
                break;
            case 2:
                int[] people = new int[2];
                people[100] = 7;
                break;
            case 3:
                int zero = 10 / 0;
                break;
        }
    }
}
