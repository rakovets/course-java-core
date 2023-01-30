package com.rakovets.course.java.core.practice.exception_handling.task3;

import com.rakovets.course.java.core.practice.exception_handling.task3.exeptions.MyException;

public class MyExceptionTryDemo {
    public static void main(String[] args) {
        MyExceptionTry myExceptionTry = new MyExceptionTry();

        try {
            myExceptionTry.isAgeValid(17);
        } catch (MyException myException) {
            myException.printStackTrace();
        }
    }
}
