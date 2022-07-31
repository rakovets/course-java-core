package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task02 {
    public void outputMultiplicationTableOneColumn() {
        IntStream.rangeClosed(1, 10).forEach(x -> {
            Stream.iterate(1, y -> y <= 10, y -> y + 1)
                    .forEach(y -> System.out.println(x + " * " + y + " = " + x * y));
            System.out.println();
        });
    }

    public void outputMultiplicationTableFiveColumn() {
        IntStream.rangeClosed(1, 10).forEach(x -> {
            IntStream.rangeClosed(1, 5).forEach(y -> System.out.printf("%d * %d = %d\t\t", y, x, y * x));
            System.out.println();
        });
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(x -> {
            IntStream.rangeClosed(6, 10).forEach(y -> System.out.printf("%d * %d = %d\t\t", y, x, y * x));
            System.out.println();
        });
    }

}
