package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomArithmeticException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomArithmeticExceptionTest {
    CustomArithmeticExceptionTask task = new CustomArithmeticExceptionTask();
    CustomArithmeticExceptionDemo demo = new CustomArithmeticExceptionDemo();

    @Test
    public void testProduceCustomArithmeticExceptionZero() {
        Assertions.assertThrows(CustomArithmeticException.class, () -> task.produceCustomArithmeticException(2, 0));
    }

    @Test
    public void testProduceCustomArithmeticException() {
        Assertions.assertDoesNotThrow(() -> task.produceCustomArithmeticException(2, 2));
    }

    @Test
    public void testCatchCustomArithmeticException() {
        demo.catchCustomArithmeticException(2, 2);
    }


    @Test
    public void testCatchCustomArithmeticExceptionZero() {
        demo.catchCustomArithmeticException(2, 0);
    }
}
