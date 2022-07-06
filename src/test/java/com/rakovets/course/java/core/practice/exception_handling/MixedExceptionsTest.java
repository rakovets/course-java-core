package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MixedExceptionsTest {

    MixedExceptionsTask task = new MixedExceptionsTask();
    MixedExceptionsDemo demo = new MixedExceptionsDemo();

    @Test
    public void testProduceMixedExceptionsPositiveNumber() {
        Assertions.assertThrows(ArgumentPositiveException.class, () -> task.produceMixedExceptions(3));
    }

    @Test
    public void testProduceMixedExceptionsNegativeNumber() {
        Assertions.assertThrows(RuntimeException.class, () -> task.produceMixedExceptions(-3));
    }

    @Test
    public void testCatchMixedExceptionsPositiveNumber() {
        demo.catchMixedExceptions(3);
    }

    @Test
    public void testCatchMixedExceptionsNegativeNumber() {
        Assertions.assertThrows(RuntimeException.class, () -> demo.catchMixedExceptions(-3));
    }
}
