package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MathHelper {
    static int someNumber;
    public static List<Integer> generateArray(int elements) {
        List<Integer> list = new ArrayList<>(elements);
        for (int i = 0; i < elements; i++) {
            list.add(new Random().nextInt(100));
        }
        return list;
    }

    public static boolean isEven(int number) {
        return Objects.equals(number % 2, 0);
    }

    public static boolean isOdd(int number) {
        return !Objects.equals(number % 2, 0);
    }

    public static boolean isZero(int number) {
        return Objects.equals(number, 0);
    }

    public static boolean isIdentical(int number) {
        return Objects.equals(someNumber, number);
    }
}
