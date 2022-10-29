package com.rakovets.course.java.core.practice.lambda_expressions.specification_task_2;

import java.util.stream.IntStream;

public class Task02 {
    public void one() {
        IntStream.range(1, 11).forEach((x) -> {
            IntStream.range(1, 11).forEach((y) -> System.out.printf("%d * %d = %d\n", y, x, y * x));
        });
    }

    public void five() {
        IntStream.range(1, 11).forEach((x) -> {
            IntStream.range(1, 6).forEach((y) -> System.out.printf("%d * %d = %d\t", y, x, y * x));
            System.out.println();
        });
        IntStream.range(1, 11).forEach((x) -> {
            IntStream.range(6, 11).forEach((y) -> System.out.printf("%d * %d = %d\t", y, x, y * x));
            System.out.println();
        });
    }
}
