package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplicationTable {
    /**
     * Prints the multiplication table in one column.
     */
    public void tableFirst() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(x -> Stream
                .iterate(1, y -> y + 1).limit(10)
                .forEach(y -> System.out.println(x + " * " + y + " = " + x * y)));
    }

    /**
     * Prints the multiplication table in five columns.
     */
    public void tableSecond() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            IntStream.rangeClosed(1, 5).forEach(j -> System.out.printf("%d * %d = %d\t\t", i, j, i * j));
            System.out.println();
        });
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(i -> {
            IntStream.rangeClosed(6, 10).forEach(j -> System.out.printf("%d * %d = %d\t\t", i, j, i * j));
            System.out.println();
        });
    }
}
