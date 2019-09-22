package com.rakovets.course.examples.module3.condition;

/**
 * 
 * Групповой оператор или блочный оператора
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        int buyCount = 1;
        int age = 12;
        if (age > 18)
            buyCount++;
        System.out.print("Продано водки " + buyCount);

        // FIXME исправь пример, с помощью группавого оператора (фигурных скобок), таким образом
        // чтобы водка не продовалась совершеннолетним
    }
}