package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask05;
import java.util.logging.Logger;

public class Task05 {
    public static void printAllLettersInWord(String str) throws MyExceptionTask05 {
        try {
            for (int i = 0; i <= str.length(); i++) {
                char a = str.charAt(i);
                System.out.println(a);
            }
        } catch (Exception e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.toString());
            throw new MyExceptionTask05(e.getMessage(), "this is my exception");
        }
    }
}
