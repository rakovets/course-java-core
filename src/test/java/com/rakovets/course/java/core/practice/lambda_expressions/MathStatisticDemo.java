package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;

public class MathStatisticDemo {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(10,25,64,120,12,17,31,10,10,0);
        System.out.println("Randoms numbers: " + MathStatistic.getRandomNumber(10,-100,100));
        System.out.println("Event numbers count: " + MathStatistic.getEventNumbers(numbersList));
        System.out.println("odd numbers count: " + MathStatistic.getOddNumbers(numbersList));
        System.out.println("Numbers equals zero count: " + MathStatistic.getNumbersEqualsZero(numbersList));
        System.out.println("Numbers equals value: " + MathStatistic.getNumbersEqualsValue(numbersList,10));

    }
}
