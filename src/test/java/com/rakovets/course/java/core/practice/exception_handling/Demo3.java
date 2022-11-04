package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;

public class Demo3 {
    public static final Logger logger = Logger.getLogger(Demo3.class.getName());
        public static void main(String[] args) {
            int year = 2025;
            try {
                new Task3().BirthYear(year);
            } catch (BirthYearException e) {
                logger.severe(e.getMessage());
            }
        }
}

