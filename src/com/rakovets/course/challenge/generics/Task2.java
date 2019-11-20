package com.rakovets.course.challenge.generics;

public class Task2 {

    public static <T extends Comparable<T>> T minOfValues(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) < 0) {
            if (firstValue.compareTo(thirdValue) < 0) {
                System.out.println("Min is " + firstValue);
                return firstValue;
            } else {
                System.out.println("Min is " + thirdValue);
                return thirdValue;
            }
        } else if (secondValue.compareTo(thirdValue) < 0) {
            System.out.println("Min is " + secondValue);
            return secondValue;
        } else {
            return thirdValue;
        }
    }
}
