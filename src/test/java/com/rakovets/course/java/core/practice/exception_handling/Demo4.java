package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DerivativeFromRunTimeException;

public class Demo4 {
    public static void main(String[] args) {
        Task4 t4 = new Task4();
        try {
            t4.divide(20,0);
        } catch (DerivativeFromRunTimeException ex) {
            ex.printStackTrace();
        }

    }
}
