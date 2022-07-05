package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NPETest {
    NPETask task = new NPETask();
    NPEDemo demo = new NPEDemo();

    @Test
    public void testTrimString() {
        Assertions.assertThrows(NullPointerException.class, () -> task.trimString());
    }

    @Test
    public void testGetDemoTrimString() {
        demo.getDemoTrimString();
    }
}
