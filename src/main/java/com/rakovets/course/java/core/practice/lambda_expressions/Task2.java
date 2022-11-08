package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {
    public void printOneColumnMultiplicationTable() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(1, 10)
                            .forEach(j -> System.out.printf("%d * %d = %d\n", i, j, i * j));
                    System.out.println();
                });
    }

    public void printFiveColumnMultiplicationTable() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(1, 5)
                            .forEach(j -> System.out.printf("%d * %d = %d\t", j, i, j * i));
                    System.out.println();
                });
        System.out.println();
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(6, 10)
                            .forEach(j -> System.out.printf("%d * %d = %d\t", j, i, j * i));
                    System.out.println();
                });
    }
}
