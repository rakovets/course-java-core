package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NPETest {
    NPETask task = new NPETask();
    NPEDemo demo = new NPEDemo();

    @Test
    public void testProduceNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> task.produceNullPointerException());
    }

    @Test
    public void testCatchNullPointerException() {
        demo.catchNullPointerException();
    }
}
