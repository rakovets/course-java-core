package com.rakovets.course.java.core.util;

public class RandomUtil {

    public static int getRandomIntegerNumber(String limitValue) {
        int randomNumber = (int) (Math.random() * Integer.parseInt(limitValue));
        System.out.println("random number = " + randomNumber);
        return randomNumber;
    }
}
