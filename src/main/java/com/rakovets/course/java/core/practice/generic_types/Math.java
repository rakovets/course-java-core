package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math<S> {

    //task01
    public  static <S extends Number> S maxValue(S a, S b, S c) {
        double da = a.doubleValue();
        double db = b.doubleValue();
        double dc = c.doubleValue();

        if (da > db && da > dc) {
            return a;
        } else if (db > da && db > dc) {
            return b;
        } else {
            return c;
        }
    }

    //task02
    public static <S extends Number> S minValue(S a, S b, S c, S d, S e) {
        double fa1 = a.doubleValue();
        double fb2 = b.doubleValue();
        double fc3 = c.doubleValue();
        double fd4 = d.doubleValue();
        double fe5 = e.doubleValue();

        if (fa1 < fb2 && fa1 < fc3 && fa1 < fd4 && fa1 < fe5) {
            return a;
        } else if (fb2 < fa1 && fb2 < fc3 && fb2 < fd4 && fb2 < fe5) {
            return b;
        } else if (fc3 < fa1 && fc3 < fb2 && fc3 < fd4 && fc3 < fe5) {
            return c;
        } else if (fd4 < fa1 && fd4 < fb2 && fd4 < fc3 && fd4 < fe5) {
            return d;
        } else {
            return e;
        }
    }

    //task03
    public static <S extends Number> double getAverageValueArray(S[] values) {
        double sumValue = 0.0;

        for (S value : values) {
            sumValue += value.doubleValue();
        }

        return sumValue / values.length;
    }

    //task04
    public static <S extends Number> S getMaxValueArray(S[] values) {
        S maxValue = values[0];
        for (S value : values) {
            if (maxValue.doubleValue() < value.doubleValue()) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    //task05
    public static <S extends Number> S getMinValueArray(S[] values) {
        S minValue = values[0];
        for (S value : values) {
            if (minValue.doubleValue() > value.doubleValue()) {
                minValue = value;
            }
        }
        return minValue;
    }
}
