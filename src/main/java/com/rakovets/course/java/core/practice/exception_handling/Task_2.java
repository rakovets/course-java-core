package com.rakovets.course.java.core.practice.exception_handling;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        try {
            array[5]= 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index Out Of Bounds");
        }
    }
}
