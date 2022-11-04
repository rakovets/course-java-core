package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Demo5 {
    private static final Logger logger = Logger.getLogger(Demo5.class.getName());
    public static void main(String[] args) {
        try {
           new Task5().divisionToZero(2);
        } catch (DivisionToZero e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }
    }
}
