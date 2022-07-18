package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {
    public void divideNumbers(int valueOne, int valueTwo) throws Exception {
        if (valueTwo > 5) {
            throw new Exception("Number is > 5");
        }
        int result  = valueOne / valueTwo;
    }
}
