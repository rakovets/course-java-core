package com.rakovets.course.examples.module3.input;

import java.io.IOException;

/**
 * 
 * Ввод символа с клавиатуры
 * 
 */
public class Task00
{
    public static void main(String[] args) throws IOException
    {
        // возвращает код символа
        int symbolCode = System.in.read();
        System.out.println("Вы ввели: " + (char) symbolCode);
        System.out.println("Код символа: " + symbolCode);
        System.out.println("Код символа в UTF-8: " + Integer.toHexString(symbolCode));
    }
}