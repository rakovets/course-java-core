package com.rakovets.course.java.core.practice.generics;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------");
        Array<Long> longArray = new Array<>(3);
        System.out.println("Filling an array with integer values from the keyboard. Type Long.");
        longArray.arrayFillIntegers();
        System.out.println(longArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Integer.");
        Array<Integer> integerArray = new Array<>(3);
        integerArray.arrayFillIntegers();
        System.out.println(integerArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Short.");
        Array<Short> shortArray = new Array<>(3);
        shortArray.arrayFillIntegers();
        System.out.println(shortArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Byte.");
        Array<Byte> byteArray = new Array<>(3);
        byteArray.arrayFillIntegers();
        System.out.println(byteArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Double.");
        Array<Double> doubleArray = new Array<>(3);
        doubleArray.arrayFillFloatingPoint();
        System.out.println(doubleArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array with integer values from the keyboard. Type Float.");
        Array<Float> floatArray = new Array<>(3);
        floatArray.arrayFillFloatingPoint();
        System.out.println(floatArray);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers. Type Integer.");
        Array<Integer> integerArrayForRandom = new Array<>(5);
        integerArrayForRandom.arrayFillRandomInters(-5, 5);
        System.out.println(integerArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers. Type Long");
        Array<Long> longArrayForRandom = new Array<>(5);
        longArrayForRandom.arrayFillRandomInters(-5, 5);
        System.out.println(longArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers. Type Short.");
        Array<Short> shortArrayForRandom = new Array<>(5);
        shortArrayForRandom.arrayFillRandomInters(-5, 5);
        System.out.println(shortArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers. Type Byte");
        Array<Byte> byteArrayForRandom = new Array<>(5);
        byteArrayForRandom.arrayFillRandomInters(-5, 5);
        System.out.println(byteArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers. Type Float");
        Array<Float> floatArrayForRandom = new Array<>(5);
        floatArrayForRandom.arrayFillRandomInters(-5, 5);
        System.out.println(floatArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Array of random integers. Type Double");
        Array<Double> doubleArrayForRandom = new Array<>(5);
        doubleArrayForRandom.arrayFillRandomInters(-5, 5);
        System.out.println(doubleArrayForRandom);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
