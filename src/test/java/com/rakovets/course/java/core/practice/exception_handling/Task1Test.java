package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task1Test {

    @Test
    void throwSomeException() {
        Executable actualExecutable = () -> Task1.throwSomeException();
        Assertions.assertThrows(NullPointerException.class, actualExecutable);
    }
}
