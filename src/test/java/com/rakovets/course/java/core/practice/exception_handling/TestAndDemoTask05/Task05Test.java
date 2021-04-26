package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask05;

import com.rakovets.course.java.core.practice.exception_handling.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.Task05;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task05Test {
    @Test
    void throwException() {
        Executable actualExecutable = () -> Task05.throwException();

        Assertions.assertThrows(CustomException.class, actualExecutable);
    }
}
