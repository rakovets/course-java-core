package com.rakovets.course.java.core.practice.exception_handling.task_5;

public class ExistObjectException extends NullPointerException {

    public ExistObjectException(NullPointerException e, String description) {
        super(description);
    }

}
