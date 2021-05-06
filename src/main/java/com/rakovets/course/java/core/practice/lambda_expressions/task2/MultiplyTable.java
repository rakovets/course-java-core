package com.rakovets.course.java.core.practice.lambda_expressions.task2;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplyTable {
    public static void outputMultiplyTableOneColumn() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(x -> {
            Stream.iterate(1, y  -> y + 1)
                    .limit(10)
                    .forEach(y -> System.out.println(x + " * " + y + " = " + x * y));
        });
    }

    public static void outputMultiplyTableFiveColumn() {
        IntStream.range(1, 11).forEach(i -> {
            IntStream.range(1, 6).forEach(j -> {
                System.out.print(j + " * " + i + " = " + i * j + '\t');
            });
            System.out.println();
        });
        IntStream.range(1, 11).forEach(i -> {
            IntStream.range(6, 11).forEach(j -> {
                System.out.print(j + " * " + i + " = " + i * j + '\t');
            });
            System.out.println();
        });
    }
}

