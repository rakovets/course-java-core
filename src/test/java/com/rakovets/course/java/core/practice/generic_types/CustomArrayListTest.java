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
//

    static Stream<Arguments> insertTestProviderArguments() {
        return Stream.of(
                Arguments.of(4, new Integer[]{1, 2, 3}, 10),
                Arguments.of(7, new Double[]{1.0, 2.0, 3.0, 1.0, 2.0, 3.0}, 10.0),
                Arguments.of(3, new String[]{"one", "two"}, "three"),
                Arguments.of(12, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("insertTestProviderArguments")
    public void insertTest(int expectedSize, T[] array, T insertValue) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushFront(value);
        }
        customArrayList.insert(insertValue, 1);
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }
    //

    static Stream<Arguments> removeAtTestProviderArguments() {
        return Stream.of(
                Arguments.of(2, new Integer[]{1, 2, 3}, 2),
                Arguments.of(5, new Double[]{1.0, 2.0, 3.0, 1.0, 2.0, 3.0}, 3),
                Arguments.of(1, new String[]{"one", "two"}, 0),
                Arguments.of(10, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAtTestProviderArguments")
    public void removeAtTest(int expectedSize, T[] array, int index) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushFront(value);
        }
        customArrayList.removeAt(index);
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }

    //////////////
    static Stream<Arguments> removeTestProviderArguments() {
        return Stream.of(
                Arguments.of(2, new Integer[]{1, 2, 2}, 2),
                Arguments.of(3, new String[]{"one", "two", "two", "two"}, "two"),
                Arguments.of(10, new Integer[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("removeTestProviderArguments")
    public void removeTest(int expectedSize, T[] array, T valueToRemove) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushBack(value);
        }

        customArrayList.remove(valueToRemove);


        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }
///////////////
static Stream<Arguments> removeAllTestProviderArguments() {
    return Stream.of(
            Arguments.of(1, new Integer[]{1, 2, 2},2),
            Arguments.of(1, new String[]{"one", "two", "two", "two"}, "two"),
            Arguments.of(7, new Integer[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8)
    );
}

    @ParameterizedTest
    @MethodSource("removeAllTestProviderArguments")
    public void removeAllTest(int expectedSize, T[] array, T valueToRemove) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushBack(value);
        }
        customArrayList.removeAll(valueToRemove);
        Assertions.assertEquals(expectedSize, customArrayList.getSize());
    }
    //////////////////
    static Stream<Arguments> isEmptyTestProviderArguments() {
        return Stream.of(
                Arguments.of(true, new Integer[]{}),
                Arguments.of(false, new String[]{"one", "two", "two", "two"}),
                Arguments.of(true, new Integer[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyTestProviderArguments")
    public void isEmptyTest(boolean expectedSize, T[] array) {
        CustomArrayList<T> customArrayList = new CustomArrayList(10);
        for (T value : array) {
            customArrayList.pushBack(value);
        }
        Assertions.assertEquals(expectedSize, customArrayList.isEmpty());
    }

}
