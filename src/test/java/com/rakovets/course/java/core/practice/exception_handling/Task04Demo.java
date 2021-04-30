package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyRuntimeException;

public class Task04Demo {
    public static void main(String[] args) {
        try {
            Task04.throwMyRuntimeException();
        } catch (MyRuntimeException ex) {
            System.out.print(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
