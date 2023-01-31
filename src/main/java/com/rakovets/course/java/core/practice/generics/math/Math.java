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


    public static <T extends Number> Number avgInArray(T[] array) {
        Number result = 0;
        arrayMath = array;

        for (Number number : arrayMath) {
            result = result.doubleValue() + number.doubleValue();
        }
        result = result.doubleValue() / arrayMath.length;

        return result;
    }
}
