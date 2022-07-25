package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRuntimeExceptionOnNullString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomRuntimeExceptionTest {
    private static CustomRuntimeExceptionTask task;

    @BeforeAll
    static void setUp() {
        task = new CustomRuntimeExceptionTask();
    }

    @Test
    public void testProduceMyExceptionOnNullString() {
        Assertions.assertThrows(MyRuntimeExceptionOnNullString.class, () -> task.produceMyExceptionOnNullString(null));
    }

    @Test
    public void testProduceMyExceptionNotNull() {
        Assertions.assertDoesNotThrow(() -> task.produceMyExceptionOnNullString(""));
    }
}
