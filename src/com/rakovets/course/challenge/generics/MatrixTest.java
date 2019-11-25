package com.rakovets.course.challenge.generics;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix.fillArrayy();
        Matrix.createMatrixRandom();
        Integer[][] num = Matrix.createMatrixRandom();
        Matrix.arrayDisplay();
        Matrix.searchMaximumAndMinimum(num);
        Matrix.division(num);
    }
}
