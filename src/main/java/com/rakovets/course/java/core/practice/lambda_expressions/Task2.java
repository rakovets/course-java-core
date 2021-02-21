package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {

    public static void getOneColumn() {
        IntStream.range(1,10)
                .forEach(j -> IntStream.range(1,10)
                        .forEach(i ->System.out.printf("%d * %d = %d\n", j, i, j * i)));
    }

    public static void getFiveColumn() {
        IntStream.range(1,10)
                .forEach(j -> { IntStream.range(1,6)
                        .forEach(i -> System.out.printf("%d * %d = %d\t", j, i, j * i));
                System.out.println();
                });
        System.out.println();

        IntStream.range(1,10)
                .forEach(j -> { IntStream.range(6,11)
                        .forEach(i ->System.out.printf("%d * %d = %d\t", j, i, j * i));
                    System.out.println();
                });
        System.out.println();
    }
}
