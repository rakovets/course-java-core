package com.rakovets.course.java.core.practice.exception_handling.task_02_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_02.Task02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task02Test {
        @Test
        void throwArrayExeption() {
            Executable actualExecuted = () -> Task02.throwArrayExeption();
            Assertions.assertThrows(IndexOutOfBoundsException.class, actualExecuted);
        }
    }

