package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExeptionTask07;

public class Task07 {
    public static void printArray(int sizeOfArray, int startToPrintArray, int endToPrintArray) throws MyExeptionTask07{
        if (sizeOfArray > 10) {
            throw new MyExeptionTask07("Pазмер массива не может превышать 10. ", "Введеите меньшее число меньше 10 для размера массива.");
        }
        int[] array = new int[sizeOfArray];
        for (int i = startToPrintArray - 1; i < endToPrintArray; i++) {
            array[i] += i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray2(int sizeOfArray, int startToPrintArray, int endToPrintArray) {
        int[] array = new int[sizeOfArray];
        for (int i = startToPrintArray - 1; i < endToPrintArray; i++) {
            array[i] += i + 1;
            System.out.print(array[i] + " ");
        }
    }
}
