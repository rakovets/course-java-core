package com.rakovets.course.java.core.practice.generics;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Matrix<T extends Number> {
    private final T[][] matrix;

    private int string;
    private int column;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    /**
     * Constructor.
     *
     * @param string the number of rows in the matrix.
     * @param column the number of columns in the matrix.
     */
    @SuppressWarnings("unchecked")
    public Matrix(int string, int column) {
        matrix = (T[][]) new Number[string][column];
        this.string = string;
        this.column = column;
    }

    /**
     * Additional constructor.
     *
     * @param matrix the resulting matrix.
     */
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Filling the matrix from the keyboard with integer values.
     */
    @SuppressWarnings("unchecked")
    public void matrixFillInteger() {
        for (T[] ts : matrix) {
            Arrays.setAll(ts, j -> (T) SCANNER.nextBigInteger());
        }
    }

    /**
     * Filling a matrix from the keyboard with floating point values.
     */
    @SuppressWarnings("unchecked")
    public void matrixFillFloatingPoint() {
        for (T[] ts : matrix) {
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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                BigInteger number = new BigInteger(length, RANDOM);
                if (number.compareTo(bigIntegerMinimum) < 0) {
                    number = number.add(bigIntegerMinimum);
                } else if (number.compareTo(bigIntegerMaximum) >= 0) {
                    number = number.mod(bigIntegerMaximum).add(bigIntegerMinimum);
                }
                matrix[i][j] = (T) number;
            }
        }
    }

    /**
     * Prints matrix.
     */
    public void printMatrix() {
        int i = 0;
        while (i < string) {
            int j = 0;
            while (j < column) {
                System.out.printf("%.5s\t", matrix[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    /**
     * Finds the maximum element in an integer matrix.
     *
     * @return maximum value from matrices.
     */
    public T getMaximumNumberMatrixInteger() {
        T maximum = matrix[0][0];

        for (T[] matrix : matrix) {
            for (int j = 0; j < this.matrix[0].length; j++) {
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
        T maximum = matrix[0][0];

        for (T[] matrix : matrix) {
            for (int j = 0; j < this.matrix[0].length; j++) {
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
        T minimum = matrix[0][0];

        for (T[] matrix : matrix) {
            for (int j = 0; j < this.matrix[0].length; j++) {
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
        T minimum = matrix[0][0];

        for (T[] matrix : matrix) {
            for (int j = 0; j < this.matrix[0].length; j++) {
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

        for (T[] elements : matrix) {
            for (int columns = 0; columns < matrix[0].length; columns++) {
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
    public Matrix<Number> additionMatrixInteger(Matrix<T> secondMatrix) {
        Matrix<T> firstMatrix = this;

        Matrix<Number> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.matrix[i][j] = firstMatrix.matrix[i][j].intValue() + secondMatrix.matrix[i][j].intValue();
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

        Matrix<Number> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.matrix[i][j] = firstMatrix.matrix[i][j].doubleValue()
                        + secondMatrix.matrix[i][j].doubleValue();
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

        Matrix<Number> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.matrix[i][j] = firstMatrix.matrix[i][j].intValue() - secondMatrix.matrix[i][j].intValue();
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

        Matrix<Number> thirdMatrix = new Matrix<>(string, column);

        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                thirdMatrix.matrix[i][j] = firstMatrix.matrix[i][j].doubleValue()
                        - secondMatrix.matrix[i][j].doubleValue();
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

        int[][] thirdMatrix = new int[string][column];

        int firstMatrixString = firstMatrix.getString();
        int secondMatrixColumn = secondMatrix.getColumn();
        int secondMatrixString = secondMatrix.getString();

        int i = 0;
        while (i < firstMatrixString) {
            for (int j = 0; j < secondMatrixColumn; j++) {
                for (int k = 0; k < secondMatrixString; k++) {
                    thirdMatrix[i][j] += firstMatrix.matrix[i][k].intValue() * secondMatrix.matrix[k][j].intValue();
                }
            }
            i++;
        }
        Arrays.stream(thirdMatrix).forEach(matrix -> {
            IntStream.range(0, thirdMatrix[0].length).forEach(j -> System.out.printf("%.5s\t", matrix[j]));
            System.out.println();
        });
    }

    /**
     * Matrix multiplication with floating point values.
     *
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
                    thirdMatrix[i][j] += firstMatrix.matrix[i][k].doubleValue()
                            * secondMatrix.matrix[k][j].doubleValue();
                }
            }
        }
        Arrays.stream(thirdMatrix).forEach(matrix -> {
            IntStream.range(0, thirdMatrix[0].length).forEach(j -> System.out.printf("%.5s\t", matrix[j]));
            System.out.println();
        });
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Matrix)) {
            return false;
        }
        Matrix<?> matrix1 = (Matrix<?>) o;

        return string == matrix1.string && column == matrix1.column && Arrays.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(string, column);
        result = 31 * result + Arrays.deepHashCode(matrix);

        return result;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }

    public int getColumn() {
        return column;
    }
}
