package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task06;

public class Task06Demo {
    public static void main(String[] args) {
        try {
            Task06.throwRandomException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("ArithmeticException or ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
