package com.rakovets.course.challenge.exception_handling;

public class Task5 {

    public static void writeValueInArray(int index, int value) throws MyException3 {
        if (5 < index) {
            throw new MyException3("Size of array is less!");
        }
        int[] array = new int[5];
        array[index] = value;
        System.out.println("Value of array change: " + array[index]);
    }
}
