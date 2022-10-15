package com.rakovets.course.java.core.practice.exception_handling.task05;

import java.util.logging.Logger;

public class DemoTask05 {
    public static final Logger logger = Logger.getLogger(DemoTask05.class.getName());

    public static void main(String[] args) {
        InputNumber inputNumber = new InputNumber();
        try {
            inputNumber.inputExampleMethod();
        } catch (NotNumberException e) {
            e.printStackTrace();
            logger.warning("Error: ".concat(e.getMessage()));
        }
    }
}
