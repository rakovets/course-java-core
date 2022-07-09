package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {

    public void arrayAddIndex(int number, int index) {
        try {
            int[] arr = new int[5];
            arr[index] = number;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
