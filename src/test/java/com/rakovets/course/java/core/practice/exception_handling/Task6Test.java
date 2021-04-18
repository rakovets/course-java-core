package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task6Test {

    static Stream<Arguments> provideArgumentsForThrowingException() {
        return Stream.of(
                Arguments.of(0, Task6.MyFirstException.class),
                Arguments.of(15, Task6.MyFirstException.class),
                Arguments.of(32, Task6.MyFirstException.class),
                Arguments.of(33, Task6.MySecondException.class),
                Arguments.of(45, Task6.MySecondException.class),
                Arguments.of(65, Task6.MySecondException.class),
                Arguments.of(66, Task6.MyThirdException.class),
                Arguments.of(80, Task6.MyThirdException.class),
                Arguments.of(100, Task6.MyThirdException.class)
        );
    }

    @ParameterizedTest(name = "Number = {0}, Expected: {1}")
    @MethodSource("provideArgumentsForThrowingException")
    void throwingExceptionTest(int a, Class expected) {
        Executable actualExecutable = () -> Task6.MakingException.throwingException(a);
        Assertions.assertThrows(expected, actualExecutable);
    }
}
