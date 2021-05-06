package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStatistic {

    public static int[] getArrayOfRandomNumbers(){
        return new Random().ints(100,-5,40 ).toArray();
    }

    static long getEvenCount(int[] ints) {
       return Arrays.stream(ints)
                .filter(number -> number % 2 == 0)
                .count();
    }

    static long getNotEvenCount(int[] ints) {
        return  Arrays.stream(ints)
                .filter(number -> number % 2 != 0)
                .count();
    }

    static long getZeroNumbers(int[] ints) {
        return Arrays.stream(ints)
                .filter(number -> number == 0)
                .count();
    }

    static long getNeededNumbersCount(int neededNumber, int[] ints) {
        return Arrays.stream(ints)
                .filter(number -> number == neededNumber)
                .count();
    }
}
