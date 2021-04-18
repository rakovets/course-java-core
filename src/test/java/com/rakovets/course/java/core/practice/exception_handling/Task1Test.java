package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task1Test {

    @Test
    void emptyStringTest() {
        Executable actualExecutable = () -> Task1.emptyString();
        Assertions.assertThrows(NullPointerException.class, actualExecutable);
    }
}
