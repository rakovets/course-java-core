package com.rakovets.course.puzzle.module3;

/**
 * 
 * Эта программа использует комбинированный оператор присваивания  исключающего 
 * ИЛИ. Техника, которую он иллюстрирует является частью программного
 * фольклора. Что напечатает программа? Как ее исправить?
 * 
 */

public class CleverSwap
{
    public static void main(String[] args)
    {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}
