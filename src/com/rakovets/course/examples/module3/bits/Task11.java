package com.rakovets.course.examples.module3.bits;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * 
 * Многократный сдвиг влево
 *
 */
public class Task11
{
    public static void main(String[] args)
    {
        int value = 0xFFFFFFFF;
        // сдвиг битов влево на 32 разряда вернет биты числа в начальное
        // состояние
        value <<= 32;
        printToBinary(value);
    }
}