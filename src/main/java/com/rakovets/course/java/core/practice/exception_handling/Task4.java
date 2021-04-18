package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeptions.SecondExeption;

public class Task4 {
    public static int areaOfScuare(int value) throws SecondExeption {
        if (value == 0){ throw new SecondExeption("value of square cannot be 0", value);}
        return value;
    }
}
