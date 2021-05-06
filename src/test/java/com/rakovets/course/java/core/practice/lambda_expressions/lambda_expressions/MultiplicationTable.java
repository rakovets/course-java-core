package com.rakovets.course.java.core.practice.lambda_expressions.lambda_expressions;

import java.util.stream.IntStream;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\nOne column multiplication table:");
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intStream.forEach(x -> {
            System.out.printf("Multiplication by %d:\n", x);
            IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(y -> System.out.printf("%d x %d = %d\n", x, y, x*y));
            System.out.println("");
        });

        System.out.println("\nFive column multiplication table:");
        Expression odd = expression(1);
        Expression even = expression(2);

        getSortMultiplicationTable(odd);
        getSortMultiplicationTable(even);
    }

    public static void getSortMultiplicationTable(Expression expression) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(expression::getSort).forEach(y -> System.out.printf("Multiplication by %d:   ", y));
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(x -> {
            System.out.println("");
            IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(expression::getSort).forEach(y -> System.out.printf("%d x %d = %d              ", y, x, x * y));
        });
        System.out.println("\n");
    }

    public static Expression expression(int number) {
        switch (number) {
            case 1:
                return x -> x % 2 != 0;
            default:
                return x -> x % 2 == 0;
        }
    }
}
