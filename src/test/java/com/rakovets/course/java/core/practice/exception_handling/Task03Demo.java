package com.rakovets.course.java.core.practice.exception_handling;

public class Task03Demo {
    public static void main(String[] args) {
        try {
            Task03.ageVerification(17);
        } catch (AgeVerificationException e) {
            e.printStackTrace();
        }
    }
}
