package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
    public int getSumNumbers(int num) throws SumNumbersException {
        int sum = 0;
        if (num < 0) {
            throw new SumNumbersException("Число не может быть меньше 0");
        }
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
