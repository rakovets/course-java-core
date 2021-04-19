package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Scanner;

public class Task2 {
    public static void throwArrayIndexOutOfBoundsException() {
        int[] arr = new int[5];
        arr[8] = 8;
    }
}
