package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.RootException;

public class Task3 {
    public static void main(String[] args) {

        int x = -100;

        if (x < 0)
            try {
                throw new RootException(x);
            } catch (RootException e) {
                e.printStackTrace();
            }
        else System.out.println(Math.sqrt(x));
    }
}
