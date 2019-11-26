package com.rakovets.course.challenge.generics.Math;

public class Task1 {

    public static <T extends Comparable<T>> T maxOfValues(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0) {
           if (firstValue.compareTo(thirdValue) > 0) {
               System.out.println("Max is " + firstValue);
               return firstValue;
           } else {
               System.out.println("Max is " + thirdValue);
               return thirdValue;
           }
        } else if (secondValue.compareTo(thirdValue) > 0) {
            System.out.println("Max is " + secondValue);
            return secondValue;
        } else {
            return thirdValue;
        }
    }
}
