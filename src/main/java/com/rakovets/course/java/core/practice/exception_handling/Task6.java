package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.EquilateralTriangleException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.TriangleException;

public class Task6 {
    public static void getException(int a, int b, int c) throws IllegalArgumentException, TriangleException, EquilateralTriangleException {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new TriangleException("Incorrect value of sides");
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("The side of the triangle must be > 0");
        }
        if (a == b && a == c && a > 0) {
            throw new EquilateralTriangleException("The Tryangle is Equilateral");
        }
    }
}
