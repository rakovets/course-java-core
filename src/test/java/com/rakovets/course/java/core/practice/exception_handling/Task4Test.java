package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRunTimeExceptionOnNullString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {
    Task4 task = new Task4();
    Demo4 demo = new Demo4();

    @Test
    public void testGetMyExceptionOnNullStringNull() {
        Assertions.assertThrows(MyRunTimeExceptionOnNullString.class, () -> task.getMyExceptionOnNullString(null));
    }

    @Test
    public void testGetMyExceptionOnNullString() {
        task.getMyExceptionOnNullString("");
    }

    @Test
    public void testDemoPrintStackTraceNull() {
        demo.demoPrintStackTrace(null);
    }

    @Test
    public void testDemoPrintStackTrace() {
        demo.demoPrintStackTrace("");
    }
}
