package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task03Test {
    @Test
    void checkAge() {
        int age = 17;

        Executable actualExecutable = () -> Task03.checkAge(age);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
