package com.rakovets.course.java.core.practice.exception_handling.task3;

import com.rakovets.course.java.core.practice.exception_handling.task3.exeptions.MyException;

public class MyExceptionTry {
    public void isAgeValid(int age) throws MyException {
        if (age < 18) {
                throw new MyException("We don't sell alcohol to person under 18!");
        }
    }
}
