package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {
    Task6 task = new Task6();
    Demo6 demo = new Demo6();

    @Test
    public void testGetNumber() {
        Assertions.assertThrows(ArgumentPositiveException.class, () -> task.getNumber(5));
        Assertions.assertThrows(ArgumentNegativeException.class, () -> task.getNumber(-5));
        Assertions.assertThrows(ArgumentZeroException.class, () -> task.getNumber(0));
    }

    @Test
    public void testGetNumberPositive() throws ArgumentPositiveException, ArgumentZeroException, ArgumentNegativeException {
        task.getNumber(2);
    }

    @Test
    public void testGetNumberZero() throws ArgumentPositiveException, ArgumentZeroException, ArgumentNegativeException {
        task.getNumber(0);
    }

    @Test
    public void testGetNumberNegative() throws ArgumentPositiveException, ArgumentZeroException, ArgumentNegativeException {
        task.getNumber(-2);
    }

    @Test
    public void testDemoGetNumberPositive() {
        demo.demoGetNumber(2);
    }

    @Test
    public void testDemoGetNumberZero() {
        demo.demoGetNumber(0);
    }

    @Test
    public void testDemoGetNumberNegative() {
        demo.demoGetNumber(-2);
    }
}
