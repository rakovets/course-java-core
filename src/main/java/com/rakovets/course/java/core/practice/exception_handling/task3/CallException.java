package com.rakovets.course.java.core.practice.exception_handling.task3;

import com.rakovets.course.java.core.practice.exception_handling.task3.exeptions.ExceptionClass;

public class CallException {
    public void calLException(int age) throws ExceptionClass {
            if (age < 18) {
                throw new ExceptionClass("We don't sell alcohol to person under 18!");
            }
    }
}
