package com.rakovets.course.java.core.example.exception_handling.model.task5;

import com.rakovets.course.java.core.example.exception_handling.task5.CustomNulException;
import com.rakovets.course.java.core.example.exception_handling.task5.Task5;

public class Task5Demo {
    public static void main (String[] args)  {
        try {
            Task5.someExceptionMethod();
        } catch (CustomNulException e) {
            System.err.println(e.getMessage());
        }
    }
}
