package com.rakovets.course.challenge.generics;

import java.lang.reflect.Array;

public class Program {
    public static void main(String[] args) {
        Task1.maxOfValues(0.34,0.42,0.12);
        Task2.minOfValues(23,34,1);

        Integer[] array1 = {1, 4, 23, 12};
        Task3.middleOfValues(array1);

        Task4.lessValueInArray(array1);
    }
}
