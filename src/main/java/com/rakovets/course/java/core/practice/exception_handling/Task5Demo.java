package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.NullException;
import com.rakovets.course.java.core.practice.exception_handling.model.Task_5;

public class Task5Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task_5.getNullPointerException(null));
        } catch (NullException ex) {
            System.out.print(ex.getMessage() + " " + ex.getDebugMessage());
        }
    }
}
