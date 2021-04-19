package com.rakovets.course.java.core.practice.exception_handling;

public class Task02Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task02.throwArrayIndexOutOfBoundsException(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught.");
        }
    }
}
