package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {
    ArrayIndexOutOfBoundsExceptionTask task = new ArrayIndexOutOfBoundsExceptionTask();
    ArrayIndexOutOfBoundsExceptionDemo demo = new ArrayIndexOutOfBoundsExceptionDemo();

    @Test
    public void testProduceArrayIndexOutOfBoundsException() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> task.produceArrayIndexOutOfBoundsException());
    }

    @Test
    public void testCatchArrayIndexOutOfBoundsException() {
        demo.catchArrayIndexOutOfBoundsException();
    }
}
