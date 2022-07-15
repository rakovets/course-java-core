package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public abstract class Math {
    public static <K extends Number> K getMax(K x, K y, K z) {
        double ex = x.doubleValue();
        double ey = y.doubleValue();
        double ez = z.doubleValue();
        double result = java.lang.Math.max(ez, java.lang.Math.max(ex, ey));

        if (result == ex) {
            return x;
        } else if (result == ey) {
            return y;
        } else {
            return z;
        }
    }

    public static <N extends Number> N getMin(N a, N b, N c, N d, N e) {
        double ad = a.doubleValue();
        double bd = b.doubleValue();
        double cd = c.doubleValue();
        double dd = d.doubleValue();
        double ed = e.doubleValue();
        double result = java.lang.Math.min((java.lang.Math.min(ad, java.lang.Math.min(bd, cd))), java.lang.Math.min(dd, ed));

        if (result == ad) {
            return a;
        } else if (result == bd) {
            return b;
        } else if (result == cd) {
            return c;
        } else if (result == dd) {
            return d;
        } else {
            return e;
        }
    }

    public static <N extends Number> double getAverage(N[] array) {
        double sum = 0;

        for (N arrayMember : array) {
            sum += arrayMember.doubleValue();
        }
        return sum / array.length;
    }

    public static <N extends Number> N getMaxFromArray(N[] array) {
        Arrays.sort(array);

        return array[array.length - 1];
    }

    public static <N extends Number> N getMinFromArray(N[] array) {
        Arrays.sort(array);

        return array[0];
    }
}
