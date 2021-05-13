package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.Stream;

public class Task2 {
    public static void multiplicationTableOneColumn() {
        Stream.iterate(1, x -> x < 11, x -> x + 1)
                .forEach(x -> {
                    Stream.iterate(1, y-> y< 11, y -> y + 1)
                            .forEach(y -> System.out.println(x + " * " + y + " = " + x * y));
                    System.out.println();
                });
    }

    public static void multiplicationTableFiveColumn() {
        Stream.iterate(1, x -> x < 11, x -> x + 1)
                .forEach(x -> {
                    Stream.iterate(1, y-> y< 6, y -> y + 1)
                            .forEach(y -> System.out.print(x + " * " + y + " = " + x * y + "\t\t"));
                    System.out.println();
                });
        System.out.println();
        Stream.iterate(1, x -> x < 11, x -> x + 1)
                .forEach(x -> {
                    Stream.iterate(6, y-> y< 6, y -> y + 1)
                            .forEach(y -> System.out.print(x + " * " + y + " = " + x * y + "\t\t"));
                    System.out.println();
                });
    }
}
