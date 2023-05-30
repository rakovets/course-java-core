package com.rakovets.course.java.core.practice.exception_handling.task02;

public class Task {
    public void ArrayException() {
        int[] test = new int[2];
        System.out.println(test[3]);
    }

    public class Demo {
        public void outException() {
            try {
                ArrayException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
    }
}
