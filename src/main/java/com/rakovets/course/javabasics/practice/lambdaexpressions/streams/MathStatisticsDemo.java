package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.Arrays;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.streams.MathStatistics.*;

public class MathStatisticsDemo {

    public static void main(String[] args) {
        int[] randomNumbersArray = generateRandomNumbers(5, 0, 5);

        System.out.println(Arrays.toString(randomNumbersArray));

        System.out.println(getCountEvenNumbers(randomNumbersArray));

        System.out.println(getCountUnevenNumbers(randomNumbersArray));

        System.out.println(getCountEqualsZero(randomNumbersArray));

        System.out.println(getCountNumberMatches(randomNumbersArray, 2));

    }


}
