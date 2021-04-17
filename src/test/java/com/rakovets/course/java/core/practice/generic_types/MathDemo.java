package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MathDemo {

    public static void main(String[] args) {
        System.out.println(Math.findMax(12, 4.2, 2L));
        System.out.println(Math.findMin(3, 7.2, 2.2, -5, 1.7));
        System.out.println(Math.findAverage(new Number[] {3, 5, 4}));
        System.out.println(Math.findMax(new Number[] {2, 7, 9, 2, 5, 3, 12}));
        System.out.println(Math.findMin(new Number[] {2, 7, 9, 5, 3, 15}));
        Number[] numbers =  Math.sort(Math.sort(new Number[] {2, 7, 9, 5, 1, 9, 15, 12}));
        for (var iterator: numbers) {
            System.out.println(iterator);
        }
        try {
            System.out.println(Math.searchBinary(new Number[]{1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16},
                    0,
                    15,
                    19));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
