package com.rakovets.course.java.core.practice.exception_handling;

public class Task_2_demo {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            array[6] = 4;
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
