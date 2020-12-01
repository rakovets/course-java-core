package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.stream.Stream;
import static java.lang.System.*;

public class Table {

    static void print1() {
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(x -> {
                            Stream.iterate(1, n -> n + 1)
                                    .limit(10)
                                    .forEach(y -> out.println(x + " x " + y + " = " + x * y));
                            out.println();
                        });
    }

    static void print5() {
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(x -> {
                    Stream.iterate(1, n -> n + 1)
                            .limit(5)
                            .forEach(y -> out.print(x + " x " + y + " = " + x * y + "\t\t"));
                    out.println();
                });
        out.println();
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(x -> {
                    Stream.iterate(6, n -> n + 1)
                            .limit(5)
                            .forEach(y -> out.print(x + " x " + y + " = " + x * y + "\t\t"));
                    out.println();
                });
    }
}
