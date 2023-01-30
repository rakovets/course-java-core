package com.rakovets.course.java.core.practice.generics.math;

public abstract class Math {
    public Math(Integer[] arrayMath) {
    }

    public static Integer max(Integer e1, Integer e2, Integer e3) {
        Integer result;

        if (e1 >= e2 && e1 >= e3) {
            result = e1;
        } else if (e2 >= e1 && e2 >= e3) {
            result = e2;
        } else {
            result = e3;
        }

        return result;
    }

    public static Integer min(Integer e1, Integer e2, Integer e3, Integer e4, Integer e5) {
        Integer min;

        min = e1 < e2 ? e1 : e2;
        min = min < e3 ? min : e3;
        min = min < e4 ? min : e4;
        min = min < e5 ? min : e5;

        return min;
    }


}
