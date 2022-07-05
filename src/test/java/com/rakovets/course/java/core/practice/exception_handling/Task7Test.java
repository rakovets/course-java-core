package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    Task7 task = new Task7();
    Demo7 demo = new Demo7();

    @Test
    public void testGetPositiveNumber() {
        Assertions.assertThrows(ArgumentPositiveException.class, () -> task.getPositiveNumber(3));
    }

    @Test
    public void testGetPositiveNumberPositive() throws ArgumentPositiveException {
        task.getPositiveNumber(3);
    }

    @Test
    public void testGetPositiveNumberNegative() throws ArgumentPositiveException {
        task.getPositiveNumber(-3);
    }

    @Test
    public void testDemoGetPositiveNumber() {
        demo.demoGetPositiveNumber(3);
    }

    @Test
    public void testDemoGetPositiveNumberNegative() {
        demo.demoGetPositiveNumber(-3);
    }
}
