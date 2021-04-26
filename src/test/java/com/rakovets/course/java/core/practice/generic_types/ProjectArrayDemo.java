package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class ProjectArrayDemo {
    public static void main(String[] args) {
        ProjectArray<Number> array = new ProjectArray<>(5);
        array.setRandomValuesForArray();
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array.replaceValue(2, 15)));
        System.out.println(ProjectArray.findArrayMaximum());
        System.out.println(ProjectArray.findArrayMinimum());
        System.out.println(ProjectArray.findArrayArithmetical());
        System.out.println(Arrays.toString(ProjectArray.sortArrayAscending()));
        System.out.println(Arrays.toString(ProjectArray.sortArrayDescending()));
        System.out.println(array.toString());
    }
}
