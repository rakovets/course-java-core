package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    int[] intArray = {1, 2, 3};

    public int getElement(int index) throws ArrayIndexOutOfBoundsException {
        if (index < intArray.length) {
            return intArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Wrong index!!!");
        }
    }
}
