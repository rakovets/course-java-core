package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask06;
import static com.rakovets.course.java.core.practice.exception_handling.Task06.printArray;
import java.util.logging.Logger;

public class Demo06 {
    public static void main(String[] args) {
        int sizeOfArray = 4;
        int startToPrintArray = 0;
        int dividerOfArrayMembers = 0;
        String numberOfArrayMemberToSeparatePrint = "q";
        try {
            printArray(sizeOfArray, startToPrintArray, dividerOfArrayMembers, numberOfArrayMemberToSeparatePrint);
        } catch (MyExceptionTask06 e) {
            Logger logger = Logger.getLogger(Demo06.class.getName());
            logger.warning(e.getMessage());
            logger.warning(e.getDebugMessage());
            logger.warning(e.getMessage() + " " + e.getDebugMessage());
        }
    }
}
