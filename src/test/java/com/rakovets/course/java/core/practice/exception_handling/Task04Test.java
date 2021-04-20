package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.OutOfRangeRuntimeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

    public class Task04Test {
        @Test
        void outOfRangeRuntimeException() {
            Executable actualExecutable = () -> Task04.outOfRangeRuntimeException();
            Assertions.assertThrows(OutOfRangeRuntimeException.class, actualExecutable);
        }
}
