package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.FactorialException;

public class Demo3 {
    public static void main(String[] args) {
        Task3 t3 = new Task3();
        try {
            t3.calculate(0);
        } catch (FactorialException e) {
            e.printStackTrace();
        }
    }
}
