package com.rakovets.course.java.core.practice.exception_handling.task_03;

public class Discount {

    public static int provideDiscount(int sum) throws WrongSumException {
        int result = sum;
        if(sum > 100) {
            result = (int)(sum * 0.8);
        } else if(sum <= 0) {
            throw new WrongSumException();
        }
        return result;
    }
}
