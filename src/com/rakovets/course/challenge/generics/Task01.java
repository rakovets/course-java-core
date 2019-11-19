package com.rakovets.course.challenge.generics;

public class Task01 {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(14);
        Integer num1 = Integer.valueOf(1);
        Integer num2 = Integer.valueOf(10);
        System.out.println("The max resolt is " + max(num, num1, num2));
    }

    public static <T extends Comparable<T>> T max(T num, T num1, T num2) {
        if (num.compareTo(num1) > 0) {
            if (num.compareTo(num2) > 0) {
                return num;
            }
        } else if (num1.compareTo(num2) > 0) {
            return num1;
        }
        return num2;
    }
}
