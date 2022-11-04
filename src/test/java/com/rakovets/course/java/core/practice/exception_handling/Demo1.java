package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;
public class Demo1 {
    public static final Logger logger = Logger.getLogger(Demo1.class.getName());
    public static void main(String[] args) {
        try {
            new Task1().getName();
        } catch (NullPointerException e) {
            logger.info("Empty string");
        }
    }
}
