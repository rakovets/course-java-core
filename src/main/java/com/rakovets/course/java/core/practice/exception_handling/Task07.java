package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExeptionTask07;

public class Task07 {
    public static void printArray(int parameter1, int parameter2, int parameter3) throws MyExeptionTask07{
        if (parameter1 > 10) {
            throw new MyExeptionTask07("Pазмер массива не может превышать 10. ", "Введеите меньшее число меньше 10 для размера массива.");
        }
        int[] array = new int[parameter1];
        for (int i = parameter2 - 1; i < parameter3; i++) {
            array[i] += i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray2(int parameter1, int parameter2, int parameter3) {
        int[] array = new int[parameter1];
        for (int i = parameter2 - 1; i < parameter3; i++) {
            array[i] += i + 1;
            System.out.print(array[i] + " ");
        }
    }
}
