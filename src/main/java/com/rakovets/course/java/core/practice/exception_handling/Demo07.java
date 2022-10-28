package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExeptionTask07;

import java.util.logging.Logger;

public class Demo07 {
    public static void main(String[] args) {
        final int MAXIMUM_SIZE_OF_ARRAY = 10;
        int sizeOfArray = 11;
        int startToPrintArray = 1;
        int endToPrintArray = 10;
        Task07 task07 = new Task07();
        try {
            task07.printArray(sizeOfArray, startToPrintArray, endToPrintArray, MAXIMUM_SIZE_OF_ARRAY);
        } catch (MyExeptionTask07 e) {
            Logger logger = Logger.getLogger(Demo07.class.getName());
            logger.warning(e.toString());
        } finally {
            if (sizeOfArray > MAXIMUM_SIZE_OF_ARRAY) {
                sizeOfArray = 10;
                task07.printArray2(sizeOfArray, startToPrintArray, endToPrintArray);
            }
        }
    }
}
