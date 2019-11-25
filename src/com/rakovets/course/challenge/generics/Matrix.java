package com.rakovets.course.challenge.generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix extends MatrixTest {

    public static void fillArrayy() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    static void division(Integer[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDivision. Insert the number:  ");
        int numberDivision = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= numberDivision;
            }
        }
        System.out.printf("\n" +
                "Matrix after dividing by number %d:  %s", numberDivision, (matrix));
    }

    static Integer[][] createMatrixRandom() {
        System.out.println("\nFilling an array with random numbers.");
        Random random = new Random();
        Integer[][] matrix = new Integer[random.nextInt(2) + 3][random.nextInt(2) + 3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1000) + 1;
            }
        }
        System.out.printf("Array created: %s", (matrix));
        return matrix;
    }

    public static <T extends Number> void arrayDisplay() {
        int[] a = {1, 3, -7, 2, 8, 23, 21, 54, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static <T extends Comparable<T>> void searchMaximumAndMinimum(T[][] matrix) {
        T maximum = matrix[0][0];
        T minimum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].compareTo(maximum) > 0) {
                    maximum = matrix[i][j];
                }
                if (matrix[i][j].compareTo(minimum) < 0) {
                    minimum = matrix[i][j];
                }
            }
        }
        System.out.printf("\nMaximum number in the matrix = %d", maximum);
        System.out.printf("\nMinimum number in the matrix= %d", minimum);
    }

}
