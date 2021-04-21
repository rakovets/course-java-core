package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class CustomArrayListTest<T> {
    static Stream<Arguments> pushBackTestProviderArguments() {
        return Stream.of(
                Arguments.of(3, new Integer[]{1, 2, 3}),
                Arguments.of(6, new Double[]{1.0, 2.0, 3.0, 1.0, 2.0, 3.0}),
                Arguments.of(2, new String[]{"one", "two"}),
                Arguments.of(11, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})
        );
    }

    @ParameterizedTest
    @MethodSource("pushBackTestProviderArguments")
    public void pushBackTest(int expectedSize, T[] array) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushBack(value);
        }
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }


    //
    static Stream<Arguments> pushFrontTestProviderArguments() {
        return Stream.of(
                Arguments.of(3, new Integer[]{1, 2, 3}),
                Arguments.of(6, new Double[]{1.0, 2.0, 3.0, 1.0, 2.0, 3.0}),
                Arguments.of(2, new String[]{"one", "two"}),
                Arguments.of(11, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})
        );
    }

    @ParameterizedTest
    @MethodSource("pushFrontTestProviderArguments")
    public void pushFrontTest(int expectedSize, T[] array) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushFront(value);
        }
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }


    //
    static Stream<Arguments> popFrontTestProviderArguments() {
        return Stream.of(
                Arguments.of(2, new Integer[]{1, 2, 3}),
                Arguments.of(5, new Integer[]{1, 2, 3, 1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("popFrontTestProviderArguments")
    public void popFrontTest(int expectedSize, T[] array) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushBack(value);
        }
        customArrayList.popFront();
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }

    //
    static Stream<Arguments> popBackFrontTestProviderArguments() {
        return Stream.of(
                Arguments.of(2, new Integer[]{1, 2, 3}),
                Arguments.of(5, new Integer[]{1, 2, 3, 1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("popFrontTestProviderArguments")
    public void popBackTest(int expectedSize, T[] array) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushBack(value);
        }
        customArrayList.popBack();
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }

}
