package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CountOfElementsIsNegativeException;

public class Demo05 {
    public static void main(String[] args) {
        Task05 task05 = new Task05();
        int[] array = {1, 2, 3, 4, 5};
        int index = -1;
        String result;
        try {
            result = task05.getIndexInArray(index, array);
        } catch (CountOfElementsIsNegativeException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        System.out.println(result);
    }
}
