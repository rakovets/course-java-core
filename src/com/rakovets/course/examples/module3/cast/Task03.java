package com.rakovets.course.examples.module3.cast;

import com.rakovets.course.examples.module3.util.helper.TypeCaster;

/**
 * Переполнение и потеря точности при явном приведение типов.
 */
public class Task03
{
    public static void main(String[] args)
    {
        // overflow переполнение типа
        short maxValue = 256;
        byte bb = (byte) maxValue;
        System.out.println("overflow short to byte " + maxValue + " -> " + bb);

        // underflow потеря точности
        double d1 = 1 / 3.0;
        float f1 = (float) d1;
        System.out.println("underflow double to float " + d1 + " -> " + f1);

        float f3 = 3.64f;
        int i3 = (int) f3; // дробная часть отбрасывается
        System.out.println("underflow float to int " + f3 + " -> " + i3);
        TypeCaster.main(null);
    }
}
