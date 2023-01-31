package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.FirstException;
import com.rakovets.course.java.core.practice.exception_handling.exception.SecondException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ThirdException;

import java.io.FileNotFoundException;
import java.util.Random;

public class Task6 {

    public void generateException() throws FirstException, SecondException, ThirdException {
        int random = (int) (Math.random()*3+1);
        if (random == 1) {
            throw new FirstException("First error");
        } else if (random == 2) {
            throw new SecondException("Second error");
        } else if (random == 3) {
            throw new ThirdException("Third error");
        }
    }
}
