package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {
    public void printMultiplicationTableInOneColumn(int startTable, int endTable) {
        IntStream.range(startTable, endTable)
                .forEach((x -> {
                    IntStream.range(startTable, endTable).forEach((y) -> System.out.println(x + " * " + y + " = " + x * y ));
                    System.out.println(" ");
                }));
    }

    public void printMultiplicationTableInFiveColumn(int startTable, int endTable, int columnsNumber) {
        IntStream.range(startTable, endTable)
                .forEach(x -> {
                    IntStream.range(startTable, columnsNumber)
                            .forEach(y -> System.out.printf("%d * %d = %d\t", y, x, y * x));
                    System.out.println();
                });
        System.out.println();
        IntStream.range(startTable, endTable).forEach(x -> {
            IntStream.range(columnsNumber, endTable)
                    .forEach(y -> System.out.printf("%d * %d = %d\t", y, x, y * x));
            System.out.println();
        });
    }
}
