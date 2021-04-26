package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask03;

import com.rakovets.course.java.core.practice.exception_handling.Task03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task03Test {
    @Test
    void throwException() {
        Executable actualExecutable = () -> Task03.throwException(0);

        Assertions.assertThrows(ArithmeticException.class, actualExecutable);
    }
}
