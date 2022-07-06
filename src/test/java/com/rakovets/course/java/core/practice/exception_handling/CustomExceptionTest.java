package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomExceptionTest {
    CustomExceptionTask task = new CustomExceptionTask();
    CustomExceptionDemo demo = new CustomExceptionDemo();

    @Test
    public void testVerifyPositiveArgument() {
        Assertions.assertDoesNotThrow(() -> task.verifyPositiveArgument(2));
    }

    @Test
    public void testVerifyPositiveArgumentNegative() {
        Assertions.assertThrows(ArgumentNegativeException.class, () -> task.verifyPositiveArgument(-2));
    }

    @Test
    public void testCatchArgumentNegativeException() {
        demo.catchArgumentNegativeException(3);
    }

    @Test
    public void testCatchArgumentNegativeExceptionNegative() {
        demo.catchArgumentNegativeException(-2);
    }
}
