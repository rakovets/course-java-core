package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.isEmptyException;

public class Task04 {
    private String messageInException;
    private final String GUN_IS_FULL = "There are max count of bullets.";

    public Task04(String messageInException) {
        this.messageInException = messageInException;
    }

    public String isEmpty(int countOfBulletsAtMoment) throws isEmptyException {
        if (countOfBulletsAtMoment <= 0) {
            throw new isEmptyException(messageInException);
        } else {
            return GUN_IS_FULL;
        }
    }
}
