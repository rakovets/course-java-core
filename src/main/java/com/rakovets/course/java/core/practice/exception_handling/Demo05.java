package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask05;

import java.util.logging.Logger;

import static com.rakovets.course.java.core.practice.exception_handling.Task05.printAllLettersInWord;

public class Demo05 {
    public static void main(String[] args) {
        String string = "test";
        try {
            printAllLettersInWord(string);
        } catch (MyExceptionTask05 e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.getMessage());
            logger.warning(e.getDebugMessage());
            logger.warning(e.getMessage() + " " + e.getDebugMessage());
        }
    }
}
