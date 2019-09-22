package com.rakovets.course.examples.module3.condition;

/**
 * 
 * Оператор выбора альтернативного решения
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        int x = 3;
        if (x > 3)
            System.out.println(++x);
        // x++;
        else
            System.out.println(--x);

        if (x < 3 || x > 5)
            System.out.println(x += 4);
        else
            System.out.println(x -= 2);
        // else System.out.println(--x); // может быть только один else после if
    }
}
