package com.rakovets.course.util.mathStatistics;

import java.util.Random;

public class MathStatisticDemo {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }

        MathStatistic mathStatistic = new MathStatistic(array);
        System.out.println("NumberOfEvenValues:" + mathStatistic.NumberOfEvenValues());
        System.out.println("NumberOfUnevenValues:" + mathStatistic.NumberOfUnevenValues());
        System.out.println("NumberOfZeroValues:" + mathStatistic.NumberOfZeroValues());
        System.out.println("Please enter your value");
        System.out.println("NumberOfInputValues:" + mathStatistic.NumberOfInputValues());
    }
}
