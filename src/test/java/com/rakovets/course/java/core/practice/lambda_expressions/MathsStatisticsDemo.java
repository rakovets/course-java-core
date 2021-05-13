package com.rakovets.course.java.core.practice.lambda_expressions;

public class MathsStatisticsDemo {
    public static void main(String[] args) {
        int[] randomNumber = MathsStatistics.randomArray();
        for (int number : MathsStatistics.randomArray()) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : randomNumber) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(MathsStatistics.countEvenNumber(randomNumber));
        System.out.println(MathsStatistics.countZeroNumber(randomNumber));
        System.out.println(MathsStatistics.countOddNumber(randomNumber));
        System.out.println(MathsStatistics.countEquivalNumber(randomNumber,1));
    }
}
