package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class FiftyFifty {

    public void getExceptionFiftyFifty() throws RuntimeException {

        Random random = new Random();
        int fiftyFifty = random.nextInt(2);
        int[] array = new int[1];
        array[fiftyFifty] = 2;
    }
}
