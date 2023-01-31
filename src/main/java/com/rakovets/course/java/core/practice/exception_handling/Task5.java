package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyException;

public class Task5 {
    int[] intArray = {1,2,3};

    void printElement(int index) throws MyException {
        if (index < intArray.length) {
            System.out.println(intArray[index]);
        } else {
            throw new MyException(new RuntimeException());
        }
    }
}
