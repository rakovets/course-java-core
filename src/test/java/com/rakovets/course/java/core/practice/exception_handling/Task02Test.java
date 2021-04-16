package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task02Test {

    @Test

    void throwException() {
        Executable actualExecutable = () -> Task02.throwException();

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
