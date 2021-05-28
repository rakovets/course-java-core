package com.rakovets.course.java.core.example.exception_handling.task7;

public class Custom50PercentExceprion {
    public static void custom50Percent() throws ArithmeticException {
       int customValue = (int)(Math.random() * 2);
       if(customValue == 1) {
           customValue /= 0;
           throw new ArithmeticException("The deliver is zero");
       } else {
           customValue += 1;
       }
    }
}
