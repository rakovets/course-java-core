package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public abstract class Math {

    public static <T extends Number> double getMaxNumber3(T first, T second, T third) {
        return java.lang.Math.max(first.doubleValue(), (java.lang.Math.max(second.doubleValue(), third.doubleValue())));
    }

    public static <T extends Number> double getMinNumber5(T first, T second, T third, T fourth, T fifth) {
        double[] box = new double[5];
        box[0] = first.doubleValue();
        box[1] = second.doubleValue();
        box[2] = third.doubleValue();
        box[3] = fourth.doubleValue();
        box[4] = fifth.doubleValue();
        double min = box[0];
        for (int i = 1; i < box.length; i++) {
            if (min > box[i]) {
                min = box[i];
            }
        }
        return min;
    }

    public static <T extends Number> double getArithmeticMean(T[] sum) {
        double sumNumbers = 0;
        for (int i = 0; i < sum.length; i++) {
            sumNumbers += sum[i].doubleValue();
        }
        return sumNumbers / sum.length;
    }

    public static <T extends Number> T getMaxArray(T[] max) {
        Arrays.sort(max);
        return max[max.length - 1];
    }

    public static <T extends Number> T getMinArray(T[] min) {
        Arrays.sort(min);
        return min[0];
    }
}
