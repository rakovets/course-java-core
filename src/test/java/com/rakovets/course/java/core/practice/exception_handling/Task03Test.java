package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task03Test {

    @Test

    void throwException() {
        Executable actualExecutable = () -> Task03.getDivisionOfNumbers(0);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
