package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Matrix<T extends Number> {
    private final Number[][] MATRIX;
    private int string;
    private int column;

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /**
     * Constructor.
     *
     * @param string the number of rows in the matrix.
     * @param column the number of columns in the matrix.
     */
    public Matrix(int string, int column) {
        MATRIX = new Number[string][column];
        this.string = string;
        this.column = column;
    }

    /**
     * Additional constructor.
     *
     * @param MATRIX the resulting matrix.
     */
    public Matrix(Number[][] MATRIX) {
        this.MATRIX = MATRIX;
    }

    /**
     * Filling the matrix from the keyboard with integer values.
     */
    public void matrixFillInteger() {
        for (int i = 0; i < this.MATRIX.length; i++) {
            for (int j = 0; j < this.MATRIX[i].length; j++) {
                this.MATRIX[i][j] = scanner.nextBigInteger();
            }
        }
    }

    /**
     * Filling a matrix from the keyboard with floating point values.
     */
    public void matrixFillFloatingPoint() {
        for (int i = 0; i < this.MATRIX.length; i++) {
            for (int j = 0; j < this.MATRIX[i].length; j++) {
                this.MATRIX[i][j] = scanner.nextBigDecimal();
            }
        }
    }

    /**
     * Fills the matrix with random integers.
     */
    public void matrixFillRandomInters() {
        for (int i = 0; i < this.MATRIX.length; i++) {
            for (int j = 0; j < this.MATRIX[i].length; j++) {
                this.MATRIX[i][j] = random.nextInt();
            }
        }
    }

    /**
     * Fills the matrix with random integers from 0 to the given value.
     *
     * @param size maximum value from 0 to size.
     */
    public void matrixFillRandomInters(int size) {
        for (int i = 0; i < this.MATRIX.length; i++) {
            for (int j = 0; j < this.MATRIX[i].length; j++) {
                this.MATRIX[i][j] = random.nextInt(size);
            }
        }
    }

    /**
     * Fills the matrix with random floating point numbers.
     */
    public void matrixFillRandomFloat() {
        for (int i = 0; i < this.MATRIX.length; i++) {
            for (int j = 0; j < this.MATRIX[i].length; j++) {
                this.MATRIX[i][j] = random.nextDouble();
            }
        }
    }

    /**
     * Prints an integer matrix.
     */
    public void printMatrix() {
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++)
                System.out.printf("%.5s\t", MATRIX[i][j]);
            System.out.println();
        }
    }

    /**
     * Finds the maximum element in an integer matrix.
     *
     * @return maximum value from matrices.
     */
    public long getMaximumNumberMatrixInteger() {
        long maximum = 0;

        for (Number[] matrix : this.MATRIX) {
            for (int j = 0; j < this.MATRIX[0].length; j++) {
                if (maximum < matrix[j].intValue()) {
                    maximum = matrix[j].intValue();
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum element in an integer matrix.
     *
     * @param array matrix to search for the maximum value.
     * @param <T>   generic data type.
     * @return maximum value from matrices.
     */
    public static <T extends Number> long getMaximumNumberMatrixInteger(T[][] array) {
        long maximum = 0;

        for (T[] matrix : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (maximum < matrix[j].intValue()) {
                    maximum = matrix[j].intValue();
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
    public double getMaximumNumberMatrixFloat() {
        double maximum = 0;

        for (Number[] matrix : this.MATRIX) {
            for (int j = 0; j < this.MATRIX[0].length; j++) {
                if (maximum < matrix[j].doubleValue()) {
                    maximum = matrix[j].doubleValue();
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum element in a floating-point matrix.
     *
     * @param array matrix to search for the maximum value.
     * @param <T>   generic data type.
     * @return maximum value from matrices.
     */
    public static <T extends Number> double getMaximumNumberMatrixFloat(T[][] array) {
        double maximum = 0;

        for (T[] matrix : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (maximum < matrix[j].doubleValue()) {
                    maximum = matrix[j].doubleValue();
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
    public long getMinimumNumberMatrixInteger() {
        Number minimum = MATRIX[0][0];

        for (Number[] matrix : this.MATRIX) {
            for (int j = 0; j < this.MATRIX[0].length; j++) {
                if (matrix[j].intValue() < minimum.intValue()) {
                    minimum = matrix[j];
                }
            }
        }
        return minimum.intValue();
    }

    /**
     * Finds the minimum element in an integer matrix.
     *
     * @param array matrix to search for the minimum value.
     * @return minimum value from matrices.
     */
    public static <T extends Number> long getMinimumNumberMatrixInteger(T[][] array) {
        Number minimum = array[0][0];

        for (Number[] matrix : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (matrix[j].intValue() < minimum.intValue()) {
                    minimum = matrix[j];
                }
            }
        }
        return minimum.intValue();
    }

    /**
     * Finds the minimum element in a floating-point matrix.
     *
     * @return minimum value from matrices.
     */
    public double getMinimumNumberMatrixFloat() {
        Number minimum = MATRIX[0][0];

        for (Number[] matrix : this.MATRIX) {
            for (int j = 0; j < this.MATRIX[0].length; j++) {
                if (matrix[j].doubleValue() < minimum.doubleValue()) {
                    minimum = matrix[j];
                }
            }
        }
        return minimum.doubleValue();
    }

    /**
     * Finds the minimum element in a floating-point matrix.
     *
     * @param array matrix to search for the maximum value.
     * @return minimum value from matrices.
     */
    public static <T extends Number> double getMinimumNumberMatrixFloat(T[][] array) {
        Number minimum = array[0][0];

        for (Number[] matrix : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (matrix[j].doubleValue() < minimum.doubleValue()) {
                    minimum = matrix[j];
                }
            }
        }
        return minimum.doubleValue();
    }

    /**
     * Finds the arithmetic mean of a matrix.
     *
     * @return average.
     */
    public double getAverageMatrix() {
        double sum = 0;
        int digitCount = 0;

        for (Number[] elements : this.MATRIX) {
            for (int columns = 0; columns < this.MATRIX[0].length; columns++) {
                sum += elements[columns].doubleValue();
                digitCount++;
            }
        }
        return sum / digitCount;
    }

    /**
     * Finds the arithmetic mean of a matrix.
     *
     * @param array the resulting matrix.
     * @param <T>   generic data type.
     * @return average.
     */
    public static <T extends Number> double getAverageMatrix(T[][] array) {
        double sum = 0;
        int digitCount = 0;

        for (Number[] elements : array) {
            for (int columns = 0; columns < array[0].length; columns++) {
                sum += elements[columns].doubleValue();
                digitCount++;
            }
        }
        return sum / digitCount;
    }

    /**
     * Performing integer matrix addition.
     *
     * @param secondMatrix matrix to perform addition with the first matrix.
     * @return new matrix is the result of adding two matrices.
     */
    public Matrix<T> additionMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<T> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.MATRIX[i][j] = firstMatrix.MATRIX[i][j].intValue() + secondMatrix.MATRIX[i][j].intValue();
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
    public Matrix<T> additionMatrixIFloat(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<T> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.MATRIX[i][j] = firstMatrix.MATRIX[i][j].doubleValue() + secondMatrix.MATRIX[i][j].doubleValue();
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
    public Matrix<T> subtractionMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<T> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.MATRIX[i][j] = firstMatrix.MATRIX[i][j].intValue() - secondMatrix.MATRIX[i][j].intValue();
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
    public Matrix<T> subtractionMatrixFloat(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<T> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.MATRIX[i][j] = firstMatrix.MATRIX[i][j].doubleValue() - secondMatrix.MATRIX[i][j].doubleValue();
            }
        }
        return thirdMatrix;
    }

    /**
     * Matrix multiplication with floating point values.
     *
     * @param secondMatrix matrix to multiply.
     */
    public void multiplicationMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        int[][] thirdMatrix = new int[string][column];

        int firstMatrixString = firstMatrix.getString();
        int secondMatrixColumn = secondMatrix.getColumn();
        int secondMatrixString = secondMatrix.getString();

        for (int i = 0; i < firstMatrixString; i++) {
            for (int j = 0; j < secondMatrixColumn; j++) {
                for (int k = 0; k < secondMatrixString; k++) {
                    thirdMatrix[i][j] += firstMatrix.MATRIX[i][k].intValue() * secondMatrix.MATRIX[k][j].intValue();
                }
            }
        }
        for (int[] matrix : thirdMatrix) {
            for (int j = 0; j < thirdMatrix[0].length; j++)
                System.out.printf("%.5s\t", matrix[j]);
            System.out.println();
        }
    }

    /**
     * @param secondMatrix matrix to multiply.
     */
    public void multiplicationMatrixFloat(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        double[][] thirdMatrix = new double[string][column];

        int firstMatrixString = firstMatrix.getString();
        int secondMatrixColumn = secondMatrix.getColumn();
        int secondMatrixString = secondMatrix.getString();

        for (int i = 0; i < firstMatrixString; i++) {
            for (int j = 0; j < secondMatrixColumn; j++) {
                for (int k = 0; k < secondMatrixString; k++) {
                    thirdMatrix[i][j] += firstMatrix.MATRIX[i][k].doubleValue() * secondMatrix.MATRIX[k][j].doubleValue();
                }
            }
        }
        for (double[] matrix : thirdMatrix) {
            for (int j = 0; j < thirdMatrix[0].length; j++)
                System.out.printf("%.5s\t", matrix[j]);
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Matrix)) {
            return false;
        }
        Matrix<?> matrix = (Matrix<?>) o;

        return string == matrix.string && column == matrix.column && Arrays.deepEquals(MATRIX, matrix.MATRIX);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(string, column);
        result = 31 * result + Arrays.deepHashCode(MATRIX);

        return result;
    }

    public int getString() {
        return string;
    }

    public int getColumn() {
        return column;
    }
}
