package com.rakovets.course.challenge.generics;

public class MatrixTests {
	public static void main(String[] args) {
		Integer[][] matrix1 = Matrix.createMatrixUsingKeyboard();
		Integer[][] matrix2 = Matrix.createMatrixRandom();
		Matrix.addition(matrix2);
		Matrix.subtraction(matrix2);
		Matrix.multiplication(matrix2);
		Matrix.division(matrix2);
		Matrix.searchMaximumAndMinimum(matrix2);
		Matrix.averageValueMatrix(matrix2);
	}
}
