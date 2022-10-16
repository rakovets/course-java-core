package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public void array(int[] array, int indexArray) {
        if (array.length < indexArray) {
            throw new ArrayIndexOutOfBoundsException("Array index out bounds!");
        }
    }
}
