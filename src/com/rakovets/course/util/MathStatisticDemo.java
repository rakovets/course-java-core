package com.rakovets.course.util;

public class MathStatisticDemo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 74, 3, 3, 3, 214, 6, 4, 4, 7, 1, 2, 74, 3, 3, 4, 214, 6, 4, 4, 7, 1, 2, 74, 3, 3, 4, 214, 6, 4, 4, 7, 0, 2, 74, 3, 3, 4, 214, 6, 4, 4, 7, 1, 2, 74, 3, 3, 4, 214, 6, 4, 4, 7};
        MathStatistic mathStatistic = new MathStatistic(array);
        System.out.println("NumberOfEvenValues:" + mathStatistic.NumberOfEvenValues());
        System.out.println("NumberOfUnevenValues:" + mathStatistic.NumberOfUnevenValues());
        System.out.println("NumberOfZeroValues:" + mathStatistic.NumberOfZeroValues());
    }
}
