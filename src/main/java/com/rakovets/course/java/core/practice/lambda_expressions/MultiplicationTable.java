package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class MultiplicationTable {

    public void getMultiplicationTableInOneColumn(int first, int second) {
        IntStream.rangeClosed(first, second)
                .forEach(col -> IntStream.rangeClosed(first, second)
                        .forEach(row -> System.out.println(col + " * " + row + " = " + (col * row)))
                );
    }

    public void getMultiplicationTableInFiveColumns(int first, int second, int column) {
        IntStream.range(first, second).forEach(i -> {
            IntStream.rangeClosed(first, column).forEach(j -> {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            });
            System.out.println();
            IntStream.rangeClosed(column+1, second).forEach(j -> {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            });
            System.out.println();
        });
    }
}
