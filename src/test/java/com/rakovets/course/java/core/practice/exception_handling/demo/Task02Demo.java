package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task02;

public class Task02Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 4};
        int index = 4;
        String indexArray;

        try {
            indexArray = Task02.getIndexArray(index, array);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            indexArray = e.getMessage();
        }
        System.out.println(indexArray);
    }
}
