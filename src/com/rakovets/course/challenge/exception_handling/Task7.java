package com.rakovets.course.challenge.exception_handling;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(2);
        try {
            if (number == 1) {
                System.out.println("Not this time)");
            } else {
                Task7.writingInArray(2);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.fillInStackTrace());
        } finally {
            System.out.println("Final");
        }

    }

    public static void writingInArray(int x) {
        int[] array = new int[0];
        array[x] = 4;
        System.out.println(array[x]);
    }
}
