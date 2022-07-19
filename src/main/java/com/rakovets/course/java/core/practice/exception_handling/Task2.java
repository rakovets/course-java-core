package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public static void main(String[] args) {

        int[] num = new int[10];

        try {
            num[19] = 19;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
