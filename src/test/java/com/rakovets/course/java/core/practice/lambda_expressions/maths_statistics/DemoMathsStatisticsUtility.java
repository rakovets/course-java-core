package com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics;

import com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics.Utility;

import java.util.Arrays;

public class DemoMathsStatisticsUtility {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.println(Arrays.toString(utility.generateArrayOfRandomIntegers(5)));
    }
}
