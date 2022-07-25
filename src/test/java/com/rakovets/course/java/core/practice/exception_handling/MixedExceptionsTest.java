package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MixedExceptionsTest {
    private static MixedExceptionsTask task;

    @BeforeAll
    static void setUp() {
        task = new MixedExceptionsTask();
    }

    @Test
    public void testProduceMixedExceptionsPositiveNumber() {
        Assertions.assertThrows(ArgumentPositiveException.class, () -> task.produceMixedExceptions(3));
    }

    @Test
    public void testProduceMixedExceptionsNegativeNumber() {
        Assertions.assertThrows(RuntimeException.class, () -> task.produceMixedExceptions(-3));
    }
}
