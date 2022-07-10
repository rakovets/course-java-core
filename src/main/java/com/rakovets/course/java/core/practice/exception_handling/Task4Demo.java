package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.EmptinessException;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 txt = new Task4();
        try {
            txt.getText(null);
        } catch (EmptinessException e) {
            e.printStackTrace();
        }
    }
}
