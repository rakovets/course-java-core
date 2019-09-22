package com.rakovets.course.examples.module3.cast;

/**
 * Потеря точности и переполнения при явном приведение типов.
 */
public class Task01
{
    public static void main(String[] args)
    {
        // underflow потеря точности при не явном приведении типов
        int bigNumber = 1234567890;
        float approximate = bigNumber;
        System.out.printf("%d <> %f\n", bigNumber, approximate);

        // overflow переполнение типа
        byte bMax = 127; // 127 максимальное значение для типа byte
        bMax++; // увеличиваем на 1
        System.out.println(bMax);

        bMax--; // уменьшаем на 1
        System.out.println(bMax);
    }
}
