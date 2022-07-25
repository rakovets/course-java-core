package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {
    private static ArrayIndexOutOfBoundsExceptionTask task;

    @BeforeAll
    static void setUp() {
        task = new ArrayIndexOutOfBoundsExceptionTask();
    }

    @Test
    public void testProduceArrayIndexOutOfBoundsException() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> task.produceArrayIndexOutOfBoundsException());
    }
}
