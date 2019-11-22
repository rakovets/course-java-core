package com.rakovets.course.challenge.exception_handling;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] array = new int[4];
            array[6] = 13;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.fillInStackTrace());
        }

    }
}
