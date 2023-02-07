package com.rakovets.course.java.core.practice.exception_handling.tasks;

public class NullPointerExceptionSimulation {
    public void callException() {
        String someString = null;
        someString.length();
    }
}
