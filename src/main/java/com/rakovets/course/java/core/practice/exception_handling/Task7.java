package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task7 {
    public double throwExceptionFiftyPercent(int num) throws FileNotFoundException {
        if (num >= 0 && num <= 49) {
            throw new FileNotFoundException("This is FileNotFoundException");
        } else if (num >= 49 && num < 100) {
            throw new IndexOutOfBoundsException("This is Runtime IndexOutOfBoundsException");
        }
        return num;
    }
}
