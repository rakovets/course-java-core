package com.rakovets.course.java.core.practice.exception_handling;

public class Task02 {
    public static void main(String[] args) {

        int[] num = new int[5];

        try {
            num[6] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out-of-bounds index");
        }
    }
}

