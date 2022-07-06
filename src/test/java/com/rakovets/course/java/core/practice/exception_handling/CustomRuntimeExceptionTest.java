package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRuntimeExceptionOnNullString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomRuntimeExceptionTest {
    CustomRuntimeExceptionTask task = new CustomRuntimeExceptionTask();
    CustomRuntimeExceptionDemo demo = new CustomRuntimeExceptionDemo();

    @Test
    public void testProduceMyExceptionOnNullString() {
        Assertions.assertThrows(MyRuntimeExceptionOnNullString.class, () -> task.produceMyExceptionOnNullString(null));
    }

    @Test
    public void testProduceMyExceptionNotNull() {
        Assertions.assertDoesNotThrow(() -> task.produceMyExceptionOnNullString(""));
    }

    @Test
    public void testCatchMyExceptionOnNullString() {
        demo.catchMyExceptionOnNullString(null);
    }

    @Test
    public void testCatchMyExceptionNotNull() {
        demo.catchMyExceptionOnNullString("");
    }
}
