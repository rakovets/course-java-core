package com.rakovets.course.util.maths_statistics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FilterOfValues {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }

        System.out.println("\nEven values:");
        long value1 = Arrays.stream(array)
                .filter(v -> v % 2 == 0)
                .count();
        System.out.println(value1);

        System.out.println("\nUneven values: ");
        long value2 = Arrays.stream(array)
                .filter(v -> v % 2 != 0)
                .count();
        System.out.println(value2);

        System.out.println("\nValues that = 0: ");
        long value3 = Arrays.stream(array)
                .filter(v -> v == 0)
                .count();
        System.out.println(value3);

        System.out.println("\nEnter value:");
        Scanner scanner = new Scanner(System.in);
        int valueThatEnterUser = scanner.nextInt();
        System.out.println("\nValue = value that entered user:");
        long value4 = Arrays.stream(array)
                .filter(v -> v == valueThatEnterUser)
                .count();
        System.out.println(value4);
    }
}
