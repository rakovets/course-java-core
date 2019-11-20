package com.rakovets.course.challenge.generics;

public class Task02 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(20);
        Integer num2 = Integer.valueOf(9);
        Integer num3 = Integer.valueOf(5);
        System.out.println("The min resolt is : " + min(num1, num2, num3));

    }

    public static <T extends Comparable<T>> T min(T num1, T num2, T num3) {
        if (num1.compareTo(num2) < 0) {
            if (num1.compareTo(num3) < 0) {
                return num1;
            }
        } else if (num2.compareTo(num3) < 0) {
            return num2;
        }
        return num3;
    }
}
