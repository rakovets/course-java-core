package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask07;

import com.rakovets.course.java.core.practice.exception_handling.Task07;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task07Test {
    @Test
    void throwException() {
        Executable actualExecutable = () -> Task07.throwException(null);

        Assertions.assertThrows(NullPointerException.class, actualExecutable);
    }
}
