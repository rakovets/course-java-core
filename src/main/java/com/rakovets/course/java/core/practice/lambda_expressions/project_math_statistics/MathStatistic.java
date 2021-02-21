package com.rakovets.course.java.core.practice.lambda_expressions.project_math_statistics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathStatistic {
    public static List<Integer> getRandomNumbers (int numberQuantity, int begin, int end) {
        return new Random()
                .ints(numberQuantity,begin,end)
                .boxed()
                .collect(Collectors.toList());
    }

    public static long countEven (List<Integer> numbersList) {
        return numbersList.
                stream().filter(n -> n % 2 == 0)
                .count();
    }

    public static long countNotEven (List<Integer> numbersList) {
        return numbersList.
                stream().filter(n -> n % 2 != 0)
                .count();
    }

    public static long countZeros (List<Integer> numbersList) {
        return numbersList.
                stream().filter(n -> n == 0)
                .count();
    }

    public static long countValue (List<Integer> numbersList, int value) {
        return numbersList.
                stream().filter(n -> n  == value)
                .count();
    }
}
