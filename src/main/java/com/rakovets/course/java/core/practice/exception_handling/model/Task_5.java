package com.rakovets.course.java.core.practice.exception_handling.model;

import com.rakovets.course.java.core.practice.exception_handling.exception.NullException;

public class Task_5 {

    Task_5(String string) {
    }
    public static String getNullPointerException(String string) throws NullException {
        try {
            return string.toUpperCase();
        } catch (NullPointerException ex) {
            throw new NullException("You defined null.", "NullPointedException is catched.");
        }
    }
}
