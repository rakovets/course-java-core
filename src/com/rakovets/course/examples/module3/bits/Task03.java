package com.rakovets.course.examples.module3.bits;

import com.rakovets.course.examples.module3.util.helper.Binary;
import com.rakovets.course.examples.module3.util.helper.BitOperationViewer;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * 
 * Битовые операторы - ИЛИ (OR)
 */
public class Task03
{
    public static void main(String[] args)
    {
        final int one = 123;
        final int two = 456;
        Binary.printToBinary(one);
        System.out.println(" |");
        Binary.printToBinary(two);
        System.out.println(" =");
        int i = one | two; // OR - битовое или
        Binary.printToBinary(i);
        
        System.out.println(i);
        System.out.println();

        // ******************************************************
        
        //float f = 1.0f & 2.3f;
        //float f = 1.0f >> 2;
        BitOperationViewer.main(new String[]{"OR"});
    }
}