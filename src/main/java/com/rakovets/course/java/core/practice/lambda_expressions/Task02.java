package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task02 {
    public static void multiplicationTableInOneColumn() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.forEach(x -> {
            numbers.forEach(y ->
                System.out.println(x + " * " + y + " = " + x * y));
            System.out.println();
        });
    }

    public static void multiplicationTableInFiveColumn() {
        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    IntStream.rangeClosed(1, 5)
                            .forEach(y -> System.out.printf("%d * %d = %d\t\t", x, y, x * y));
                    System.out.println();
                });
        System.out.println();

        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    IntStream.rangeClosed(6, 10)
                            .forEach(y -> System.out.printf("%d * %d = %d\t\t", x, y, x * y));
                    System.out.println();
                });
    }
}
