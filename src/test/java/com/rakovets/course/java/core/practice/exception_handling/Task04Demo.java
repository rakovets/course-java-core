package com.rakovets.course.java.core.practice.exception_handling;

public class Task04Demo {
    public static void main(String[] args) {
        try {
            Task04.phoneFinder("Asus");
        } catch (PhoneNotAvailableException e) {
            e.printStackTrace();
        }
    }
}

