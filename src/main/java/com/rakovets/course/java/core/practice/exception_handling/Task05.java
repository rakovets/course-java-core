package com.rakovets.course.java.core.practice.exception_handling;

import java.lang.reflect.Array;

public class Task05 {
    public static void main(String[] args) {
        try {
            getValueOfArray();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void getValueOfArray() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }
}
