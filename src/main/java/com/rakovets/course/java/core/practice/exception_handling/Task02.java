package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static void main(String[] args) {

        int[] num = new int[10];

        try {
            num[11] = 11;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
