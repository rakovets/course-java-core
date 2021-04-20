package com.rakovets.course.java.core.practice.generic_types.obscure;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.getMax(20,51,50));
        System.out.println(Math.getMin(20,51,50,6,77));
        System.out.println(Math.getAverageInArray(new Double[]{7.0, 5.0, 6.0, 3.0}));
        System.out.println(Math.getMaxInArray(new Double[]{7.0, 8.0, 6.0, 3.0}));
        System.out.println(Math.getMinInArray(new Double[]{7.0, 8.0, 6.0, 3.0}));
        //System.out.println(Math.getSortArray(new Double[]{7.0, 8.0, 6.0, 3.0}));
    //   Double[] arrays = Math.getSortArray(new Double[]{7.0, 8.0, 6.0, 9.0});
      //  System.out.println(arrays.length);
     ///   for(double arr : arrays) {
           // System.out.println(arr);
        System.out.println(Arrays.asList(Math.getSortArray(new Double[]{7.0, 8.0, 6.0, 3.0})));
        System.out.println(Math.binarySearch(new Double[]{7.0, 8.0, 6.0, 3.0},8.0));
        }
    }

