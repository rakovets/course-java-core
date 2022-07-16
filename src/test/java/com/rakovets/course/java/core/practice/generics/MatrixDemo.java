package com.rakovets.course.java.core.practice.generics;

public class MatrixDemo {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Integer matrix from the keyboard.");
        Matrix<Integer> integerMatrix = new Matrix<>(3, 3);
        integerMatrix.matrixFillInteger();
        System.out.println("\t\tMatrix");
        integerMatrix.printMatrixInteger();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("A matrix with keyboard floating point values.");
        Matrix<Double> doubleMatrix = new Matrix<>(3, 3);
        doubleMatrix.matrixFillFloatingPoint();
        System.out.println("\t\tMatrix");
        doubleMatrix.printMatrixFloat();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers.");
        Matrix<Integer> integerMatrixFillRandomInters = new Matrix<>(5, 5);
        integerMatrixFillRandomInters.matrixFillRandomInters(450);
        System.out.println("\t\tMatrix");
        integerMatrixFillRandomInters.printMatrixInteger();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random floating point numbers.");
        Matrix<Double> doubleMatrixFillRandomFloat = new Matrix<>(5, 5);
        doubleMatrixFillRandomFloat.matrixFillRandomFloat();
        System.out.println("\t\tMatrix");
        doubleMatrixFillRandomFloat.printMatrixFloat();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The maximum value in an integer matrix. With limited numerical range.");
        Matrix<Integer> integerMatrixMaximum = new Matrix<>(5, 4);
        integerMatrixMaximum.matrixFillRandomInters(450);
        System.out.println("\t\tMatrix");
        integerMatrixMaximum.printMatrixInteger();
        System.out.println("\n" + integerMatrixMaximum.getMaximumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("The maximum value in an integer matrix.");
        Matrix<Integer> integerMatrixMaxNoLimit = new Matrix<>(5, 5);
        integerMatrixMaxNoLimit.matrixFillRandomInters();
        System.out.println("\t\tMatrix");
        integerMatrixMaxNoLimit.printMatrixInteger();
        System.out.println("\n" + integerMatrixMaxNoLimit.getMaximumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The maximum value in a floating point matrix.");
        Matrix<Double> doubleMatrixMaximum = new Matrix<>(5, 5);
        doubleMatrixMaximum.matrixFillRandomFloat();
        System.out.println("\t\tMatrix");
        doubleMatrixMaximum.printMatrixFloat();
        System.out.printf("\n %.01f", doubleMatrixMaximum.getMaximumNumberMatrixFloat());
        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println("The minimum value in an integer matrix. With limited numerical range.");
        Matrix<Integer> integerMatrixMinimum = new Matrix<>(5, 5);
        integerMatrixMinimum.matrixFillRandomInters(475);
        System.out.println("\t\tMatrix");
        integerMatrixMinimum.printMatrixInteger();
        System.out.println("\n" + integerMatrixMinimum.getMinimumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The minimum value in an integer matrix.");
        Matrix<Integer> integerMatrixMinimumNoLimit = new Matrix<>(5, 5);
        integerMatrixMinimumNoLimit.matrixFillRandomInters();
        System.out.println("\t\tMatrix");
        integerMatrixMinimumNoLimit.printMatrixInteger();
        System.out.println("\n" + integerMatrixMinimumNoLimit.getMinimumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The minimum element in a floating-point matrix.");
        Matrix<Double> doubleMatrixMinimum = new Matrix<>(5, 5);
        doubleMatrixMinimum.matrixFillRandomFloat();
        System.out.println("\t\tMatrix");
        doubleMatrixMinimum.printMatrixFloat();
        System.out.printf("\n%.01f", doubleMatrixMinimum.getMinimumNumberMatrixFloat());
        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println("Matrix arithmetic mean.");
        Matrix<Integer> integerMatrixAverage = new Matrix<>(2,2);
        integerMatrixAverage.matrixFillRandomInters(450);
        System.out.println("\t\tMatrix");
        integerMatrixAverage.printMatrixInteger();
        System.out.println(integerMatrixAverage.getAverageMatrix());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
