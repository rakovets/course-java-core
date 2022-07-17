package com.rakovets.course.java.core.practice.generics;

public class MatrixDemo {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Integer matrix from the keyboard. Type Integer.");
        Matrix<Integer> integerMatrix = new Matrix<>(3, 3);
        integerMatrix.matrixFillInteger();
        System.out.println("Matrix");
        integerMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Integer matrix from the keyboard. Type Long.");
        Matrix<Long> longMatrix = new Matrix<>(3, 3);
        longMatrix.matrixFillInteger();
        System.out.println("Matrix");
        longMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Integer matrix from the keyboard. Type Short.");
        Matrix<Short> shortMatrix = new Matrix<>(3, 3);
        shortMatrix.matrixFillInteger();
        System.out.println("Matrix");
        shortMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Integer matrix from the keyboard. Type Byte.");
        Matrix<Byte> byteMatrix = new Matrix<>(3, 3);
        byteMatrix.matrixFillInteger();
        System.out.println("Matrix");
        byteMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("A matrix with keyboard floating point values. Type Double.");
        Matrix<Double> doubleMatrix = new Matrix<>(3, 3);
        doubleMatrix.matrixFillFloatingPoint();
        System.out.println("Matrix");
        doubleMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("A matrix with keyboard floating point values. Type Float.");
        Matrix<Float> floatMatrix = new Matrix<>(3, 3);
        floatMatrix.matrixFillFloatingPoint();
        System.out.println("Matrix");
        floatMatrix.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers. Type Integer.");
        Matrix<Integer> integerMatrixFillRandomInters = new Matrix<>(5, 5);
        integerMatrixFillRandomInters.matrixFillRandomInters(-5, 5);
        System.out.println("Matrix");
        integerMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers. Type Long.");
        Matrix<Long> longMatrixFillRandomInters = new Matrix<>(5, 5);
        longMatrixFillRandomInters.matrixFillRandomInters(-5, 5);
        System.out.println("Matrix");
        longMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers. Type Short.");
        Matrix<Short> shortMatrixFillRandomInters = new Matrix<>(5, 5);
        shortMatrixFillRandomInters.matrixFillRandomInters(-5, 5);
        System.out.println("Matrix");
        shortMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers. Type Byte.");
        Matrix<Byte> byteMatrixFillRandomInters = new Matrix<>(5, 5);
        byteMatrixFillRandomInters.matrixFillRandomInters(-5, 5);
        System.out.println("Matrix");
        byteMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers. Type Float.");
        Matrix<Float> floatMatrixFillRandomInters = new Matrix<>(5, 5);
        floatMatrixFillRandomInters.matrixFillRandomInters(-5, 5);
        System.out.println("Matrix");
        floatMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Matrix with random integers. Type Double.");
        Matrix<Double> doubleMatrixFillRandomInters = new Matrix<>(5, 5);
        doubleMatrixFillRandomInters.matrixFillRandomInters(-5, 5);
        System.out.println("Matrix");
        doubleMatrixFillRandomInters.printMatrix();
        System.out.println("-----------------------------------------------------------------------------------------");

        Matrix<Integer> integerMatrixFirstMatrix = new Matrix<>(3, 3);
        Matrix<Integer> integerMatrixSecondMatrix = new Matrix<>(3, 3);
        System.out.println("The first integer matrix.");
        integerMatrixFirstMatrix.matrixFillRandomInters(0, 9);
        integerMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second integer matrix.");
        integerMatrixSecondMatrix.matrixFillRandomInters(0, 10);
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
        byteMatrixFirstMatrix.matrixFillRandomInters(0, 9);
        byteMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second byte matrix.");
        byteMatrixSecondMatrix.matrixFillRandomInters(0, 9);
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
        longMatrixFirstMatrix.matrixFillRandomInters(0, 9);
        longMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second long matrix.");
        longMatrixSecondMatrix.matrixFillRandomInters(0, 9);
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
        doubleMatrixFirstMatrix.matrixFillRandomInters(0, 9);
        doubleMatrixFirstMatrix.printMatrix();
        System.out.println("\nThe second double matrix.");
        doubleMatrixSecondMatrix.matrixFillRandomInters(0, 9);
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
