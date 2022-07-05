package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyExceptionTask5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    Task5 task = new Task5();
    Demo5 demo = new Demo5();

    @Test
    public void testDivideNumberNull() {
        Assertions.assertThrows(MyExceptionTask5.class, () -> task.divideNumber(2, 0));
    }

    @Test
    public void testDivideNumber() throws MyExceptionTask5 {
        task.divideNumber(2, 2);
    }

    @Test
    public void testDemoDivideNumber() {
        demo.demoDivideNumber(2, 2);
    }


    @Test
    public void testDemoDivideNumberNull() {
        demo.demoDivideNumber(2, 0);
    }
}
