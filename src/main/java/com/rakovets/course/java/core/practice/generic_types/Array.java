package com.rakovets.course.java.core.practice.generic_types;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Array <N extends Number> {
    private N[] array;

    public Array(N[] array) {
        this.array = array;
    }

    // Task 1.
    public void fillArray() {
        Scanner sc = new Scanner(System.in);
        if (this.getArray() instanceof Double[]) {
            Double[] arrayScanner = new Double[this.array.length];

            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextDouble()) {
                    arrayScanner[i] = sc.nextDouble();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
    }

    // Task 2.
    public static void fillArrayRandom(Byte[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) (random.nextInt(256) - 128);
        }
    }

    // Task 3.
    @Override
    public String toString() {


        return "";
    }

    public N[] getArray() {
        return array;
    }
}
