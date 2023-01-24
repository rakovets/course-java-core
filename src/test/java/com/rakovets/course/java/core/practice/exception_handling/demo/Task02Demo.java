package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.example.exception_handling.tasks.Task02;

public class Task02Demo {
    public static void main(String[] args) {
        int[] array = {4, 2 , 7};
        int index = 5;
        String arr;
        try {
            arr = Task02.getIndexOf(index, array);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            arr = e.getMessage();
        }
        System.out.println(arr);
    }
}
