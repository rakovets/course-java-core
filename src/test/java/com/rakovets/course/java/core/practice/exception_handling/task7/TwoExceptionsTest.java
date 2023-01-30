package com.rakovets.course.java.core.practice.exception_handling.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TwoExceptionsTest {
    @DisplayName("Test trowException, throws NullPointerException")
    @Test
    void trowException1Test() {
        TwoExceptions exceptions = new TwoExceptions(1);

        Executable executable = exceptions::trowException;

        Assertions.assertThrows(NullPointerException.class, executable);
    }

    @DisplayName("Test trowException, throws RuntimeException")
    @Test
    void trowException2Test() {
        TwoExceptions exceptions = new TwoExceptions(2);

        Executable executable = exceptions::trowException;

        Assertions.assertThrows(RuntimeException.class, executable);
    }
}
