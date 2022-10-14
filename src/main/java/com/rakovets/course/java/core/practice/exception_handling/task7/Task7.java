package com.rakovets.course.java.core.practice.exception_handling.task7;

public class Task7 {
    public void divideEvenNumbers(int num1, int num2) throws EvenNumberException, ArithmeticException {
        int result = 0;
        if (num1 % 2 != 0) {
            throw new EvenNumberException("This number isn't even");
        } else if (num2 == 0) {
            throw new ArithmeticException("Divider is 0");
        } else {
            result = num1 / num2;
        }
    }
}
