package com.rakovets.course.java.core.practice.generic_types;

public class Math<T extends Number> {

    public static <T extends Number > T maxOfThree(T parametr1, T parametr2, T parametr3) {
        T result = parametr1;
        if(parametr2.doubleValue() > parametr1.doubleValue() && parametr2.doubleValue() > parametr3.doubleValue()) {
            result = parametr3;
        } else if(parametr3.doubleValue() > parametr2.doubleValue() && parametr3.doubleValue() > parametr1.doubleValue()) {
            result = parametr3;
        }
        return result;
    }

    public static <T extends Number > T minOfFive(T parametr1, T parametr2, T parametr3, T parametr4, T parametr5) {
        T result = parametr1;
        if(result.doubleValue() > parametr2.doubleValue()){
            result = parametr2;
        }
        if(result.doubleValue() > parametr3.doubleValue()){
            result = parametr3;
        }
        if(result.doubleValue() > parametr4.doubleValue()){
            result = parametr4;
        }
        if(result.doubleValue() > parametr5.doubleValue()){
            result = parametr5;
        }
        return result;
    }

}
