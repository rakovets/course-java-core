package com.rakovets.course.java.core.practice.generics.math;

import com.rakovets.course.java.core.example.generics.model.restrict.D;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Math {
    private static Double[] arrayMath;

    public Math(Double[] arrayMath) {
        Math.arrayMath = arrayMath;
    }

    public static <T extends Number> T max(T e1, T e2, T e3) {
        T result;

        result = e1.doubleValue() > e2.doubleValue() ? (e1.doubleValue() > e3.doubleValue() ?  e1 : e3) :
                (e2.doubleValue() > e3.doubleValue() ? e2 : e3);

        return result;
    }

    public static  <T extends Double> Double minOfFive(T e1, T e2, T e3, T e4, T e5) {
        arrayMath = new Double[5];
        arrayMath[0] = e1;
        arrayMath[1] = e2;
        arrayMath[2] = e3;
        arrayMath[3] = e3;
        arrayMath[4] = e3;

        Arrays.sort(arrayMath);

        return arrayMath[0];
    }

    public static <T extends Number> T min(T e1, T e2, T e3, T e4, T e5) {
        T result;

        result = e1.doubleValue() < e2.doubleValue() ? e1 : e2;
        result = result.doubleValue() < e3.doubleValue() ? result : e3;
        result = result.doubleValue() < e4.doubleValue() ? result : e4;
        result = result.doubleValue() < e5.doubleValue() ? result : e5;

        return result;
    }

    public static  <T extends Double> Double maxOfThree(T e1, T e2, T e3) {
        arrayMath = new Double[3];
        arrayMath[0] = e1;
        arrayMath[1] = e2;
        arrayMath[2] = e3;

        Arrays.sort(arrayMath);

        return arrayMath[arrayMath.length - 1];
    }

    public static <T extends Double> T avgInArray() {
        Double avg = 0.0;

        for (Number number : arrayMath) {
            avg += number.doubleValue();
        }
        avg = avg / arrayMath.length;

        return (T) avg;
    }

    public static <T extends Double> Double avgInArrayS(T[] array) {
        Double avg = 0.0;
        array = (T[]) arrayMath;

        for (Double number : array) {
            avg += number;
        }

        avg = avg / array.length;

        return avg;
    }
}
