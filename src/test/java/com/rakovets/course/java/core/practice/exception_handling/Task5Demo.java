package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CheckedArrayBoundException;
import com.rakovets.course.java.core.practice.exception_handling.exception.IllegalTimeException;

public class Task5Demo {
    public static void main(String[] args) {
        Task5 arr = new Task5();

        try {
            arr.createFillNumsArray(3, 4, 1);
        } catch (CheckedArrayBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
