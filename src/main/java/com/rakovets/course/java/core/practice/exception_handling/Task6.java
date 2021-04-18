package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    static int random = 1 + (int) ( Math.random() * 3 );

    public static int choiceUrDestiny() throws NullPointerException,ArrayIndexOutOfBoundsException,ArithmeticException{
        switch (random){
            case 1: {
                throw new NullPointerException("Random 1");
            }
            case 2:{
                throw new ArrayIndexOutOfBoundsException("Random 2");
            }
            case 3:{
                throw new ArithmeticException("Random 3");
            }
        }
        return random;
    }

}
