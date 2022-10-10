package com.rakovets.course.java.core.practice.exception_handling;

public class ArrayIndexOutOfBoundsExceptionTest {
    private int[] array;

    public ArrayIndexOutOfBoundsExceptionTest() {
        this.array = array;
    }

    public int[] firstMethod(int n) throws ArrayIndexOutOfBoundsException {
        int[] arrayOne = new int[0];
        for (int i = 0; i < n; i++) {
            arrayOne[i] = i;
            n++;
            i++;
        }
        return arrayOne;
    }
}
