package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathsStatistics {

    public static List<Integer> getListOfRandomDigits(int sizeLimit, int numberLimit) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listSize = random.nextInt(sizeLimit);
        for (int i = 1; i <= listSize; i++) {
            int number = random.nextInt(numberLimit);
            list.add(number);
        }
        return list;
    }

    public static int count (List<Integer> list, Expression expr) {
        int count = 0;
        for (Integer item : list) {
            if (expr.isEqual(item)) {
                count += 1;
            }
        } return count;
    }
    public static int getCountEvenNumbers(List<Integer> list) {
        Expression even = ExpressionToCompare::isEven;
        return count(list, even);
    }
    public static int getCountOddNumbers(List<Integer> list) {
        Expression odd = ExpressionToCompare::isOdd;
        return count(list, odd);
    }
    public static int getCountNumbersEqualToZero(List<Integer> list) {
        Expression equalToZero = ExpressionToCompare::isEqualZero;
        return count(list, equalToZero);
    }
    public static int getCountNumbersEqualTo(List<Integer> list, int number) {
        Expression equalToNumber = (int n) -> n == number;
        return count(list, equalToNumber);
    }

    public static class ExpressionToCompare {
        static boolean isEven(int n) {
            return n % 2 == 0;
        }
        static boolean isOdd(int n) {
            return n % 2 != 0;
        }
        static boolean isEqualZero(int n) {
            return n == 0;
        }
    }
}
