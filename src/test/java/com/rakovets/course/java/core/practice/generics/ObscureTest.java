package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class ObscureTest<T> {
    private Obscure<T> obscure;
    private T defaultObject;

    @ParameterizedTest
    @MethodSource("initObject")
    public void constructorTest(T initValue) {
        obscure = new Obscure<>(initValue);
        T constructorValue = getValueFromPrivateField(obscure);

        Assertions.assertEquals(initValue, constructorValue);
    }

    @ParameterizedTest
    @MethodSource("initObject")
    public void getObjectTest(T initValue) {
        obscure = new Obscure<>(initValue);

        Assertions.assertEquals(initValue, obscure.getObject());
    }

    @ParameterizedTest
    @MethodSource("initObject")
    public void isPresentTest(T initValue) {
        obscure = new Obscure<>(initValue);

        Assertions.assertTrue(obscure.isPresent());
    }

    @ParameterizedTest
    @NullSource
    public void isPresentNegativeTest(T initValue) {
        obscure = new Obscure<>(initValue);

        Assertions.assertFalse(obscure.isPresent());
    }

    @ParameterizedTest
    @NullSource
    public void isEmptyTest(T initValue) {
        obscure = new Obscure<>(initValue);

        Assertions.assertTrue(obscure.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("initObject")
    public void isEmptyNegativeTest(T initValue) {
        obscure = new Obscure<>(initValue);

        Assertions.assertFalse(obscure.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("orElseTest")
    public void orElseTest(T expectedResult, T initObject, T initDefaultObject) {
        obscure = new Obscure<>(initObject);
        defaultObject = initDefaultObject;

        Assertions.assertEquals(expectedResult, obscure.orElse(defaultObject));
    }

    @ParameterizedTest
    @NullSource
    public void orElseNegativeTest(T initValue) {
        obscure = new Obscure<>(initValue);
        defaultObject = initValue;

        Assertions.assertNotEquals(obscure, obscure.orElse(defaultObject));
    }

    @ParameterizedTest
    @MethodSource("initObject")
    @NullSource
    public void orElseThrowTest(T initValue) {
        obscure = new Obscure<>(initValue);
        Exception exception = new RuntimeException();

        try {
            Assertions.assertEquals(initValue, obscure.orElseThrow(exception));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ParameterizedTest
    @MethodSource("initObject")
    @NullSource
    public void ofTest(T initValue) {
        defaultObject = initValue;
        obscure = new Obscure<>(defaultObject);

        Assertions.assertNotEquals(obscure, Obscure.of(defaultObject));
    }

    @ParameterizedTest
    @NullSource
    public void emptyTest(T initValue) {
        obscure = new Obscure<>(initValue);

        Assertions.assertEquals(obscure, Obscure.empty());
    }

    private static Stream<Arguments> initObject() {
        return Stream.of(
                Arguments.of(5),
                Arguments.of(5.0),
                Arguments.of("5")
        );
    }

    private static Stream<Arguments> orElseTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(5.0, 5.0, 10.0),
                Arguments.of("5", "5", "10"),
                Arguments.of(5, 5, null),
                Arguments.of(5.0, 5.0, null),
                Arguments.of("5", "5", null),
                Arguments.of(10, null, 10),
                Arguments.of(10.0, null, 10.0),
                Arguments.of("10", null, "10")
        );
    }

    private T getValueFromPrivateField(Object object) {
        T fieldValue = null;
        try {
            Field privateClassField = Obscure.class.getDeclaredField("object");
            privateClassField.setAccessible(true);
            fieldValue = (T) privateClassField.get(object);
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
