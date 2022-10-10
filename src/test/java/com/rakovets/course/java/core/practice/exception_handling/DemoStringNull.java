package com.rakovets.course.java.core.practice.exception_handling;

/**
 * Specification of task 1
 * <p>
 * Class Task
 * создать метод в котором объявить переменную типа String со значением null
 * вызвать любой метод у этой переменной
 * <p>
 * Class Demo
 * вызвать этот метод
 * отловить возникшее исключение
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoStringNull {
    public static void main(String[] args) {
        String next = "";
        StringNull stringNull = new StringNull();
        try {
            stringNull.anyMethod(next);
        } catch (NullPointerException ignored) {
            final Logger logger = Logger.getLogger(DemoStringNull.class.getName());
            logger.log(Level.WARNING, "You're doing something wrong");
        }
    }
}
