package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public static void main(String[] args) {
        int[]  numbers = new int[5];

        try {
            numbers[7] = 15;
            System.out.println(numbers[7]);
        } catch (Exception e) {
            System.out.println("Program is over");
        }
    }
}
