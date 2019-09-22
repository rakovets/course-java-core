package com.rakovets.course.examples.module3.bits;

import com.rakovets.course.examples.module3.util.helper.Binary;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * 
 * Многократный беззнаковый сдвиг вправо
 *
 */
public class Task12
{
    public static void main(String[] args)
    {
        int value = 0xF0F0F0F0;
        // сдвиг битов вправо на 32 разряда тоже вернет биты в начальное положение
        Binary.printToBinary(value >> 16);
        // точно так же как и беззнаковый
        Binary.printToBinary(value >>> 16);
        // FIXME исправь сдвиг на 32
    }
}