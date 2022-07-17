package com.rakovets.course.java.core.practice.exception_handling;

public class NpeTask {
    public void produceNullPointerException() {
        String string = null;
        string.trim();
    }
}
