package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.Stream;

public class MultiplicationTable {
    public static void oneColumn() {
        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(x -> {
                    Stream.iterate(1, y -> y + 1)
                            .limit(10)
                            .forEach(y -> System.out.println(x + " * " + y + " = " + x * y));
                    System.out.println();
                });
    }

    public static void fiveColumn() {
        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(x -> {
                    Stream.iterate(1, y -> y + 1)
                            .limit(5)
                            .forEach(y -> System.out.print(x + " * " + y + " = " + x * y + "\t\t"));
                    System.out.println();
                });
        System.out.println();

        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(x -> {
                    Stream.iterate(6, y -> y + 1)
                            .limit(5)
                            .forEach(y -> System.out.print(x + " * " + y + " = " + x * y + "\t\t"));
                    System.out.println();
                });
    }
}
