package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        try {
            numbers[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number greater than the size of the array");
        }
    }
}
