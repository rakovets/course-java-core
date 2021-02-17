package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 {

    public static void oneColumnTable() {
            Stream.iterate(1, i -> i + 1)
                    .limit(10)
                    .forEach(x -> {
                        Stream.iterate(1, i -> i + 1)
                                .limit(10)
                                .forEach(y -> System.out.printf("%d * %d = %d" + "\n", x, y, x * y));
                    });
    }
    public static void multyTable() {
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
