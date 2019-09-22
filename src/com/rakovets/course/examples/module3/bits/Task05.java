package com.rakovets.course.examples.module3.bits;

import com.rakovets.course.examples.module3.util.helper.BitOperationViewer;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * 
 * Битовые операции - Исключающее ИЛИ (XOR)
 *
 */
public class Task05
{
    public static void main(String[] args)
    {
        final int one = 123;
        final int two = 456;
        printToBinary(one);
        System.out.println(" ^");
        printToBinary(two);
        System.out.println(" =");
        int i = one ^ two; // XOR битовое исключающее ИЛИ
        printToBinary(i);
        System.out.println(i);
        System.out.println();
        
        BitOperationViewer.main(new String[]{"XOR"});
    }
}