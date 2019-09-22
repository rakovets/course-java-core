package com.rakovets.course.examples.module3.bits;

import com.rakovets.course.examples.module3.util.helper.Binary;
import com.rakovets.course.examples.module3.util.switcher.BitsSwitcher;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * 
 * Побитовое представления числа
 */
public class Task00
{
    public static void main(String[] args)
    {
        byte bb = 10;
        System.out.println("Двоичное представление числа типа byte");
        Binary.printToBinary(bb);
        System.out.println();
        
        short sh = 10;
        System.out.println("Двоичное представлени числа типа short");
        Binary.printToBinary(sh);
        System.out.println();
        
        int in = 10;
        System.out.println("Двоичное представлени числа типа int");
        Binary.printToBinary(in);
        System.out.println();
        
        long lb = 10;
        System.out.println("Двоичное представлени числа типа long");
        Binary.printToBinary(lb);
        // FIXME измени числа на отрицательные, сравни результат
        BitsSwitcher.main(null);
    }
}