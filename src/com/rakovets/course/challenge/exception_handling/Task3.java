package com.rakovets.course.challenge.exception_handling;

public class Task3 {
    public static int checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Your age less then 18!", age);
        }
        int ageOfOurClient = age;
        return ageOfOurClient;
    }
}
