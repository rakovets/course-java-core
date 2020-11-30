package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;

public class DemoMathsStatistics {
    public static void main(String[] args) {
        MathsStatistics mathsStatistics = new MathsStatistics();
        ArrayList<Integer> randomList = mathsStatistics.getRandomDigit(100);
        System.out.println(mathsStatistics.getEvenNumbers(randomList));
        System.out.println(mathsStatistics.getOddNumbers(randomList));
        System.out.println(mathsStatistics.getNulls(randomList));
        System.out.println(mathsStatistics.getEqualToSomeNumber(randomList,26));
    }
}
