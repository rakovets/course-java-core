package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task06 {
    /* создать метод случайным образом выбрасывающий одно из 3-х различных исключений
     * вызвать этот метод в блоке `try ... catch`
     * отловить и обработать эти исключения
     ** два из них имею одинаковую обработку
     ** обработка третьего должна отличаться от 2-х других
     */

    public static void main(String[] args) throws Exception {
        try {
            ramdom();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("LOOOLZ");
        } catch (ArithmeticException e) {
            System.out.println("Ex.art");
        }
    }

    public static void ramdom() throws Exception {
        Random b = new Random();
        int a = b.nextInt(3);
        switch (a) {
            case 0:
                throw new NullPointerException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new ArithmeticException();
        }
    }
}
