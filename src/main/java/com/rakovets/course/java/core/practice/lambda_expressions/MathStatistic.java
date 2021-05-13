package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathStatistic {
    public static List<Integer> getRandomNumber (int numbersOfPrimes,int minValue,int maxValue) {
        int diff = maxValue-minValue;
        List<Integer> randomNumber= new ArrayList<>();
        for(int i = 0; i < numbersOfPrimes; i++) {
            randomNumber.add(new Random().nextInt(diff+1)+minValue);
            new Random().ints();
        }
        return randomNumber;
    }

    public static long getEventNumbers (List<Integer> numbersList) {
        return numbersList.stream()
                .filter(number -> number %2 == 0)
                .count();
    }

    public static long getOddNumbers (List<Integer> numbersList) {
        return numbersList.stream()
                .filter(number -> number % 2 != 0)
                .count();
    }

    public static long getNumbersEqualsZero (List<Integer> numbersList) {
        return numbersList.stream()
                .filter(number -> number.equals(0))
                .count();
    }

    public static long getNumbersEqualsValue (List<Integer> numbersList ,int value) {
        return numbersList.stream()
                .filter(number -> number.equals(value))
                .count();
    }
}
