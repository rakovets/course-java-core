package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyException;

public class Task03Demo {
    public static void main(String[] args) {
        try {
            Task03.throwMyException();
        } catch (MyException ex) {
            System.out.print(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
