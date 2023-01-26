package com.rakovets.course.java.core.practice.exception_handling.task5;

public class IndexOutOfBounds {
    int[] array = new int[1];

    void exception() throws IndexOutOfBoundsException {
        try {
            array[1] = 1;
        } catch (IndexOutOfBoundsException exception) {
            throw new IndexOutOfBoundsException(exception.getMessage());
        }
    }
}
