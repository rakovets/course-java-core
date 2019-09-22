package com.rakovets.course.examples.module3.using;

/**
 * 
 * Обмен значениями переменных без использования дополнительной переменной.
 * Используя исключающее или
 * 
 */
public class Task01
{
    public static void main(String[] args)
    {
    	System.out.println("Начальные значения");
    	int x = 16;
        
        int y = 32;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println();

        x = x ^ y;
        System.out.println("Шаг 1");
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println();

        y = y ^ x;
        System.out.println("Шаг 2");
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println();

        x = x ^ y;
        System.out.println("Шаг 3");
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println();
        
        System.out.println("Результат");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}