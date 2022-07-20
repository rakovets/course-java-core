package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task03Test {
    @Test
    void checkAge() {
        Task03 task03 = new Task03();
        int age = 17;

        Executable actualExecutable = () -> task03.checkAge(age);

        Assertions.assertThrows(AgeException.class, actualExecutable);
    }
}
