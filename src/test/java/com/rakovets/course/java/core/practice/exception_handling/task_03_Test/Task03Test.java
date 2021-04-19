package com.rakovets.course.java.core.practice.exception_handling.task_03_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_02.Task02;
import com.rakovets.course.java.core.practice.exception_handling.task_03.Discount;
import com.rakovets.course.java.core.practice.exception_handling.task_03.WrongSumException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task03Test {
    @Test
    void wrongSumException() {
        Executable actualExecuted = () -> Discount.provideDiscount(0);
        Assertions.assertThrows(WrongSumException.class, actualExecuted);
    }
}

