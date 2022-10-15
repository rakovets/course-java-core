package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

import static com.rakovets.course.java.core.practice.exception_handling.Task02.getSumOfFirstNumbersOfArray;

public class Demo02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int num = 6;
        try {
            int sum = getSumOfFirstNumbersOfArray(array, num);
            System.out.printf("сумма первых %d чисел массива составляет %d", num, sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger logger = Logger.getLogger(JavaUtilLogging02.class.getName());
            logger.warning(e.toString());
            e.printStackTrace();
        }
    }
}
