package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught.");
        }
    }
}
