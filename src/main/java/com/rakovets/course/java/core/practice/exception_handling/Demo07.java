package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExeptionTask07;
import static com.rakovets.course.java.core.practice.exception_handling.Task07.printArray;
import static com.rakovets.course.java.core.practice.exception_handling.Task07.printArray2;
import java.util.logging.Logger;

public class Demo07 {
    public static void main(String[] args) {
        int parameter1 = 11;
        int parameter2 = 1;
        int parameter3 = 10;
        try {
            printArray(parameter1, parameter2, parameter3);
        } catch (MyExeptionTask07 e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.toString());
        } finally {
            parameter1 = 10;
            printArray2(parameter1, parameter2, parameter3);
        }
    }
}
