package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.StringException;

public class Demo1 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        try {
            t1.convertToUpperCase();
        } catch (StringException e) {
            e.printStackTrace();
        }
    }
}
