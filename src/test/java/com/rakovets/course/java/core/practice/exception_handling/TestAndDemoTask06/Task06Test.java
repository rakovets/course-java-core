package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask06;

import com.rakovets.course.java.core.practice.exception_handling.Task06;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task06Test {

    @Test

    void throwException() {
        Executable actualExecutable = () -> Task06.throwException(null);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
