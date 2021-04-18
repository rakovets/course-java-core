package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task2Test {

    @Test
    void illegalArrayTest() {
        Executable actualExecutable = () -> Task2.illegalArray();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, actualExecutable);
    }
}
