package com.rakovets.course.java.core.practice.exception_handling.task3;

public class Mark {
    private int mark;

    public Mark(int mark) {
        this.mark = mark;
    }

    public int getMark() throws MarkException {
        if (mark >= 1 && mark <= 10) {
            return mark;
        } else {
            throw new MarkException("Such marks are not used in school");
        }
    }
}
