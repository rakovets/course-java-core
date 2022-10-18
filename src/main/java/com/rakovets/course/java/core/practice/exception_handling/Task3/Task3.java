package com.rakovets.course.java.core.practice.exception_handling.Task3;

public class Task3 {
    public void over21(int age) throws Task3Exception {
        if (age < 21) {
            throw new Task3Exception("Person is not allowed to take mortgage");
        }
    }
}
