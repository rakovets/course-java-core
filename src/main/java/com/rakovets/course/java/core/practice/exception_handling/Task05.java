package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {
    public static void printText() throws Exception {
        String variableForException = null;
        try {
            System.out.println(variableForException.length());
        } catch (NullPointerException e) {
                throw new Exception("Exception in thread \"main\" java.lang.NullPointerException");
        }
    }}
