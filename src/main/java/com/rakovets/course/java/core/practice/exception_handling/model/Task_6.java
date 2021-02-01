package com.rakovets.course.java.core.practice.exception_handling.model;

public class Task_6 {
    public static void getRandomException() throws Exception{
         int x = (int)(Math.random() * 4);
         if (x == 1) {
             throw new NullPointerException();
         } else if (x == 2) {
             throw new ArithmeticException();
         } else {
             throw new InterruptedException();
         }
    }
}
