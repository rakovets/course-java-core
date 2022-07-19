package com.rakovets.course.java.core.practice.generics;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CustomArrayListTest<T> {
    static Stream<Arguments> pushBackProviderArguments() {
        return Stream.of(
                Arguments.of(0, new Integer[]{1, 2, 3}, 3),
                Arguments.of(1, new String[]{"one", "two"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("pushBackProviderArguments")
    void pushBack(int capacity, T[] array, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        for (T value : array) {
            customArrayList.pushBack(value);
        }

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    @Test
    void pushBackThrow() {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.pushBack(null));
    }

    static Stream<Arguments> popFrontProviderArguments() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(5, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("popFrontProviderArguments")
    void popFront(int capacity, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.popFront();

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    static Stream<Arguments> pushFrontProviderArguments() {
        return Stream.of(
                Arguments.of(0, 2, 1),
                Arguments.of(3, "Hello", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("pushFrontProviderArguments")
    void pushFront(int capacity, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushFront(value);

        Assertions.assertEquals(expected, customArrayList.getSize() + capacity);
    }

    @Test
    void pushFrontThrow() {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.pushFront(null));
    }

    static Stream<Arguments> insertProviderArguments() {
        return Stream.of(
                Arguments.of(2, 2, 1, 2),
                Arguments.of(2, "Hello", 0, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("insertProviderArguments")
    void insert(int capacity, T value, int index, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.insert(value, index);

        Assertions.assertEquals(expected, customArrayList.getSize() + capacity);
    }

    static Stream<Arguments> insertThrowProviderArguments() {
        return Stream.of(
                Arguments.of(2, 3),
                Arguments.of("Hello", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("insertThrowProviderArguments")
    void insertThrow(T value, int index) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(2);

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> customArrayList.insert(value, index));
    }

    @Test
    void insertNpe() {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.insert(null, 0));
    }

    static Stream<Arguments> removeAtThrowProviderArguments() {
        return Stream.of(
                Arguments.of(3, new Integer[]{1, 2, 3}, 4),
                Arguments.of(5, new Double[]{1.0, 2.0, 3.0, 1.0, 2.0, 3.0}, -4),
                Arguments.of(2, new String[]{"one", "two"}, 3),
                Arguments.of(10, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAtThrowProviderArguments")
    void removeAtThrow(int capacity, T[] array, int index) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        for (T value : array) {
            customArrayList.pushFront(value);
        }

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> customArrayList.removeAt(index));
    }

    static Stream<Arguments> removeAtProviderArguments() {
        return Stream.of(
                Arguments.of(5, 1, 4),
                Arguments.of(1, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAtProviderArguments")
    void removeAt(int capacity, int index, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.removeAt(index);

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    static Stream<Arguments> removeThrowProviderArguments() {
        return Stream.of(
                Arguments.of(1, null),
                Arguments.of(1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("removeThrowProviderArguments")
    void remove(int capacity, T value) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.remove(value));
    }

    static Stream<Arguments> removeProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 2}, 2, 2),
                Arguments.of(new String[]{"one", "two", "two", "two"}, "two", 3),
                Arguments.of(new Integer[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("removeProviderArguments")
    public void remove(T[] array, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        for (T arrayValue : array) {
            customArrayList.pushBack(arrayValue);
        }
        customArrayList.remove(value);

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    @Test
    void removeAllThrow() {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.removeAll(null));
    }

    static Stream<Arguments> removeAllProviderArguments() {
        return Stream.of(
                Arguments.of(2, new Integer[]{1, 2, 2}, 2, 1),
                Arguments.of(3, new String[]{"one", "two", "two", "two"}, "two", 2),
                Arguments.of(11, new Integer[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAllProviderArguments")
    public void removeAll(int capacity, T[] array, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        for (T arrayValue : array) {
            customArrayList.pushBack(arrayValue);
        }
        customArrayList.removeAll(value);

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    static Stream<Arguments> popBackProviderArguments() {
        return Stream.of(
                Arguments.of(9, new Integer[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 10),
                Arguments.of(0, new Short[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 10),
                Arguments.of(2, new String[]{"Java", "Hey"}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("popBackProviderArguments")
    void popBack(int capacity, T[] array, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        for (T arrayValue : array) {
            customArrayList.pushBack(arrayValue);
        }
        customArrayList.popBack();

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    static Stream<Arguments> clearProviderArguments() {
        return Stream.of(
                Arguments.of(9, new Integer[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 0),
                Arguments.of(0, new Short[]{1, 8, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 0),
                Arguments.of(2, new String[]{"Java", "Hey"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("clearProviderArguments")
    void clear(int capacity, T[] array, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        for (T arrayValue : array) {
            customArrayList.pushBack(arrayValue);
        }
        customArrayList.clear();

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    static Stream<Arguments> isEmptyProviderArguments() {
        return Stream.of(
                Arguments.of(true, new Integer[]{}),
                Arguments.of(false, new String[]{"one", "two", "two", "two"}),
                Arguments.of(true, new Integer[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyProviderArguments")
    public void isEmpty(boolean expectedSize, T[] array) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(10);

        for (T value : array) {
            customArrayList.pushBack(value);
        }

        Assertions.assertEquals(expectedSize, customArrayList.isEmpty());
    }

    static Stream<Arguments> indexOfProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{3, 2, 1}, 2, 1),
                Arguments.of(new String[]{"Java", "two", "two", "two"}, "two", 1),
                Arguments.of(new String[]{"Java", "Hey", "Hey", "Loki"}, "Tor", -1),
                Arguments.of(new Integer[]{1, 0, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("indexOfProviderArguments")
    public void indexOf(T[] array, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        for (T arrayValue : array) {
            customArrayList.pushBack(arrayValue);
        }

        Assertions.assertEquals(expected, customArrayList.indexOf(value));
    }

    static Stream<Arguments> lastIndexOfProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 2, 8, 9}, 2, 2),
                Arguments.of(new String[]{"Java", "two", "two", "two"}, "two", 3),
                Arguments.of(new String[]{"Java", "Hey", "Hey", "Loki"}, "Hey", 2),
                Arguments.of(new String[]{"Java", "Hey", "Hey", "Loki"}, "Tor", -1),
                Arguments.of(new Integer[]{1, 0, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("lastIndexOfProviderArguments")
    public void lastIndexOf(T[] array, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(10);

        for (T arrayValue : array) {
            customArrayList.pushBack(arrayValue);
        }

        Assertions.assertEquals(expected, customArrayList.lastIndexOf(value));
    }

    static Stream<Arguments> getElementAtProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 8, 9}, 8, 3),
                Arguments.of(new String[]{"Java", "two", "two!", "two"}, "two", 3),
                Arguments.of(new String[]{"Java", "Hey", "Hey", "Loki"}, "Hey", 2),
                Arguments.of(new String[]{"Java", "Hey", "Hey", "Loki"}, "Loki", 3),
                Arguments.of(new Integer[]{1, 0, 3, 8, 5, 8, 7, 8, 9, 10, 11}, 8, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getElementAtProviderArguments")
    public void getElementAt(T[] array, T expected, int index) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>();

        for (T value : array) {
            customArrayList.pushBack(value);
        }

        Assertions.assertEquals(expected, customArrayList.getElementAt(index));
    }

    static Stream<Arguments> getElementAtThrowProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 8, 9}, 7)
        );
    }

    @SuppressFBWarnings("RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT")
    @ParameterizedTest
    @MethodSource("getElementAtThrowProviderArguments")
    public void getElementAtThrow(T[] array, int index) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(4);

        for (T value : array) {
            customArrayList.pushBack(value);
        }

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> customArrayList.getElementAt(index));
    }
}
