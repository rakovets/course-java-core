package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public abstract class Task02 {
    public static void getMultiplicationTable() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(1, 10)
                            .forEach(j -> System.out.printf("%d * %d = %d\n", i, j, i * j));
                    System.out.println();
                });
    }

    public static void getMultiplicationTableInFiveColumns() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(1, 5)
                            .forEach(j -> System.out.printf("%d * %d = %d\t\t", i, j, i * j));
                    System.out.println();
                });
        System.out.println();

        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(6, 10)
                            .forEach(j -> System.out.printf("%d * %d = %d\t\t", i, j, i * j));
                    System.out.println();
                });
    }
}
