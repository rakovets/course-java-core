package com.rakovets.course.java.core.practice.lambda_expressions.tasks;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task02 {
    public void outputMultiplicationTableOneColumn() {
        IntStream.rangeClosed(1, 10).forEach(x -> {
            Stream.iterate(1, n -> n <= 10, n -> n + 1)
                    .forEach(n -> System.out.println(x + " x " + n + " = " + x * n));
            System.out.println();
        });
    }

    public void outputMultiplicationTableFiveColumn() {
        IntStream.range(1, 10).forEach(i -> {
            IntStream.rangeClosed(1, 5).forEach(j -> {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            });
            System.out.println();
            IntStream.rangeClosed(6, 10).forEach(j -> {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            });
            System.out.println();
        });
    }
}
