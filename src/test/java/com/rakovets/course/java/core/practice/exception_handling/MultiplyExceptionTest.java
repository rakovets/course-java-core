package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyExceptionTest {
    MultiplyExceptionTask task = new MultiplyExceptionTask();
    MultiplyExceptionDemo demo = new MultiplyExceptionDemo();

    @Test
    public void testProduceMultiplyExceptions() {
        Assertions.assertThrows(ArgumentPositiveException.class, () -> task.produceMultiplyExceptions(5));
        Assertions.assertThrows(ArgumentNegativeException.class, () -> task.produceMultiplyExceptions(-5));
        Assertions.assertThrows(ArgumentZeroException.class, () -> task.produceMultiplyExceptions(0));
    }

    @Test
    public void testCatchMultiplyExceptionsPositiveNumber() {
        demo.catchMultiplyExceptions(2);
    }

    @Test
    public void testCatchMultiplyExceptionsZero() {
        demo.catchMultiplyExceptions(0);
    }

    @Test
    public void testCatchMultiplyExceptionsNegativeNumber() {
        demo.catchMultiplyExceptions(-2);
    }
}
