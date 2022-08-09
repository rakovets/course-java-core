package com.rakovets.course.java.core.practice.date_and_time;

public class DateException extends Exception {
    public DateException(String message) {
        super(message);
    }

    public DateException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateException(Throwable cause) {
        super(cause);
    }
}
