package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.LongCheckUserNameException;

public class Task03 {
    public void longCheckUserName(String userName) throws LongCheckUserNameException {
        if (userName.length() < 3) {
            throw new LongCheckUserNameException("Short user name!");
        }
    }
}
