package com.rakovets.course.challenge.generics.Math;

public class Program {
    public static void main(String[] args) {
        Task1.maxOfValues(0.34,0.42,0.12);
        Task2.minOfValues(23,34,1);

        Integer[] array1 = {1, 4, 23, -12, 15};
        Task3.middleOfValues(array1);

        Task4.lessValueInArray(array1);

        Integer[] array2 = {3, 4, 245, 1};
        Task5.minValueInArray(array2);

        Task6.sortOfArray(array2);

        Double[] array3 = {0.12, 23.1, 12.3, 54.2};
        Task7.searchInArray(array3, 54.2);
    }
}
