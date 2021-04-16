package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 extends Exception {
    private int number;

    public Task03(String message, int number) {
        super(message);
        this.number = number;
    }

    public static int getDivisionOfNumbers(int number) throws Task03 {
        int number1 = 200;
        if (number == 0) {
            throw new Task03("This is ArithmeticException", number);
        } else {
            number1 /= number;
        }
        return number1;
    }

    public int getNumber() {
        return number;
    }
}
