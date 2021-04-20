package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;

public class ThirdTaskDemo {
    public static void main(String[] args) {
        try {
            ThirdTask.isWrongLength("123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
