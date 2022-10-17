package com.rakovets.course.java.core.practice.exception_handling.task07;

import java.util.logging.Logger;

public class DemoTask07 {
    public static final Logger logger = Logger.getLogger(DemoTask07.class.getName());

    public static void main(String[] args) {
        String str = "2";
        Task07 task07 = new Task07();
        try {
            task07.stringToDigit(str);
        } catch (StringToNumber | NumberFormatException e) {
            logger.warning(e.getMessage());
        } finally {
            logger.info("Program is end");
        }
    }
}
