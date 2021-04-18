package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task07 {
    public void throwException50Percent() throws FileNotFoundException {
        int wtf = 0;
        switch ((int) (Math.random() * 3)) {
            case 1:
                throw new FileNotFoundException();
            case 2:
                wtf = wtf++ + ++wtf;
        }
    }
}
