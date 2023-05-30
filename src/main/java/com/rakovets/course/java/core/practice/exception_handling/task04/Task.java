package com.rakovets.course.java.core.practice.exception_handling.task04;

public class Task {
    public class newException extends RuntimeException {
        public newException(String message) {
            super(message);
        }
    }

    public void outException() throws newException {
        throw new newException("RuntimeException");
    }
}
