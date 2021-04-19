package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task2Test {

    @Test
    void throwArrayIndexOutOfBoundsException() {

        Executable actualExecutable = () -> Task2.throwArrayIndexOutOfBoundsException();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, actualExecutable);
    }
}
