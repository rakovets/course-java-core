package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask04;

import com.rakovets.course.java.core.practice.exception_handling.Task04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task4Test {
    @Test
    void throwException() {
        Executable actualExecutable = () -> Task04.throwException(null);

        Assertions.assertThrows(Task04.class, actualExecutable);
    }
}
