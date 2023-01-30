package com.rakovets.course.java.core.practice.exception_handling.task5;

public class IndexOutOfBoundsDemo {
    public static void main(String[] args) {
        IndexOutOfBounds indexOutOfBounds = new IndexOutOfBounds();

        try {
            indexOutOfBounds.exception();
        }  catch (IndexOutOfBoundsException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
