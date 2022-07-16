package com.rakovets.course.java.core.practice.generics;

public class MatrixDemo {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Integer matrix from the keyboard.");
        Matrix<Integer> integerMatrix = new Matrix<>(3, 3);
        integerMatrix.matrixFillInteger();
        System.out.println("Matrix");
        integerMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("A matrix with keyboard floating point values.");
        Matrix<Double> doubleMatrix = new Matrix<>(3, 3);
        doubleMatrix.matrixFillFloatingPoint();
        System.out.println("Matrix");
        doubleMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers.");
        Matrix<Integer> integerMatrixFillRandomInters = new Matrix<>(5, 5);
        integerMatrixFillRandomInters.matrixFillRandomInters(450);
        System.out.println("Matrix");
        integerMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random floating point numbers.");
        Matrix<Double> doubleMatrixFillRandomFloat = new Matrix<>(5, 5);
        doubleMatrixFillRandomFloat.matrixFillRandomFloat();
        System.out.println("Matrix");
        doubleMatrixFillRandomFloat.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The maximum value in an integer matrix. With limited numerical range.");
        Matrix<Integer> integerMatrixMaximum = new Matrix<>(5, 4);
        integerMatrixMaximum.matrixFillRandomInters(450);
        System.out.println("Matrix");
        integerMatrixMaximum.printMatrix();
        System.out.println("\n" + integerMatrixMaximum.getMaximumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("The maximum value in an integer matrix.");
        Matrix<Integer> integerMatrixMaxNoLimit = new Matrix<>(5, 5);
        integerMatrixMaxNoLimit.matrixFillRandomInters();
        System.out.println("Matrix");
        integerMatrixMaxNoLimit.printMatrix();
        System.out.println("\n" + integerMatrixMaxNoLimit.getMaximumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The maximum value in a floating point matrix.");
        Matrix<Double> doubleMatrixMaximum = new Matrix<>(5, 5);
        doubleMatrixMaximum.matrixFillRandomFloat();
        System.out.println("Matrix");
        doubleMatrixMaximum.printMatrix();
        System.out.printf("\n%.03f", doubleMatrixMaximum.getMaximumNumberMatrixFloat());
        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println("The minimum value in an integer matrix. With limited numerical range.");
        Matrix<Integer> integerMatrixMinimum = new Matrix<>(5, 5);
        integerMatrixMinimum.matrixFillRandomInters(475);
        System.out.println("Matrix");
        integerMatrixMinimum.printMatrix();
        System.out.println("\n" + integerMatrixMinimum.getMinimumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The minimum value in an integer matrix.");
        Matrix<Integer> integerMatrixMinimumNoLimit = new Matrix<>(5, 5);
        integerMatrixMinimumNoLimit.matrixFillRandomInters();
        System.out.println("Matrix");
        integerMatrixMinimumNoLimit.printMatrix();
        System.out.println("\n" + integerMatrixMinimumNoLimit.getMinimumNumberMatrixInteger());
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("The minimum element in a floating-point matrix.");
        Matrix<Double> doubleMatrixMinimum = new Matrix<>(5, 5);
        doubleMatrixMinimum.matrixFillRandomFloat();
        System.out.println("Matrix");
        doubleMatrixMinimum.printMatrix();
        System.out.printf("\n%.03f", doubleMatrixMinimum.getMinimumNumberMatrixFloat());
        System.out.println("\n---------------------------------------------------------------------------------------");

        System.out.println("Matrix arithmetic mean.");
        Matrix<Integer> integerMatrixAverage = new Matrix<>(2, 2);
        integerMatrixAverage.matrixFillRandomInters(450);
        System.out.println("Matrix");
        integerMatrixAverage.printMatrix();
        System.out.println(integerMatrixAverage.getAverageMatrix());
        System.out.println("-----------------------------------------------------------------------------------------");

        Matrix<Integer> integerMatrixFirstMatrix = new Matrix<>(3, 3);
        Matrix<Integer> integerMatrixSecondMatrix = new Matrix<>(3, 3);
        System.out.println("The first integer matrix.");
        integerMatrixFirstMatrix.matrixFillRandomInters(10);
        integerMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second integer matrix.");
        integerMatrixSecondMatrix.matrixFillRandomInters(10);
        integerMatrixSecondMatrix.printMatrix();
        System.out.println("\nThe third integer matrix. The result of adding the first matrix and the second.");
        integerMatrixFirstMatrix.additionMatrixInteger(integerMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third integer matrix. The result of subtracting the first matrix and the second.");
        integerMatrixFirstMatrix.subtractionMatrixInteger(integerMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third integer matrix. The result of multiplying the first matrix and the second.");
        integerMatrixFirstMatrix.multiplicationMatrixInteger(integerMatrixSecondMatrix);
        System.out.println("-----------------------------------------------------------------------------------------");

        Matrix<Byte> byteMatrixFirstMatrix = new Matrix<>(3, 3);
        Matrix<Byte> byteMatrixSecondMatrix = new Matrix<>(3, 3);
        System.out.println("The first byte matrix.");
        byteMatrixFirstMatrix.matrixFillRandomInters(10);
        byteMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second byte matrix.");
        byteMatrixSecondMatrix.matrixFillRandomInters(10);
        byteMatrixSecondMatrix.printMatrix();
        System.out.println("\nThe third byte matrix. The result of adding the first matrix and the second.");
        byteMatrixFirstMatrix.additionMatrixInteger(byteMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third byte matrix. The result of subtracting the first matrix and the second.");
        byteMatrixFirstMatrix.subtractionMatrixInteger(byteMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third byte matrix. The result of multiplying the first matrix and the second.");
        byteMatrixFirstMatrix.multiplicationMatrixInteger(byteMatrixSecondMatrix);
        System.out.println("-----------------------------------------------------------------------------------------");

        Matrix<Long> longMatrixFirstMatrix = new Matrix<>(3, 3);
        Matrix<Long> longMatrixSecondMatrix = new Matrix<>(3, 3);
        System.out.println("The first long matrix.");
        longMatrixFirstMatrix.matrixFillRandomInters(10);
        longMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second long matrix.");
        longMatrixSecondMatrix.matrixFillRandomInters(10);
        longMatrixSecondMatrix.printMatrix();
        System.out.println("\nThe third long matrix. The result of adding the first matrix and the second.");
        longMatrixFirstMatrix.additionMatrixInteger(longMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third long matrix. The result of subtracting the first matrix and the second.");
        longMatrixFirstMatrix.subtractionMatrixInteger(longMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third long matrix. The result of multiplying the first matrix and the second.");
        longMatrixFirstMatrix.multiplicationMatrixInteger(longMatrixSecondMatrix);
        System.out.println("-----------------------------------------------------------------------------------------");

        Matrix<Double> doubleMatrixFirstMatrix = new Matrix<>(3, 3);
        Matrix<Double> doubleMatrixSecondMatrix = new Matrix<>(3, 3);
        System.out.println("The first double matrix.");
        doubleMatrixFirstMatrix.matrixFillRandomFloat();
        doubleMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second double matrix.");
        doubleMatrixSecondMatrix.matrixFillRandomFloat();
        doubleMatrixSecondMatrix.printMatrix();
        System.out.println("\nThe third double matrix. The result of adding the first matrix and the second.");
        doubleMatrixFirstMatrix.additionMatrixIFloat(doubleMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third double matrix. The result of subtracting the first matrix and the second.");
        doubleMatrixFirstMatrix.subtractionMatrixFloat(doubleMatrixSecondMatrix).printMatrix();
        System.out.println("\nThe third double matrix. The result of multiplying the first matrix and the second.");
        doubleMatrixFirstMatrix.multiplicationMatrixFloat(doubleMatrixSecondMatrix);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
