package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 {
    public static void main(String[] args) {
        int x = 9;
        if (x < 0)
            try {
                throw new RootException(x);
            } catch (RootException e) {
                e.printStackTrace();
            }
        else System.out.println(Math.sqrt(x));
    }
}
