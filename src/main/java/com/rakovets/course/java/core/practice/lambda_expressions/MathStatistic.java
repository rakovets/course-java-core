package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistic {
    static int[] randomNumbersArray = new Random().ints(100,-5,40 ).toArray();

    static long getEvenCount() {
       return Arrays.stream(randomNumbersArray)
                .filter(number -> number % 2 == 0)
                .count();
    }

    static long getNotEvenCount() {
        return  Arrays.stream(randomNumbersArray)
                .filter(number -> number % 2 != 0)
                .count();
    }

    static long getZeroNumbers() {
        return Arrays.stream(randomNumbersArray)
                .filter(number -> number == 0)
                .count();
    }

    static long getNeededNumbers(int neededNumber) {
        return Arrays.stream(randomNumbersArray)
                .filter(number -> number == neededNumber)
                .count();
    }
}
