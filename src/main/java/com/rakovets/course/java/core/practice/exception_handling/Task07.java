package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    public static void getRandomException() throws Exception{
        double i = Math.random();
        if (i >= 0.5) {
            throw new Exception("Exception - number have to be < 0.5");
        }
    }
}
