package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NpeTest {
    NpeTask task;

    @BeforeAll
    public void setUp() {
        task = new NpeTask();
    }

    @Test
    public void testProduceNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> task.produceNullPointerException());
    }
}
