package com.rakovets.course.java.core.practice.exception_handling;

public class Task02_Demo {
    public static void main(String[] args) {
        try {
            Task02.throwArrayException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is ArrayIndexOutOfBoundsException");
        }
    }
}
