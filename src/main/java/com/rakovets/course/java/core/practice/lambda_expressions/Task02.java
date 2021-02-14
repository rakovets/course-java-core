package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.Stream;

public class Task02 {
    public void getTableInOneColumn() {
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(e -> {
                    Stream.iterate(1, n -> n + 1)
                            .limit(10)
                            .forEach(z -> System.out.printf("%d * %d = %d \n", e , z, e * z));
                });
    }

    public void getTableInFiveColumn() {
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(e -> {
                    Stream.iterate(1, n -> n + 1)
                            .limit(5)
                            .forEach(z -> System.out.printf("%d * %d = %d || ", z, e, e * z));
                    System.out.println();
                });
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(e -> {
                    Stream.iterate(6, n -> n + 1)
                            .limit(5)
                            .forEach(z -> System.out.printf("%d * %d = %d || ", z, e, e * z));
                    System.out.println();
                });
    }
}
