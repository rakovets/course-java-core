package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task02 {
    public void multiplicationTable() {
        IntStream.range(1, 11)
                .forEach(x -> {
                    IntStream.rangeClosed(1, 10).forEach(y -> System.out.printf("%d * %d = %d\n", x, y, x * y));
                    System.out.println();
                });
    }

    public void multiplicationTable2() {
        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    IntStream.rangeClosed(1, 5)
                            .forEach(y -> System.out.printf("%d * %d = %d\t", x, y, x * y));
                    System.out.println();
                });
        System.out.println();
        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    IntStream.rangeClosed(6, 10)
                            .forEach(y -> System.out.printf("%d * %d = %d\t", x, y, x * y));
                    System.out.println();
                });
    }
}
