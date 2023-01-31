package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.StringException;

import java.util.Objects;

public class Task1 {
    String blank;

    public Task1() {
        this.blank = null;
    }

    public String convertToUpperCase() throws StringException {
        if (!Objects.equals(blank,null)) {
            return blank.toUpperCase();
        } else {
            throw new StringException("String can not be null");
        }
    }
}
