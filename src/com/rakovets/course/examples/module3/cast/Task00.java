package com.rakovets.course.examples.module3.cast;

/**
 * Не явное приведение типов. Расширение типа. Призводится компилятором и
 * возможно только от меньшего размера к большему.
 * 
 * @author VUnguryan
 * 
 */
public class Task00
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // не явные преобразования примитивных типов
        byte byteType = 1;
        
        // не явное приведение типа byte к типу short
        short shortType = byteType; 
        System.out.println(shortType);
        char c = 'A'; 
        // ****************************
        // char c1 = b; // нельзя не совпадают размерности
        // ****************************

        // ****************************
        // не смотря на то, что размерность типов совпадает, нельзя так как char
        // беззнаковый тип
        // char c2 = sh;
        // ****************************

        // ****************************
        int intType = byteType; // byte к int
        int i1 = shortType; // short к int
        // ****************************

        // ****************************
        long longType = byteType; // byte к long
        long l1 = shortType; // short к long
        long l2 = intType; // int к long
        // ****************************

        // ****************************
        float f = byteType; // byte к float
        float f1 = shortType; // short к float
        float f2 = intType; // int к float
        float f3 = longType; // long к float
        float f4 = c; // long к float
        // ****************************

        // ****************************
        double doubleType = byteType;
        double d1 = shortType;
        double d2 = shortType;
        double d3 = intType;
        double d4 = longType;
        double d5 = f;
        double d6 = c;
        // ****************************
    }
}