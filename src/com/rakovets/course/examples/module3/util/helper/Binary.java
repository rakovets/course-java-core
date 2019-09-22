package com.rakovets.course.examples.module3.util.helper;

import java.util.Arrays;

/**
 * Вспомогательный класс предназначеный для дополнения нулями строкового
 * представления двоичных чисел. Почему этого велосипеда нет в JDK для меня
 * загадка.
 * 
 * @author VUnguryan
 *
 */
public class Binary
{
    public static void printToBinary(long value)
    {
        print(toBinary(Long.SIZE, value));
    }

    public static void printToBinary(int value)
    {
        print(toBinary(Integer.SIZE, value));
    }

    public static void printToBinary(short value)
    {
        print(toBinary(Short.SIZE, value));
    }

    public static void printToBinary(byte value)
    {
        print(toBinary(Byte.SIZE, value));
    }

    public static void printSpaceToBinary(byte value)
    {
        String string = String.format("%8s", Integer.toBinaryString(value)).replace(' ', '0');
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++)
        {
            builder.append(string.charAt(i)).append("   ");
        }
        System.out.println(builder.toString());
    }

    public static String toBinary(int bits, long n)
    {
        String stringBits = Long.toBinaryString(n);
        if (n >= 0)
        {
            char[] zeros = new char[bits - stringBits.length()];
            Arrays.fill(zeros, '0');
            String zerosStrings = new String(zeros);
            return zerosStrings + stringBits;
        }
        else
        {
            return stringBits.substring(Long.SIZE - bits);
        }
    }
    private static void print(String value){
        System.out.println(value);
    }
}