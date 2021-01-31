package com.rakovets.course.java.core.practice.exception_handling;

public class Task06 {
    public static void getRandomException() throws Exception{
        double i = Math.random();
        if (i > 0 && i <= 0.33) {
            throw new Exception("Exception 1");
        } else if (i > 0.33 && i <= 0.66) {
            throw new Exception("Exception 2");
        } else {
            throw new Exception("Exception 3");
        }
    }
}
