package com.rakovets.course.java.core.practice.exception_handling.task_04_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_03.Discount;
import com.rakovets.course.java.core.practice.exception_handling.task_03.WrongSumException;
import com.rakovets.course.java.core.practice.exception_handling.task_04.MathOperations;
import com.rakovets.course.java.core.practice.exception_handling.task_04.WrongDividerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task04Test {
    @Test
    void wrongDividerExceptionTest() {
        Executable actualExecuted = () -> MathOperations.divide(3,3);
        Assertions.assertThrows(WrongDividerException.class, actualExecuted);

    }
}
