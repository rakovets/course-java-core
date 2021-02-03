package com.rakovets.course.java.core.practice.generic_types;

public class ArrayDemo {
    public static void main(String[] args) {
        Array<Double> numbers = new Array<>(new Double[9]);
        numbers.fillArray();
        System.out.println(numbers);
    }
}
