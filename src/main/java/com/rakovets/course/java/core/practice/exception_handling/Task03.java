package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 {
    public static void main(String[] args) {
        try {
            int sum = calculateSum(16, 6);
            System.out.println("Sum = " + sum);
        } catch (Task03Exception e) {
            e.printStackTrace();
        }
    }
    public static int calculateSum(int numberOne, int numberTwo) throws Task03Exception{
        int sum = numberOne + numberTwo;
        if (sum > 20) {
            throw new Task03Exception();
        }
        return sum;
    }
}
