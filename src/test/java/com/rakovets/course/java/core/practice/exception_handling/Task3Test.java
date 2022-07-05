package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {
    Task3 task = new Task3();
    Demo3 demo = new Demo3();

    @Test
    public void testGetPositiveNumberNegative() {
        Assertions.assertThrows(ArgumentPositiveException.class, () -> task.getPositiveNumber(-2));
    }

    @Test
    public void testGetPositiveNumber() throws ArgumentNegativeException {
        task.getPositiveNumber(3);
    }

    @Test
    public void testDemoGetPositiveNumber() {
        demo.demoGetPositiveNumber(3);
    }

    @Test
    public void testDemoGetPositiveNumberNeggative() {
        demo.demoGetPositiveNumber(-2);
    }
}
