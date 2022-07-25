package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomExceptionTest {
    private static CustomExceptionTask task;

    @BeforeAll
    static void setUp() {
        task = new CustomExceptionTask();
    }

    @Test
    public void testVerifyPositiveArgument() {
        Assertions.assertDoesNotThrow(() -> task.verifyPositiveArgument(2));
    }

    @Test
    public void testVerifyPositiveArgumentNegative() {
        Assertions.assertThrows(ArgumentNegativeException.class, () -> task.verifyPositiveArgument(-2));
    }
}
