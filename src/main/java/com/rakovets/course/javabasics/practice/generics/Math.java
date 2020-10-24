package com.rakovets.course.javabasics.practice.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Math<T extends Number> {


    public T getMaxOf(T a, T b, T c) {

               if (a.intValue() > b.intValue() && b.intValue() > c.intValue()) {
            return a;
        } else if (a.intValue() > c.intValue() && c.intValue() > b.intValue()) {
            return a;
        } else if (b.intValue() > c.intValue() && c.intValue() > a.intValue()) {
            return b;
        } else if (b.intValue() > a.intValue() && a.intValue() > c.intValue()) {
            return b;
        } else if (c.intValue() > a.intValue() && a.intValue() > b.intValue()) {
            return c;
        } else if (c.intValue() > b.intValue() && b.intValue() > a.intValue()) {
            return c;
        }
        return null;

    }

    // public T getMinOf(T a, T b, T c, T d, T e) {
    //     double[] array = new double[5];
    //     array[0] = a.intValue();
    //     array[1] = b.intValue();
    //     array[2] = c.intValue();
    //     array[3] = d.intValue();
    //     array[4] = e.intValue();
    //     T min = array[0];
//
    //     for ( int i =0 ; i<=5; i++){
    //         if(array[i]<array[i+1]){
//
    //         }
    //     }






}
