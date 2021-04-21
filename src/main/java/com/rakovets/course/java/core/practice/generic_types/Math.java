package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {

    public static <T> int findMaximumValue(int first, int second, int third){
        if (first > second && first > third){
           return first;
        }
        else if (second > third){
            return second;
        }
        else {
            return third;
        }
    }

    public static <T> int findMinimumValue(int first, int second, int third, int fourth, int fifth){
    if(first < second && first < third && first <  fourth && first < fifth){
        return first;
        }
    else if(second < third && second < fourth && second < fifth){
        return second;
        }
    else if(third < fourth && third < fifth){
        return third;
        }
    else if(fourth < fifth){
        return fourth;
        }
    else{
        return fifth;
        }
    }

    public static <T> double findAverage(int[] arr){
        double value = 0;
        for (int i : arr) {
            value += i;
        }
        return value / arr.length;
    }

    public static <T> int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i){
             max = i;
            }
        }
        return max;
    }

    public static <T> int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
