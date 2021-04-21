package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class CustomArrayListTest<T> {
    static Stream<Arguments> pushBackTestProviderArguments() {
        return Stream.of(
                Arguments.of(1,1)
        );
    }

    @ParameterizedTest
    @MethodSource("pushBackTestProviderArguments")
    public void pushBack(int expectedSize, int size) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.pushBack(1);
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }



}
