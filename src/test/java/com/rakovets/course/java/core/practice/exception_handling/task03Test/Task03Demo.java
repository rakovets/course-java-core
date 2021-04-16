package com.rakovets.course.java.core.practice.exception_handling.task03Test;

import com.rakovets.course.java.core.practice.exception_handling.task03.Discount;
import com.rakovets.course.java.core.practice.exception_handling.task03.WrongSumException;

import java.util.Arrays;

public class Task03Demo {
    public static void main(String[] args) {
        int sum = 0;
        try {
            Discount.provideDiscount(sum);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
