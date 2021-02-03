package com.rakovets.course.java.core.practice.generic_types;

class MatrixDemo {
    public static <T> void main(String[] args) {

        Matrix<Double> matrix = new Matrix<>(3, 3);

        System.out.println("Random Matrix A");
        @SuppressWarnings("unchecked")
        Matrix<T> A = (Matrix<T>) matrix.random(3, 3);
        A.display();
        System.out.println();

        System.out.println("Matrix B (transpose)");
        Matrix<T> B = A.transpose();
        B.display();
        System.out.println();

        System.out.println("Minimum and maximum element of Matrix B");
        B.findMinAndMax();
        System.out.println();

        System.out.println("Arithmetic mean of Matrix B");
        B.findArithmeticMean();
        System.out.println();

        System.out.println("Matrix C = Matrix A + Matrix B");
        A.addition(B).display();
        System.out.println();

        System.out.println("Matrix C = Matrix A - Matrix B");
        A.subtraction(B).display();
        System.out.println();

        System.out.println("Matrix C = Matrix A * Matrix B");
        B.multiplication(A).display();
        System.out.println();

        System.out.println("Matrix C = Matrix A / Matrix B");
        B.division(A).display();
        System.out.println();
    }
}
