package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 extends Task4 {

    @Override
    public int divideTwoNumbers(int one, int two) throws Task4Exception {
        int result;
        try {
            result = one / two;
        } catch (ArithmeticException ex) {
            throw new Task4Exception(ex.getMessage());
        }
        return result;
    }
}
