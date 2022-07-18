package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {
    public int divideTwoNumbers(int one, int two) throws Task4Exception {
        if (one == 0 || two == 0) {
            throw new Task4Exception("Division by zero");
        } else return one / two;
    }
}
