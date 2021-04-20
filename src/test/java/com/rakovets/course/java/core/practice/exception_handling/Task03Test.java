package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.NotFoundGetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task03Test {
    @Test
    void notFoundGetException() {
        Executable actualExecutable = () -> Task03.notFoundGetException();
        Assertions.assertThrows(NotFoundGetException.class, actualExecutable);
    }
}
