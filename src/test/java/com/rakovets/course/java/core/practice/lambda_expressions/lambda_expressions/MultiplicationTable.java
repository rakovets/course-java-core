package com.rakovets.course.java.core.practice.lambda_expressions.lambda_expressions;

import java.util.stream.IntStream;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\nOne column multiplication table:");
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .forEach(x -> {
                    System.out.printf("Multiplication by %d:\n", x);
                    IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                    .forEach(y -> System.out.printf("%d x %d = %d\n", x, y, x*y));
            System.out.println("");
        });

        System.out.println("\nFive column multiplication table:");
        getSortMultiplicationTable(1, 5);
        getSortMultiplicationTable(6, 10);
    }

    public static void getSortMultiplicationTable(int startNumber, int finishNumber) {
        IntStream.range(startNumber, finishNumber + 1)
                .forEach(y -> System.out.printf("Multiplication by %d:   ", y));

        IntStream.range(1, 11)
                .forEach(x -> {
            System.out.println("");
            IntStream.range(startNumber, finishNumber + 1)
                    .forEach(y -> System.out.printf("%d x %d = %d              ", y, x, x * y));
        });
        System.out.println("\n");
    }
}
