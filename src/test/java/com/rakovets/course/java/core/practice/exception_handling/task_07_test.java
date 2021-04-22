package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task_07.NotEvenNumberException;
import com.rakovets.course.java.core.practice.exception_handling.task_07.NumberChecker;

public class task_07_test {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            try {
                arr[j] = NumberChecker.isEvenNumber(i);
                j++;
                System.out.println(". Number was added to the arr array");
            } catch (NotEvenNumberException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Continue Checking");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " ---- " + arr[i]);
        }

    }
}
