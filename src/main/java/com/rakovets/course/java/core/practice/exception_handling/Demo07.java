package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExeptionTask07;
import static com.rakovets.course.java.core.practice.exception_handling.Task07.printArray;
import static com.rakovets.course.java.core.practice.exception_handling.Task07.printArray2;
import java.util.logging.Logger;

public class Demo07 {
    public static void main(String[] args) {
        int sizeOfArray = 11;
        int startToPrintArray = 1;
        int endToPrintArray = 10;
        try {
            printArray(sizeOfArray, startToPrintArray, endToPrintArray);
        } catch (MyExeptionTask07 e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.toString());
        } finally {
            sizeOfArray = 10;
            printArray2(sizeOfArray, startToPrintArray, endToPrintArray);
        }
    }
}
