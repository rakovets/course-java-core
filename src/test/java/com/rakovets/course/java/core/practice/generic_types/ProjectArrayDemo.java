package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class ProjectArrayDemo {
    public static void main(String[] args) {
        ProjectArray<Integer> array = new ProjectArray<>(5);
        array.setRandomValuesForArray();
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array.replaceValue(2, 15)));
        System.out.println(array.findArrayMaximum());
        System.out.println(array.findArrayMinimum());
        System.out.println(array.findArrayArithmetical());
        System.out.println(Arrays.toString(array.sortArrayAscending()));
        System.out.println(Arrays.toString(array.sortArrayDescending()));
        System.out.println(array.toString());
    }
}
