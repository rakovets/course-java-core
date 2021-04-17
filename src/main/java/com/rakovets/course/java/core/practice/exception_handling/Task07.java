package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task07 {
    /*
     * написать метод, который в 50% случаев бросает исключение
     * вызвать этот метод в конструкции `try ... catch ... finally`
     * протестировать работу блока `finally`

     */


    public static void main(String[] args) throws Exception {
        try {
            ramdom();
        } catch (ArithmeticException e) {
            System.out.println("Ex.art");
        } finally {
            System.out.println("Finally has been activated");
        }
    }

    public static void ramdom() throws Exception {
        Random b = new Random();
        int a = b.nextInt(2);
        switch (a) {
            case 0:
                throw new ArithmeticException();
        }
    }
}


