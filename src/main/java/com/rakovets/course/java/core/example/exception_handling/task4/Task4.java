package com.rakovets.course.java.core.example.exception_handling.task4;

import java.math.BigInteger;

public class Task4 {
    public static String simpleNumber (int number) throws WrongSimpleNumberException {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));
        if (probablePrime) {
            return "Simple number: " + number;
        } else {
            throw new WrongSimpleNumberException(number);
        }
    }
}
