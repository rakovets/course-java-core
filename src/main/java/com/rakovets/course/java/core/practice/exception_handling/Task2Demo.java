package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Demo {
    public static void main(String[] args) {
        int[] array = {2, 1, 6};
        int index = 4;
        String arr;

        try {
            arr = Task2.getIndexArray(index, array);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            arr = e.getMessage();
        }
        System.out.println(arr);
    }
}
