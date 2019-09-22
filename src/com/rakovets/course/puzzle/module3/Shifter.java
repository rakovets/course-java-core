package com.rakovets.course.puzzle.module3;

import com.rakovets.course.examples.module3.util.helper.Binary;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

public class Shifter
{
    public static void main(String[] args)
    {
        for (byte i = 1; i < Byte.MAX_VALUE && i != 0; i <<= 1)
        {
            Binary.printToBinary(i);
        }
        System.out.println();
        for (short i = 1; i < Short.MAX_VALUE && i != 0; i <<= 1)
        {
            Binary.printToBinary(i);
        }
        System.out.println();
        for (int i = 1; i < Integer.MAX_VALUE && i != 0; i <<= 1)
        {
            Binary.printToBinary(i);
        }
    }
}
