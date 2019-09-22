package com.rakovets.course.examples.module3.using;

import com.rakovets.course.examples.module3.util.helper.Binary;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * Применение битовых операций. Упаковка и распоковка нескольких значений в
 * значение одной переменной.
 *
 */
public class Task00
{
    public static void main(String[] args)
    {
        byte age = 28; // 00011100
        short height = 185; // 10111001
        byte weight = 80; // 01010000

        System.out.print("Age    = ");
        Binary.printToBinary(age);
        System.out.print("Weight = ");
        Binary.printToBinary(weight);
        System.out.print("Height = ");
        Binary.printToBinary(height);

        // кодирование несколько чисел в одно
        int combined = (age) | (height << 8) | (weight << 16);

        System.out.println();
        System.out.println("Закодированное число = " + combined);
        System.out.println();
        System.out.println("          Битовое представление");
        System.out.println("        \u250cweight\u2510\u250cheight\u2510\u250c\u2500\u2500age\u2500\u2510");
        Binary.printToBinary(combined);
        System.out.println();

        // Извлечение скрытой информации
        int mask = 0xff; // 11111111
        System.out.print("Маска ");
        Binary.printToBinary(mask);
        age = (byte) (mask & combined);
        height = (short) (mask & combined >>> 8);
        weight = (byte) (mask & combined >>> 16);
        System.out.printf("Decode values Age: %d, height: %d, weight: %d \n", age, height, weight);

    }
}