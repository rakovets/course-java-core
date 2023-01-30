package com.rakovets.course.java.core.practice.generics.math;

public abstract class Math {
    private final Number[] arrayMath;

    public Math(Number[] arrayMath) {
        this.arrayMath = arrayMath;
    }

    public static <T extends Number> T max(T e1, T e2, T e3) {
        T result;

        result = e1.doubleValue() > e2.doubleValue() ? (e1.doubleValue() > e3.doubleValue() ?  e1 : e3) :
                (e2.doubleValue() > e3.doubleValue() ? e2 : e3);

        return result;
    }

    public static <T extends Number> T min(T e1, T e2, T e3, T e4, T e5) {
        T result;

        result = e1.doubleValue() < e2.doubleValue() ? e1 : e2;
        result = result.doubleValue() < e3.doubleValue() ? result : e3;
        result = result.doubleValue() < e4.doubleValue() ? result : e4;
        result = result.doubleValue() < e5.doubleValue() ? result : e5;

        return result;
    }
}
