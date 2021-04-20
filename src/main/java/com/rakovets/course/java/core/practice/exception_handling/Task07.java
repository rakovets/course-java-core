package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    int i = 0;
    public int random50PercentException(int i) throws Exception {
        if (i == 1) {
            throw new Exception();
        } else {
            return i;
        }
    }
}
