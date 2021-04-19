package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 {
    public static void ageVerification(int age) throws AgeVerificationException {
        if (age < 18) {
            throw new AgeVerificationException("You are under 18 years old");
        }
    }
}
