package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class PairTest<K, V, U> {
    private Pair<K, V> pair;
    private Pair<V, K> swapPair;

    @ParameterizedTest
    @MethodSource("initObject")
    public void constructorTest(K kValue, V vValue) {
        pair = new Pair<>(kValue, vValue);
        K kVariableValue = (K) getValueFromPrivateField(pair, "kVariable");
        V vVariableValue = (V) getValueFromPrivateField(pair, "vVariable");

        Assertions.assertEquals(kValue, kVariableValue);
        Assertions.assertEquals(vValue, vVariableValue);
    }

    @ParameterizedTest
    @MethodSource("initObject")
    public void getSwappedTest(K kValue, V vValue) {
        pair = new Pair<>(kValue, vValue);

        swapPair = pair.getSwapped();

        Assertions.assertEquals(pair.getkVariable(), swapPair.getvVariable());
        Assertions.assertEquals(pair.getvVariable(), swapPair.getkVariable());
    }

    @ParameterizedTest
    @MethodSource("initObject")
    public void swapTest(K kValue, V vValue) {
        pair = new Pair<>(kValue, vValue);

        swapPair = Pair.swap(pair);

        Assertions.assertEquals(pair.getkVariable(), swapPair.getvVariable());
        Assertions.assertEquals(pair.getvVariable(), swapPair.getkVariable());
    }

    private static Stream<Arguments> initObject() {
        return Stream.of(
                Arguments.of(5, "5"),
                Arguments.of(5.0, 5),
                Arguments.of("5", 5.0)
        );
    }

    private U getValueFromPrivateField(Object object, String variableName) {
        U fieldValue = null;
        try {
            Field privateClassField = Pair.class.getDeclaredField(variableName);
            privateClassField.setAccessible(true);
            fieldValue = (U) privateClassField.get(object);
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
