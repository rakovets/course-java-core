package com.rakovets.course.java.core.practice.generic_types;

public class Matrix<T> {
    private final int rows;
    private final int columns;
    private final Number[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new Number[rows][columns];
    }

    // random matrix with values between 0-1
    public Matrix<T> random(int rows, int columns) {
        Matrix<T> A = new Matrix<T>(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                A.data[i][j] = Math.random();
        return A;
    }

    // transpose of the invoking matrix
    public Matrix<T> transpose() {
        Matrix<T> A = new Matrix<T>(columns, rows);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                A.data[j][i] = this.data[i][j];
        return A;
    }

    // display matrix
    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.printf("%.5s   ", data[i][j]);
            System.out.println();
        }
    }

    // find minimum and maximum element
    @SuppressWarnings("unchecked")
    public <Number extends Comparable<Number>> void findMinAndMax() {
        Number maxElement = (Number) data[0][0];
        Number minElement = (Number) data[0][0];
        for (java.lang.Number[] elements : data) {
            for (java.lang.Number anElement : elements) {
                if (maxElement.compareTo((Number)(anElement)) < 0)
                    maxElement = (Number) anElement;
                if (minElement.compareTo((Number)(anElement)) > 0)
                    minElement = (Number) anElement;
            }
        }
        System.out.printf("%.5s   ", minElement);
        System.out.printf("%.5s   ", maxElement);
        System.out.println();
    }

    // find Arithmetic mean of the matrix
    public void findArithmeticMean() {
        double sum = 0;
        int count = 0;
        for (Number[] elements : data)
            for (int columns = 0; columns < data[0].length; columns++) {
                sum += (double) elements[columns];
                count++;
            }
        double mean = sum / count;
        System.out.printf("%.5s   ", mean);
        System.out.println();
    }

    // return C = A + B
    public Matrix<T> addition(Matrix<T> B) {
        Matrix<T> A = this;
        if (B.rows != A.rows || B.columns != A.columns)
            throw new RuntimeException("Invalid Matrix Dimensions");
        Matrix<T> C = new Matrix<T>(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                if (A.data[i][j] instanceof Double || B.data[i][j] instanceof Double)
                    C.data[i][j] = A.data[i][j].doubleValue() + B.data[i][j].doubleValue();
                if (A.data[i][j] instanceof Float || B.data[i][j] instanceof Float)
                    C.data[i][j] = A.data[i][j].floatValue() + B.data[i][j].floatValue();
                if (A.data[i][j] instanceof Long || B.data[i][j] instanceof Long)
                    C.data[i][j] = A.data[i][j].longValue() + B.data[i][j].longValue();
                if (A.data[i][j] instanceof Integer || B.data[i][j] instanceof Integer)
                    C.data[i][j] = A.data[i][j].intValue() + B.data[i][j].intValue();
            }
        return C;
    }

    // return C = A - B
    public Matrix<T> subtraction(Matrix<T> B) {
        Matrix<T> A = this;
        if (B.rows != A.rows || B.columns != A.columns)
            throw new RuntimeException("Invalid Matrix Dimensions");
        Matrix<T> C = new Matrix<T>(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                if (A.data[i][j] instanceof Double || B.data[i][j] instanceof Double)
                    C.data[i][j] = A.data[i][j].doubleValue() - B.data[i][j].doubleValue();
                if (A.data[i][j] instanceof Float || B.data[i][j] instanceof Float)
                    C.data[i][j] = A.data[i][j].floatValue() - B.data[i][j].floatValue();
                if (A.data[i][j] instanceof Long || B.data[i][j] instanceof Long)
                    C.data[i][j] = A.data[i][j].longValue() - B.data[i][j].longValue();
                if (A.data[i][j] instanceof Integer || B.data[i][j] instanceof Integer)
                    C.data[i][j] = A.data[i][j].intValue() - B.data[i][j].intValue();
    }
        return C;
}

    // return C = A * B
    public Matrix<T> multiplication(Matrix<T> B) {
        Matrix<T> A = this;
        if (A.columns != B.rows)
            throw new RuntimeException("Invalid Matrix Dimensions");
        Matrix<T> C = new Matrix<T>(A.rows, B.columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                if (A.data[i][j] instanceof Double || B.data[i][j] instanceof Double)
                    C.data[i][j] = A.data[i][j].doubleValue() * B.data[i][j].doubleValue();
                if (A.data[i][j] instanceof Float || B.data[i][j] instanceof Float)
                    C.data[i][j] = A.data[i][j].floatValue() * B.data[i][j].floatValue();
                if (A.data[i][j] instanceof Long || B.data[i][j] instanceof Long)
                    C.data[i][j] = A.data[i][j].longValue() * B.data[i][j].longValue();
                if (A.data[i][j] instanceof Integer || B.data[i][j] instanceof Integer)
                    C.data[i][j] = A.data[i][j].intValue() * B.data[i][j].intValue();
            }
        return C;
    }

    // return C = A / B
    public Matrix<T> division(Matrix<T> B) {
        Matrix<T> A = this;
        if (A.columns != B.rows)
            throw new RuntimeException("Invalid Matrix Dimensions");
        Matrix<T> C = new Matrix<T>(A.rows, B.columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                if (A.data[i][j] instanceof Double || B.data[i][j] instanceof Double)
                    C.data[i][j] = A.data[i][j].doubleValue() / B.data[i][j].doubleValue();
                if (A.data[i][j] instanceof Float || B.data[i][j] instanceof Float)
                    C.data[i][j] = A.data[i][j].floatValue() / B.data[i][j].floatValue();
                if (A.data[i][j] instanceof Long || B.data[i][j] instanceof Long)
                    C.data[i][j] = A.data[i][j].longValue() / B.data[i][j].longValue();
                if (A.data[i][j] instanceof Integer || B.data[i][j] instanceof Integer)
                    C.data[i][j] = A.data[i][j].intValue() / B.data[i][j].intValue();
            }
        return C;
    }
}
