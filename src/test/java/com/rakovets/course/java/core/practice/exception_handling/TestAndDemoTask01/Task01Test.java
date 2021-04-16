package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask01;

import com.rakovets.course.java.core.practice.exception_handling.Task01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task01Test {
    @Test
    void throwException() {
        Executable actualExecutable = () -> Task01.throwException();

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
