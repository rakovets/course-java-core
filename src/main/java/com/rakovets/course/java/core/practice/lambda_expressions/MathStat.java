package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Random;

public class MathStat {

    public static String makeRandomValues(int amount, int limit){
        Random random = new Random();
        return Arrays.toString(Arrays.stream(new int[amount]).map(magicvalue -> random.nextInt(limit)).toArray());
    }

    public static long quantityOfEven(int[] values){
        return Arrays.stream(values).filter(magicvalue -> magicvalue % 2 == 0).count();
    }

    public static long quantityOfOdd(int[] values){
        return Arrays.stream(values).filter(magicvalue -> magicvalue % 2 != 0).count();
    }

    public static long quantityOfZero(int[] values){
        return Arrays.stream(values).filter(magicvalue -> magicvalue % 2 == 0).count();
    }

    public static long quantityOfSelect(int[] values, int select){
        return Arrays.stream(values).filter(magicvalue -> magicvalue  == select).count();
    }
}
