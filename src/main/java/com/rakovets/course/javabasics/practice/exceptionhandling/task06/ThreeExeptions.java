package com.rakovets.course.javabasics.practice.exceptionhandling.task06;

public class ThreeExeptions {


    public int getRandomExeption() throws ArrayIndexOutOfBoundsException, ArithmeticException, StringIndexOutOfBoundsException {

        int randomNum = (int) (Math.random() * 5);
        int[] array = new int[1];
        String string = "Java";
        array[randomNum] = 2;
        string.charAt(randomNum);
        double dev = 23 / randomNum;
        return randomNum;
    }
}
