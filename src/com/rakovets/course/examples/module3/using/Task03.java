package com.rakovets.course.examples.module3.using;

import com.rakovets.course.examples.module3.util.helper.Binary;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * 
 * Обратный код
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        int i = 10;
        Binary.printToBinary(i);
        i = ~i; // инвертирование битов числа
        Binary.printToBinary(i);
        i++; // прибавлении еденицы
        Binary.printToBinary(i);
        System.out.println(i);
    }
}