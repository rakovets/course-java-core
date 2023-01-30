package com.rakovets.course.java.core.practice.exception_handling.task1;

public class StringNullActionDemo {
    public static void main(String[] args) {
        StringNullAction stringNullAction = new StringNullAction();

        try {
            stringNullAction.stringConcat();
        } catch (NullPointerException pointerException) {
            System.out.println("Exception has been caught!");
        }
    }
}
