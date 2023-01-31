package com.rakovets.course.java.core.practice.generics;

public class MathDemo {
    public static void main(String[] args) {
        Integer[] testInt = {5, 44, 10, 8, 20, 30};
        Double[] testDouble = {5.5, 8.2, 3.5, 6.4};

        // method getMaxOfThreeNumbers()

        Number max = Math.getMaxOfThreeNumbers(3, 8, 12);
        Number max2 = Math.getMaxOfThreeNumbers(5.4, 81.8, 7.8);

        System.out.println("Maximum of three numbers:");
        System.out.println(max);
        System.out.println(max2);

        // method getMinOfFiveNumbers()

        Number max3 = Math.getMinOfFiveNumbers(56, 77, 22, 66, 23);
        Number max4 = Math.getMinOfFiveNumbers(42.4, 55.5, 11.5, 33.4, 32.6);

        System.out.println("Minimum of three numbers:");
        System.out.println(max3);
        System.out.println(max4);

        // method getArithmeticMean()

        Double result1 = Math.getArithmeticMean(testInt);
        Double result2 = Math.getArithmeticMean(testDouble);

        System.out.println("Arithmetic Mean:");
        System.out.println(result1);
        System.out.println(result2);

        // getMaxFromArray()

        Integer result3 = Math.getMaxFromArray(testInt);
        Double result4 = Math.getMaxFromArray(testDouble);

        System.out.println("Maximum from array:");
        System.out.println(result3);
        System.out.println(result4);

        // getMinFromArray()

        Integer result5 = Math.getMinFromArray(testInt);
        Double result6 = Math.getMinFromArray(testDouble);

        System.out.println("Minimum from array:");
        System.out.println(result5);
        System.out.println(result6);

        // getBubbleSort()

        System.out.println("Bubble Sort:");
        Math.getBubbleSort(testInt);
        for (int i = 0; i < testInt.length; i++) {
            System.out.print(testInt[i] + " ");
        }
        System.out.println();
        Math.getBubbleSort(testDouble);
        for (int i = 0; i < testDouble.length; i++) {
            System.out.print(testDouble[i] + " ");
        }
        System.out.println();

        // findIndexForNumber()

        System.out.println("Binary Search - Iterative Implementation:");

        Integer[] testArray = new Integer[] {22, 33, 55, 77, 7, 4, 66, 73, 0, 87, 70};
        Double[] testArray2 = new Double[] {3.4, 65.7, 44.6, 94.7, 22.3, 15.5};

        int index = Math.findIndexFoNumber(testArray, 66);
        int index2 = Math.findIndexFoNumber(testArray, 86);
        int index3 = Math.findIndexFoNumber(testArray2, 44.6);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);
    }
}
