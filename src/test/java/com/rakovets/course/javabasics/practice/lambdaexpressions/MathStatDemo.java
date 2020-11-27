package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import static java.lang.System.*;

public class MathStatDemo {
    public static void main(String[] args) {
        int[] array = MathStat.generate(10);
        out.println("Array: " + Arrays.toString(array));
        out.println("Amount of evens: " + MathStat.amountOfEvens(array));
        out.println("Amount of odds: " + MathStat.amountOfOdds(array));
        int[] array2 = {0, 0, 2, 2, 2};
        out.println("Array: " + Arrays.toString(array2));
        out.println("Amount of zeroes: " + MathStat.amountOfZeroes(array2));
        int value = 2;
        out.println("Amount of " + value + " value: " + MathStat.amountOfCurrentValue(array2, value));
    }
}
