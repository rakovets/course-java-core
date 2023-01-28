package com.rakovets.course.java.core.practice.generics.obscure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    @Test
    void isEmptyTest1() {
        Obscure<String> obscureEmpty = new Obscure<>("");

        Assertions.assertTrue(obscureEmpty.isEmpty());
    }

    @Test
    void isEmptyTest2() {
        Obscure<String> obscure = new Obscure<>("Obscure");

        Assertions.assertFalse(obscure.isEmpty());
    }

    @Test
    void isPresentTest1() {
        Obscure<String> obscure = new Obscure<>(null);

        Assertions.assertFalse(obscure.isPresent());
    }

    @Test
    void isPresentTest2() {
        Obscure<String> obscure = new Obscure<>("Obscure");

        Assertions.assertTrue(obscure.isPresent());
    }

    @Test
    void orElseTest1() {
        Obscure<Object> obscureNotPresent = new Obscure<>(null);
        Double object = 2.0;

        Object result = obscureNotPresent.orElse(object);
        Double expected = 2.0;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void orElseTest2() {
        Obscure<Double> obscure = new Obscure<>(3.0);
        Double object = 2.0;

        Object result = obscure.orElse(object);
        Double expected = 3.0;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void orElseThrowTest1() throws Exception {
        Obscure<String> obscure = new Obscure<>("Obscure");
        Exception exception = new NullPointerException();

        Object result = obscure.orElseThrow(exception);
        String expected = "Obscure";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void orElseThrowTest2() {
        Obscure<Object> obscure = new Obscure<>(null);
        Exception exception = new NullPointerException();

        Assertions.assertThrows(NullPointerException.class, () -> obscure.orElseThrow(exception));
    }

    @Test
    void ofTest() {
        Object result = Obscure.of(2.0);
        Object expected = new Obscure<>(2.0).get();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void emptyTest() {
        Obscure<Object> obscure = Obscure.empty();

        Object result = obscure.get();
        Object expected = new Obscure<>("").get();

        Assertions.assertEquals(expected, result);
    }
}

