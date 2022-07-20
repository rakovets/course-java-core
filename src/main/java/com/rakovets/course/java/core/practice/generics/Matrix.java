package com.rakovets.course.java.core.practice.generics;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.*;

public class Matrix<T extends Number> {
    private final T[][] data;
    private int string;
    private int column;

    private static final Scanner SCANNER = new Scanner(in);
    private static final Random RANDOM = new Random();

    /**
     * Constructor.
     *
     * @param string the number of rows in the matrix.
     * @param column the number of columns in the matrix.
     */
    @SuppressWarnings("unchecked")
    public Matrix(int string, int column) {
        data = (T[][]) new Number[string][column];
        this.string = string;
        this.column = column;
    }

    /**
     * Additional constructor.
     *
     * @param data the resulting matrix.
     */
    public Matrix(T[][] data) {
        this.data = data;
    }

    /**
     * Filling the matrix from the keyboard with integer values.
     */
    @SuppressWarnings("unchecked")
    public void matrixFillInteger() {
        for (T[] ts : data) {
            Arrays.setAll(ts, j -> (T) SCANNER.nextBigInteger());
        }
    }

    /**
     * Filling a matrix from the keyboard with floating point values.
     */
    @SuppressWarnings("unchecked")
    public void matrixFillFloatingPoint() {
        for (T[] ts : data) {
            Arrays.setAll(ts, j -> (T) SCANNER.nextBigDecimal());
        }
    }

