package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics.MathsStatistics;

import java.util.List;
import java.util.logging.Logger;

public class MathStatisticDemo {
    public static final Logger logger = Logger.getLogger(MathsStatistics.class.getName());

    public static void main(String[] args) {
        MathsStatistics statistics = new MathsStatistics();
        List<Integer> listNumber =  statistics.getListRandomNumbers(10, 0, 10);
        int number = 5;

        logger.info("Random numbers: " + listNumber);
        logger.info("Even numbers: " + statistics.countingAmountEvenNumbers(listNumber)
                + " in: " + listNumber);
        logger.info("Odd numbers: " + statistics.countingAmountOddNumbers(listNumber)
                + " in: " + listNumber);
        logger.info("Amount 0: " + statistics.countingAmountNumbersEqualZero(listNumber)
                + " in: " + listNumber);
        logger.info("Amount " + number + " : " + statistics.countingAmountGivenNumbers(listNumber, number)
                + " in: " + listNumber);
    }
}
