package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomArithmeticException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomArithmeticExceptionTest {
    private static CustomArithmeticExceptionTask task;

    @BeforeAll
    static void setUp() {
        task = new CustomArithmeticExceptionTask();
    }

    @Test
    public void testProduceCustomArithmeticExceptionZero() {
        Assertions.assertThrows(CustomArithmeticException.class, () -> task.produceCustomArithmeticException(2, 0));
    }

    @Test
    public void testProduceCustomArithmeticException() {
        Assertions.assertDoesNotThrow(() -> task.produceCustomArithmeticException(2, 2));
    }
}
