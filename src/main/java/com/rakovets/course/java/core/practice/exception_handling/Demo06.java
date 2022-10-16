package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask06;
import static com.rakovets.course.java.core.practice.exception_handling.Task06.printArray;
import java.util.logging.Logger;

public class Demo06 {
    public static void main(String[] args) {
        int parameter1 = 4;
        int parameter2 = 0;
        int parameter3 = 0;
        String parameter4 = "q";
        try {
            printArray(parameter1, parameter2, parameter3, parameter4);
        } catch (MyExceptionTask06 e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.getMessage());
            logger.warning(e.getDebugMessage());
            logger.warning(e.getMessage() + " " + e.getDebugMessage());
        }
    }
}
