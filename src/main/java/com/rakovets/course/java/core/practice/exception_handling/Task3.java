package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeptions.FirtsExeption;

public class Task3 {
    public static int getOdd(int num) throws FirtsExeption {
        if (num % 2 == 0){ throw new FirtsExeption("this number is even", 4);}
        return num;
    }
}
