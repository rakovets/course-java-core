package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics math = new MathStatistics();
        System.out.println("random generated numbers array: " + math.getRandomNumbers(10, 0, 20));

        Collection<Integer> arrayMath = new ArrayList<>();
        arrayMath.add(1);
        arrayMath.add(5);
        arrayMath.add(0);
        arrayMath.add(0);
        arrayMath.add(21);
        arrayMath.add(8);

        System.out.println(arrayMath);
        System.out.println("Even " + math.countEvenNumbers(arrayMath));
        System.out.println("Odd " + math.countOddNumbers(arrayMath));
        System.out.println("Equal Zero " + math.countEqualZero(arrayMath));
        System.out.println("5 count " + math.countEqualNumberValue(arrayMath, 5));
    }
}
