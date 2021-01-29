package com.rakovets.course.java.core.practice.exception_handling;

public class Task04 {
    public static void main(String[] args) {
        try {
            int sum = calculateSum(16, 6);
            System.out.println("Sum = " + sum);
        } catch (Task04Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static int calculateSum(int numberOne, int numberTwo) throws Task04Exception{
        int sum = numberOne + numberTwo;
        if (sum > 20) {
            throw new Task04Exception("Sum greater than 20");
        }
        return sum;
    }
}
