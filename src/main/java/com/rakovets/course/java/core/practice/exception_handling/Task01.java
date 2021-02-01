package com.rakovets.course.java.core.practice.exception_handling;

public class Task01 {
        public static void main(String[] args) {
            String string = null;
            try {
                string.toString();
            } catch (NullPointerException ex) {
                System.out.println("String is empty");
            }
        }
}


