package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.ArrayList;
import java.util.List;

public class MathUtility {
    public static List<Integer> getCollectionOfRandomNumbers(int number) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= number - 1; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        return numbers;
    }

    public static int getNumberOfEvenNumbers(List<Integer> list) {
        return (int) list.stream().filter(n -> n % 2 == 0).count();
    }

    public static int getNumberOfOddNumbers(List<Integer> list) {
        return (int) list.stream().filter(n -> n % 2 != 0).count();
    }

    public static int getNumberOfNumbersEqualsZero(List<Integer> list) {
        return (int) list.stream().filter(n -> n == 0).count();
    }

    public static int getNumberOfNumbersEqualsSomeMeaning(List<Integer> list, int digital) {
        return (int) list.stream().filter(n -> n == digital).count();
    }
}
