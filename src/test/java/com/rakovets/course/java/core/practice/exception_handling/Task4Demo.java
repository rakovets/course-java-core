package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.IllegalTimeException;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 time = new Task4(21, 21);

        try {
            time.setCurrentTime(23, 61);
        } catch (IllegalTimeException e) {
            e.printStackTrace();
        }
    }
}
