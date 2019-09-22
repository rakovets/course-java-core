package com.rakovets.course.examples.module3.condition;

/**
 * 
 * Оператор алгоритма ветвления
 */
public class Task01
{
    public static void main(String[] args)
    {
        int x = 15;
        if (x < 3)
            System.out.println("Меньше");
        if (x > 3)
            System.out.println("Больше");
        if (x == 3)
            System.out.println("Равно");
        if (x != 3)
            System.out.println("Не равно");

        if (x > 3)
            ++x;
        x--;

        // if (x + 5) x++; !!!

        System.out.println(x);
    }
}