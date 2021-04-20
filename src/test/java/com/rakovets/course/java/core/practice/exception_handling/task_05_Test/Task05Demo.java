package com.rakovets.course.java.core.practice.exception_handling.task_05_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_05.Array;
import com.rakovets.course.java.core.practice.exception_handling.task_05.MyException;

public class Task05Demo {
    public static void main(String[] args) {
        try {
            Array.getFromArray(3);
        } catch (Exception e) {
            throw new MyException(e.getMessage());
        }
    }
}