    /**
     * Fills the matrix with random integers.
     *
     * @param maximumNumber the smallest number in the matrix.
     * @param minimumNumber the largest number in the matrix.
     */
    @SuppressWarnings("unchecked")
    public void matrixFillRandomInters(int minimumNumber, int maximumNumber) {
        String minimum = Integer.toString(minimumNumber);
        String maximum = Integer.toString(maximumNumber + 1);

        BigInteger bigIntegerMinimum = new BigInteger(minimum);
        BigInteger bigIntegerMaximum = new BigInteger(maximum);

        int length = bigIntegerMaximum.bitLength();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                BigInteger number = new BigInteger(length, RANDOM);
                if (number.compareTo(bigIntegerMinimum) < 0) {
                    number = number.add(bigIntegerMinimum);
                } else if (number.compareTo(bigIntegerMaximum) >= 0) {
                    number = number.mod(bigIntegerMaximum).add(bigIntegerMinimum);
                }
                data[i][j] = (T) number;
            }
        }
    }

    /**
     * Prints matrix.
     */
    public void printMatrix() {
        int i = 0;
        while (i < data.length) {
            int j = 0;
            while (j < data[i].length) {
                out.print("\t" + data[i][j]);
                j++;
            }
            out.println();
            i++;
        }
    }

    /**
     * Finds the maximum element in an integer matrix.
     *
     * @return maximum value from matrices.
     */
    public T getMaximumNumberMatrixInteger() {
        T maximum = data[0][0];

        for (T[] matrix : data) {
            for (int j = 0; j < this.data[0].length; j++) {
                if (maximum.intValue() < matrix[j].intValue()) {
                    maximum = matrix[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum element in a floating-point matrix.
     *
     * @return maximum value from matrices.
     */
    public T getMaximumNumberMatrixFloat() {
        T maximum = data[0][0];

        for (T[] matrix : data) {
            for (int j = 0; j < this.data[0].length; j++) {
                if (maximum.doubleValue() < matrix[j].doubleValue()) {
                    maximum = matrix[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the minimum element in an integer matrix.
     *
     * @return minimum value from matrices.
     */
    public T getMinimumNumberMatrixInteger() {
        T minimum = data[0][0];

        for (T[] matrix : data) {
            for (int j = 0; j < this.data[0].length; j++) {
                if (matrix[j].intValue() < minimum.intValue()) {
                    minimum = matrix[j];
                }
            }
        }
        return minimum;
    }


    /**
     * Finds the minimum element in a floating-point matrix.
     *
     * @return minimum value from matrices.
     */
    public T getMinimumNumberMatrixFloat() {
        T minimum = data[0][0];

        for (T[] matrix : data) {
            for (int j = 0; j < this.data[0].length; j++) {
                if (matrix[j].doubleValue() < minimum.doubleValue()) {
                    minimum = matrix[j];
                }
            }
        }
        return minimum;
    }

    /**
     * Finds the arithmetic mean of a matrix.
     *
     * @return average.
     */
    public double getAverageMatrix() {
        double sum = 0;
        int digitCount = 0;

        for (T[] elements : data) {
            for (int columns = 0; columns < data[0].length; columns++) {
                sum += elements[columns].doubleValue();
                digitCount++;
            }
        }
        assert digitCount != 0;
        return sum / digitCount;
    }

    /**
     * Performing integer matrix addition.
     *
     * @param secondMatrix matrix to perform addition with the first matrix.
     * @return new matrix is the result of adding two matrices.
     */
    public Matrix<Number> additionMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<Number> thirdMatrix = new Matrix<>(data.length, data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                thirdMatrix.data[i][j] = firstMatrix.data[i][j].intValue() + secondMatrix.data[i][j].intValue();
            }
        }
        return thirdMatrix;
    }

    /**
     * Performing matrix addition with floating point values.
     *
     * @param secondMatrix matrix to perform addition with the first matrix.
     * @return new matrix is the result of adding two matrices.
     */
    public Matrix<Number> additionMatrixFloat(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<Number> thirdMatrix = new Matrix<>(data.length, data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                thirdMatrix.data[i][j] = firstMatrix.data[i][j].doubleValue()
                        + secondMatrix.data[i][j].doubleValue();
            }
        }
        return thirdMatrix;
    }

    /**
     * Performs a matrix integer subtraction.
     *
     * @param secondMatrix matrices to perform subtraction.
     * @return result of matrix subtraction.
     */
    public Matrix<Number> subtractionMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<Number> thirdMatrix = new Matrix<>(data.length, data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                thirdMatrix.data[i][j] = firstMatrix.data[i][j].intValue() - secondMatrix.data[i][j].intValue();
            }
        }
        return thirdMatrix;
    }

    /**
     * Performs matrix subtraction on floating point numbers.
     *
     * @param secondMatrix matrices to perform subtraction.
     * @return result of matrix subtraction.
     */
    public Matrix<Number> subtractionMatrixFloat(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<Number> thirdMatrix = new Matrix<>(data.length, data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                thirdMatrix.data[i][j] = firstMatrix.data[i][j].doubleValue()
                        - secondMatrix.data[i][j].doubleValue();
            }
        }
        return thirdMatrix;
    }

    /**
     * Multiplication of integer matrices.
     *
     * @param secondMatrix matrix to multiply.
     */
    public void multiplicationMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        int[][] thirdMatrix = new int[data.length][data[0].length];

        int i = 0;
        while (i < data.length) {
            for (int j = 0; j < secondMatrix.column; j++) {
                for (int k = 0; k < secondMatrix.string; k++) {
                    thirdMatrix[i][j] += firstMatrix.data[i][k].intValue() * secondMatrix.data[k][j].intValue();
                }
            }
            i++;
        }
        Arrays.stream(thirdMatrix).forEach(matrix -> {
            IntStream.range(0, thirdMatrix[0].length).forEach(j -> out.printf("%.5s\t", matrix[j]));
            out.println();
        });
    }

    /**
     * Matrix multiplication with floating point values.
     *
     * @param secondMatrix matrix to multiply.
     */
    public void multiplicationMatrixFloat(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        double[][] thirdMatrix = new double[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < secondMatrix.column; j++) {
                for (int k = 0; k < secondMatrix.string; k++) {
                    thirdMatrix[i][j] += firstMatrix.data[i][k].doubleValue()
                            * secondMatrix.data[k][j].doubleValue();
                }
            }
        }
        Arrays.stream(thirdMatrix).forEach(matrix -> {
            IntStream.range(0, thirdMatrix[0].length).forEach(j -> out.printf("%.5s\t", matrix[j]));
            out.println();
        });
    }
}
