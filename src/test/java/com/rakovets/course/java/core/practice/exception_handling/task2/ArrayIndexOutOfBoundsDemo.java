package com.rakovets.course.java.core.practice.exception_handling.task2;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        ArrayIndexOutOfBounds arrayIndexOutOfBounds = new ArrayIndexOutOfBounds();

        try {
            arrayIndexOutOfBounds.indexOutOf();
        } catch (ArrayIndexOutOfBoundsException boundsException) {
            System.out.println(boundsException.getMessage());
        }
    }
}
