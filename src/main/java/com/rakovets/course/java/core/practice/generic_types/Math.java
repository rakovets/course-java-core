package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {
    public static <T extends Number> T maxParameter(T a, T b, T c) {
        double doubleA = a.doubleValue();
        double doubleB = b.doubleValue();
        double doubleC = c.doubleValue();

        if (doubleA > doubleB && doubleA > doubleC) {
            return a;
        } else if (doubleB > doubleA && doubleB > doubleC) {
            return b;
        } else {
            return c;
        }
    }

    public static <T extends Number> T minParameter(T a, T b, T c, T d, T e) {
        double valueA = a.doubleValue();
        double valueB = b.doubleValue();
        double valueC = c.doubleValue();
        double valueD = d.doubleValue();
        double valueE = e.doubleValue();

        if (valueA < valueB && valueA < valueC && valueA < valueD && valueA < valueE) {
            return a;
        } else if (valueB < valueA && valueB < valueC && valueB < valueD && valueB < valueE) {
            return b;
        } else if (valueC < valueA && valueC < valueB && valueC < valueD && valueC < valueE) {
            return c;
        } else if (valueD < valueA && valueD < valueB && valueD < valueC && valueD < valueE) {
            return d;
        } else {
            return e;
        }
    }

    public static <T extends Number> double getAverageValue(T[] parameters) {
        double result = 0.0;
        for (int i = 0; i < parameters.length; i++) {
            result += parameters[i].doubleValue();
        }
        return result / parameters.length;
    }

    public static <T extends Number> T getMaxValue(T[] parameters) {
        T maxParameter = parameters[0];
        for (int i = 0; i < parameters.length; i++) {
            if (maxParameter.doubleValue() < parameters[i].doubleValue()) {
                maxParameter = parameters[i];
            }
        }
        return maxParameter;
    }

    public static <T extends Number> T getMinValue(T[] parameters) {
        T minParameter = parameters[0];
        for (int i = 0; i < parameters.length; i++) {
            if (minParameter.doubleValue() > parameters[i].doubleValue()) {
                minParameter = parameters[i];
            }
        }
        return minParameter;
    }
}

