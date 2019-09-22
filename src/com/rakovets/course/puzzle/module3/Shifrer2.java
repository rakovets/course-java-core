package com.rakovets.course.puzzle.module3;

import com.rakovets.course.examples.module3.util.helper.Binary;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

public class Shifrer2
{
    public static void main(String[] args)
    {
        for (int i = Integer.MIN_VALUE; i < -1; i >>= 1)
        {
            Binary.printToBinary(i);
        }
        System.out.println();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE && i != 0; i >>>= 1)
        {
            Binary.printToBinary(i);
        }
    }
}