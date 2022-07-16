package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        Array<Long> longArray = new Array<>(5);
        Array<Integer> integerArray = new Array<>(5);
        Array<Short> shortArray = new Array<>(5);
        Array<Byte> byteArray = new Array<>(5);
        Array<Double> doubleArray = new Array<>(5);
        Array<Float> floatArray = new Array<>(5);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Filling an array with integer values from the keyboard. Type Long.");
        System.out.println(longArray);
        longArray.arrayFillIntegers();
        System.out.println(longArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Integer.");
        System.out.println(integerArray);
        integerArray.arrayFillIntegers();
        System.out.println(integerArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Short.");
        System.out.println(shortArray);
        shortArray.arrayFillIntegers();
        System.out.println(shortArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Byte.");
        System.out.println(byteArray);
        byteArray.arrayFillIntegers();
        System.out.println(byteArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Double.");
        System.out.println(doubleArray);
        doubleArray.arrayFillFloatingPoint();
        System.out.println(doubleArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Float.");
        System.out.println(floatArray);
        floatArray.arrayFillFloatingPoint();
        System.out.println(floatArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers.");
        Array<Integer> integerArrayForRandom = new Array<>(5);
        System.out.println(integerArrayForRandom);
        integerArrayForRandom.arrayFillRandomInters();
        System.out.println(integerArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("An array of random floating point numbers.");
        Array<Double> doubleArrayForRandom = new Array<>(5);
        System.out.println(doubleArrayForRandom);
        doubleArrayForRandom.arrayFillRandomFloatingPoint();
        System.out.println(doubleArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array.");
        Array<Integer> integerArrayForPrint = new Array<>(5);
        System.out.println(integerArrayForPrint.printArray());
        integerArrayForPrint.arrayFillRandomInters();
        System.out.println(integerArrayForPrint.printArray());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The maximum value in an integer array.");
        Array<Integer> integerArrayForGetMaximumNumber = new Array<>(5);
        System.out.println(integerArrayForGetMaximumNumber);
        integerArrayForGetMaximumNumber.arrayFillRandomInters();
        System.out.println(integerArrayForGetMaximumNumber);
        System.out.println(integerArrayForGetMaximumNumber.getMaximumNumber());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The maximum value in the floating-point array.");
        Array<Double> doubleArrayForGetMaximumNumber = new Array<>(5);
        System.out.println(doubleArrayForGetMaximumNumber);
        doubleArrayForGetMaximumNumber.arrayFillRandomFloatingPoint();
        System.out.println(doubleArrayForGetMaximumNumber);
        System.out.println(doubleArrayForGetMaximumNumber.getMaximumNumber());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The minimum value in an integer array.");
        Array<Integer> integerArrayForGetMinimumNumber = new Array<>(5);
        System.out.println(integerArrayForGetMinimumNumber);
        integerArrayForGetMinimumNumber.arrayFillRandomInters(10);
        System.out.println(integerArrayForGetMinimumNumber);
        System.out.println(integerArrayForGetMinimumNumber.getMinimumNumber());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The minimum value in the floating-point array.");
        Array<Double> doubleArrayForGetMinimumNumber = new Array<>(5);
        System.out.println(doubleArrayForGetMinimumNumber);
        doubleArrayForGetMinimumNumber.arrayFillRandomFloatingPoint();
        System.out.println(doubleArrayForGetMinimumNumber);
        System.out.println(doubleArrayForGetMinimumNumber.getMinimumNumber());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The arithmetic average of an integer array.");
        Array<Integer> integerArrayGetAverage = new Array<>(5);
        System.out.println(integerArrayGetAverage);
        integerArrayGetAverage.arrayFillRandomInters(999);
        System.out.println(integerArrayGetAverage);
        System.out.println(integerArrayGetAverage.getAverage());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The arithmetic mean of an array of numbers with a floating point value.");
        Array<Double> doubleArrayGetAverage = new Array<>(5);
        System.out.println(doubleArrayGetAverage);
        doubleArrayGetAverage.arrayFillRandomFloatingPoint();
        System.out.println(doubleArrayGetAverage);
        System.out.println(doubleArrayGetAverage.getAverage());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Sorting an array of integers in ascending order.");
        Array<Integer> integerArraySortAscending = new Array<>(5);
        System.out.println(integerArraySortAscending);
        integerArraySortAscending.arrayFillRandomInters(100);
        System.out.println(integerArraySortAscending);
        System.out.println(Arrays.toString(integerArraySortAscending.sortAscending()));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Sort an array of floating point numbers in ascending order.");
        Array<Double> doubleArraySortAscending = new Array<>(5);
        System.out.println(doubleArraySortAscending);
        doubleArraySortAscending.arrayFillRandomFloatingPoint();
        System.out.println(doubleArraySortAscending);
        System.out.println(Arrays.toString(doubleArraySortAscending.sortAscending()));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Sort an array of integers in descending order.");
        Array<Integer> integerArrayDescendingSorting = new Array<>(5);
        System.out.println(integerArrayDescendingSorting);
        integerArrayDescendingSorting.arrayFillRandomInters(750);
        System.out.println(integerArrayDescendingSorting);
        System.out.println(Arrays.toString(integerArrayDescendingSorting.descendingSorting()));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Sort an array of floating point numbers in descending order.");
        Array<Double> doubleArrayDescendingSorting = new Array<>(5);
        System.out.println(doubleArrayDescendingSorting);
        doubleArrayDescendingSorting.arrayFillRandomFloatingPoint();
        System.out.println(doubleArrayDescendingSorting);
        System.out.println(Arrays.toString(doubleArrayDescendingSorting.descendingSorting()));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Binary search in an integer array. The array is being sorted.");
        Array<Integer> integerArrayJumpSearch = new Array<>(10);
        System.out.println(integerArrayJumpSearch);
        integerArrayJumpSearch.arrayFillRandomInters(11);
        System.out.println(integerArrayJumpSearch);
        System.out.println(integerArrayJumpSearch.jumpSearch(10));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Binary search in an array with a floating point value. The array is being sorted.");
        Array<Double> doubleArrayJumpSearch = new Array<>(10);
        System.out.println(doubleArrayJumpSearch);
        doubleArrayJumpSearch.arrayFillRandomFloatingPoint();
        System.out.println(doubleArrayJumpSearch);
        System.out.println(doubleArrayJumpSearch.jumpSearch(0.1725672731250859));
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Changing a value in an integer array with a new value. The array is being sorted.");
        Array<Integer> integerArrayReplace = new Array<>(10);
        System.out.println(integerArrayReplace);
        integerArrayReplace.arrayFillRandomInters(11);
        System.out.println(integerArrayReplace);
        System.out.println(Arrays.toString(integerArrayReplace.replace(10, 7)));
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
