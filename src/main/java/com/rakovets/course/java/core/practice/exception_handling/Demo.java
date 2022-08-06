package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DivisionException;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task1.lengthString(null));
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }

        try {
            System.out.println(Task2.createArray(5, 2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Task3.divisionNumber(5.0, 0));
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }
}
