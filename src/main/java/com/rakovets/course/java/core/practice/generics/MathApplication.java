package com.rakovets.course.java.core.practice.generics;

public class MathApplication {
    public static <T> void main(String[] args) {
        T[] array = (T[]) new Object[]{null, 100, 1000};
        System.out.println(Math.findMaxElement(-1,null , 18));
        System.out.println(Math.findMinElement(-100, null, 18.67));
        try {
            System.out.println(Math.findArrayAverage(array));
            System.out.println(Math.findArrayMaxElement(array));
            System.out.println(Math.findArrayMinElement(array));
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
