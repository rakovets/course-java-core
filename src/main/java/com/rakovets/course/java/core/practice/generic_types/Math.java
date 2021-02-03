package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {

    //task-1

    public static <T extends Number> T getMax(T x, T y, T z) {
        double max = x.doubleValue();
        if(y.doubleValue() > z.doubleValue()) {
            return y;
        } else if(z.doubleValue() > max) {
            return z;
        }
        return x;
    }

    //task-2

    public static <T extends Number> T getMin(T a, T b, T c, T d, T f) {
        double min = a.doubleValue();
        if (b.doubleValue() < min) {
            return b;
        } else if(c.doubleValue() < min) {
            return c;
        } else if(d.doubleValue() < min) {
            return d;
        } else if (f.doubleValue() < min){
            return f;
        }
        return a;
    }

    //task-3

    public static <T extends Number> double getAverageInArray(T[] array) {
        double sum = 0;
        for (T items : array) {
            sum += items.doubleValue();
        }
        return sum / array.length;
    }

    //task-4

    public static <T extends Number> double getMaxIndexInArray (T[] array) {
        double max = array[0].doubleValue();
        for (int i = 1; i<array.length;i++) {
            max = java.lang.Math.max(max,array[i].doubleValue());
        }
        return max;
    }

    //task-5

    public static <T extends Number> double getMinIndexInArray (T[] array) {
        double min = array[0].doubleValue();
        for (int i = 1; i<array.length;i++) {
            min = java.lang.Math.min(min,array[i].doubleValue());
        }
        return min;
    }

    //task-6

    public static <T extends Number> T[] sortArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].doubleValue() < array[minIndex].doubleValue()) {
                    minIndex = j;
                }
            }
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    //task-7

    public static <T extends Number> int binarySearch(T key, T[] array) {
        if (key == null || array ==null) {
            return -1;
        }
        int index = -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid].doubleValue() < key.doubleValue()) {
                low = mid + 1;
            } else if (array[mid].doubleValue() > key.doubleValue()) {
                high = mid - 1;
            } else if (array[mid].doubleValue() == key.doubleValue()) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
