package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;
import com.rakovets.course.java.core.practice.exception_handling.exception.IndexOutOfBoundsException;

public class Task04Demo {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14, 15};

        int index = 1;

        String indexArray;

        try {
            indexArray = Task04.getIndexArray(index, array);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            indexArray = e.getMessage();
        }
        System.out.println(indexArray);
    }
}
