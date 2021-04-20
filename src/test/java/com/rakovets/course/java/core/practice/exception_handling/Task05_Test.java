package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task05_Test {

    @Test
    void divisionNumbers() {
        Task05 task = new Task05();
        Executable actualExecutable = () -> task.divisionNumbers(5, 0);
        Assertions.assertThrows(ArithmeticException.class, actualExecutable);
    }
}
