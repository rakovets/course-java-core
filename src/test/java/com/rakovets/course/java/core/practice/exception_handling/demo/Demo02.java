package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task02;

public class Demo02 {
    public static void main(String[] args) {
        Task02 task02 = new Task02();
        int[] array = {1, 2, 3, 4, 5};
        int index = 5;
        String result;
        try {
            result = task02.getIndexOfElement(index, array);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        System.out.println(result);
    }
}
