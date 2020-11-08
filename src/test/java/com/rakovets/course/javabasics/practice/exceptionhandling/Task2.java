package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[5];
        try {
            array[5] = 5;
        } catch (ArrayIndexOutOfBoundsException exept) {
            System.out.print("Index of Array is upper than length = " + array.length);
        }
    }
}
