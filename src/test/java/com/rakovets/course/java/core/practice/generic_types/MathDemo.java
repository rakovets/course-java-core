package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.maxValueOfThree(11,16,12));
        System.out.println(Math.minValueOfAll(14,13,12,11,22,76,11,0));
        System.out.println(Math.averageValue(10,20,30,40));
        Integer[] array = new Integer[] {14,13,12,11,22,76,16,0};
        System.out.println(Math.maxInArray(array));
        System.out.println(Math.minInArray(array));

        Math math = new Math() {
            @Override
            public <T extends Number & Comparable<T>> T[] sortArray(T[] array) {
                return super.sortArray(array);
            }
        };
        System.out.println(Arrays.toString(math.sortArray(array)));
        System.out.println(array.length);
        System.out.println(Math.recursiveBinarySearch(array, 0, 7, 11));
    }
}
