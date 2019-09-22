package com.rakovets.course.examples.module3.using;

/**
 * 
 * Перегруженные операторы. Тип результата зависит от типа операндов.
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        boolean resultLogic = true | false;
        int resultInt = 1 | 3;
        System.out.println(resultLogic); // логическое ИЛИ
        System.out.println(resultInt); // битовое ИЛИ

        System.out.println(true & false); // логическое И
        System.out.println(1 & 3); // битовое И

        System.out.println(true ^ false); // логическое исключающее ИЛИ
        System.out.println(1 ^ 3); // битовое исключающее ИЛИ

        // System.out.println(~true);
        System.out.println(~2);
    }
}