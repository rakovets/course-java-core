package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CustomArrayListTest<T> {
    static Stream<Arguments> pushBackProviderArguments() {
        return Stream.of(
                Arguments.of(0, 2, 1),
                Arguments.of(1, "Hello", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("pushBackProviderArguments")
    void pushBack(int capacity, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushBack(value);

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    @Test
    void pushBackThrow() {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(1);

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
        CustomArrayList<T> customArrayList = new CustomArrayList<>(1);

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
        CustomArrayList<T> customArrayList = new CustomArrayList<>(1);

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.insert(null, 0));
    }

    static Stream<Arguments> removeAtThrowProviderArguments() {
        return Stream.of(
                Arguments.of(2, 2, 3),
                Arguments.of(2, "Hello", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAtThrowProviderArguments")
    void removeAtThrow(int capacity, T value, int index) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushFront(value);
        customArrayList.pushFront(value);
        customArrayList.pushFront(value);

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
                Arguments.of(5, 1, 4),
                Arguments.of(1, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("removeProviderArguments")
    void remove(int capacity, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushFront(value);
        customArrayList.pushFront(value);
        customArrayList.remove(value);

        Assertions.assertEquals(expected, capacity - customArrayList.getSize());
    }

    static Stream<Arguments> removeAllThrowProviderArguments() {
        return Stream.of(
                Arguments.of(1, null),
                Arguments.of(1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAllThrowProviderArguments")
    void removeAllThrow(int capacity, T value) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        Assertions.assertThrows(NullPointerException.class, () -> customArrayList.removeAll(value));
    }

    static Stream<Arguments> removeAllProviderArguments() {
        return Stream.of(
                Arguments.of(2, "Hello", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("removeAllProviderArguments")
    void removeAll(int capacity, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushFront(value);
        System.out.println(customArrayList);
        customArrayList.pushFront(value);
        System.out.println(customArrayList);
        customArrayList.pushFront(value);
        System.out.println(customArrayList);
        customArrayList.removeAll(value);

        Assertions.assertEquals(expected, capacity - customArrayList.getSize());
    }

    static Stream<Arguments> popBackProviderArguments() {
        return Stream.of(
                Arguments.of(3, "Hello", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("popBackProviderArguments")
    void popBack(int capacity, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushFront(value);
        customArrayList.pushFront(value);
        customArrayList.popBack();

        Assertions.assertEquals(expected, customArrayList.getSize());
    }

    static Stream<Arguments> clearProviderArguments() {
        return Stream.of(
                Arguments.of(4, "Hello", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("clearProviderArguments")
    void clear(int capacity, T value, int expected) {
        CustomArrayList<T> customArrayList = new CustomArrayList<>(capacity);

        customArrayList.pushBack(value);
        customArrayList.pushBack(value);
        customArrayList.pushBack(value);
        customArrayList.pushBack(value);
        customArrayList.pushBack(value);
        customArrayList.clear();

        Assertions.assertEquals(expected, customArrayList.getSize());
    }
}
