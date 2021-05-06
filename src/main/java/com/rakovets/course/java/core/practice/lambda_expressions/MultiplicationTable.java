package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class MultiplicationTable {
    private static final int MULTIPLICAND = 1;
    private static final int FACTOR = 10;

    public static void printMultiplicationTableOneColumn() {
        IntStream.range(MULTIPLICAND, FACTOR + 1).forEach(i -> {
            IntStream.range(MULTIPLICAND, FACTOR + 1).forEach(j -> {
                System.out.println(i + " x " + j + " = " + i * j);
            });
            System.out.println();
        });
    }

    public static void printMultiplicationTableFiveColumn() {
        IntStream.range(MULTIPLICAND, FACTOR + 1).forEach(i -> {
            IntStream.range(MULTIPLICAND, 6).forEach(j -> {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            });
            System.out.println();
        });
        System.out.println();
        IntStream.range(MULTIPLICAND, FACTOR + 1).forEach(i -> {
            IntStream.range(6, FACTOR + 1).forEach(j -> {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            });
            System.out.println();
        });
    }
}
