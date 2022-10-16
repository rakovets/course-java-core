package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask06;
import java.util.logging.Logger;

public class Task06 {
    public static void printArray(int par1, int par2, int par3, String par4) throws MyExceptionTask06 {
        try {
            int[] array = new int[par1];
            for (int i = par2; i < par1; i++) {
                array[i] += i + 1;
                array[i] /= par3;
                System.out.println(array[i]);
            }
            System.out.println(array[Integer.parseInt(par4)]);
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
