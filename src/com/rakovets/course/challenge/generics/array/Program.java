package com.rakovets.course.challenge.generics.array;

public class Program {
    public static void main(String[] args) {
        Integer[] array1 = Array.creatingRandomArray();
//        Integer[] array2 = Array.arrayEnteredFromTheKeyboard();

        Array.searchMaxValue(array1);
        Array.searchMinValue(array1);
        Array.searchMiddleValue(array1);
        Array.sortArrayInAscendingOrder(array1);
        Array.sortArrayInDescendingOrder(array1);
        Array.binarySearchInArray(array1);
        Array.changingValueInArray(array1, 3, 258);
    }
}
