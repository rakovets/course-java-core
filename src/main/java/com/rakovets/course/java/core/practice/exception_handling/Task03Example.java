package com.rakovets.course.java.core.practice.exception_handling;

public class Task03Example {
    public static void main(String[] args) {
        try {
            int sum = Task03.calculateSum(16, 6, 20);
            System.out.println("Sum = " + sum);
        } catch (MaxSumException e) {
            e.printStackTrace();
        }
    }
}
