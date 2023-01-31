package com.rakovets.course.java.core.practice.generics.math;

import java.util.Arrays;

public abstract class Math {
    private static Number[] arrayMath;

    private Math(Number[] arrayMath) {
        Math.arrayMath = arrayMath;
    }

    public static  <T extends Number> Number min(T e1, T e2, T e3, T e4, T e5) {
        arrayMath = new Number[5];
        arrayMath[0] = e1;
        arrayMath[1] = e2;
        arrayMath[2] = e3;
        arrayMath[3] = e4;
        arrayMath[4] = e5;

        Arrays.sort(arrayMath);

        return arrayMath[0];
    }

    public static  <T extends Number> Number max(T e1, T e2, T e3) {
        arrayMath = new Number[3];
        arrayMath[0] = e1;
        arrayMath[1] = e2;
        arrayMath[2] = e3;

        Arrays.sort(arrayMath);

        return arrayMath[arrayMath.length - 1];
    }


    public static <T extends Number> Double avgInArray(T[] array) {
        Double avg = 0.0;
        arrayMath = array;

        for (Number number : arrayMath) {
            avg += (Double) number;
        }
        avg = avg / arrayMath.length;

        return avg;
    }
}
