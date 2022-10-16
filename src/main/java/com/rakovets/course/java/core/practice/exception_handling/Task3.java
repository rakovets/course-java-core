package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.TriangleException;

class Task3 {
    private static final String CORRECT_TRIANGLE = "Correct sides of Triangle";
    private int a;
    private int b;
    private int c;

    public Task3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static String getTriangle(int a, int b, int c) throws TriangleException {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new TriangleException(" Incorrect sides of the Triangle ");
        }
        return CORRECT_TRIANGLE;
    }
}
