package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CountOfElementsIsNegativeException;

public class Task05 {
    private final int ZERO = 0;

    public String getIndexInArray(int index, int[] array) throws CountOfElementsIsNegativeException {
        try {
            if (!(index <= array.length - 1 && index >= ZERO)) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CountOfElementsIsNegativeException(e.getMessage());
        }
        return String.valueOf(array[index]);
    }
}
