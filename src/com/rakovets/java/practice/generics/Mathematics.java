package com.rakovets.java.practice.generics;

public class Mathematics {
    public static <T extends Comparable<T>> T max(T type1, T type2, T type3) {
        if (type1.compareTo(type2) > 0) {
            if (type1.compareTo(type3) > 0) {
                return type1;
            }
        }
        //TODO
        return null;
    }
}
