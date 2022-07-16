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
    public void printMatrixInteger() {
        for (Number[] matrix : this.MATRIX) {
            for (Number number : matrix) {
                System.out.printf("%4d\t", number.intValue());
            }
            System.out.println();
        }
    }

    /**
     * Prints an integer matrix.
     * The method is not tested! Due to the use of sout.
     *
     * @param array the resulting matrix.
     */
    public void printMatrixInteger(T[][] array) {
        for (T[] matrix : array) {
            for (T number : matrix) {
                System.out.printf("%4d\t", number.intValue());
            }
            System.out.println();
        }
    }

    /**
     * Prints a matrix with floating point values.
     */
    public void printMatrixFloat() {
        for (Number[] matrix : this.MATRIX) {
            for (Number number : matrix) {
                System.out.printf("%4.01f\t", number.doubleValue());
            }
            System.out.println();
        }
    }

    /**
     * Prints a matrix with floating point values.
     * The method is not tested! Due to the use of sout.
     *
     * @param array the resulting matrix.
     */
    public void printMatrixFloat(T[][] array) {
        for (T[] matrix : array) {
            for (T number : matrix) {
                System.out.printf("%4.01f\t", number.doubleValue());
            }
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
}
