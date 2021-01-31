package com.rakovets.course.java.core.practice.exception_handling;

public class Task04Example {
    public static void main(String[] args) {
        try {
            int sum = Task04.calculateSum(16, 6, 20);
            System.out.println("Sum = " + sum);
        } catch (MaxSumMessageException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
