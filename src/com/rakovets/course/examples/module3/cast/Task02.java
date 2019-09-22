package com.rakovets.course.examples.module3.cast;

/**
 * Явное приведение типов. Сужающее преобразование. Указывается программистом в
 * коде.
 */
public class Task02
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        double d = 0.5;
        float f = (float) d; // явное приведение типа

        d = 1.0 - 0.9;
        f = (float) d;
        // System.out.println(f1);

        long l = (long) f; // явное приведение типа
        int i = (int) l; // явное приведение типа
        i = (int) f; // явное приведение типа

        short sh = (short) i; // явное приведение типа
        sh = (short) l; // явное приведение типа
        sh = (short) f; // явное приведение типа

        byte b = 50;
        // b = b *2; // ошибка неявного приведения

        b = (byte) sh;
        b = (byte) i;
        b = (byte) l;
        b = (byte) f;
        b = (byte) d;

        boolean b1 = true;
        // int i = (int) b1; // ошибка
    }
}
