package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask06;
import java.util.logging.Logger;

public class Task06 {
    public static void printArray(int sizeOfArray, int startToPrintArray, int dividerOfArrayMembers, String numberOfArrayMemberToSeparatePrint) throws MyExceptionTask06 {
        try {
            int[] array = new int[sizeOfArray];
            for (int i = startToPrintArray; i < sizeOfArray; i++) {
                array[i] += i + 1;
                array[i] /= dividerOfArrayMembers;
                System.out.print(array[i] + " ");
            }
            System.out.println(array[Integer.parseInt(numberOfArrayMemberToSeparatePrint)]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.toString());
            throw new MyExceptionTask06(e.getMessage(), "Ошибка при обработке массива чисел");
        } catch (ArithmeticException e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.toString());
            throw new MyExceptionTask06(e.getMessage(), "Деление на ноль");
        }
    }
}
