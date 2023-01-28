package com.rakovets.course.java.core.practice.generics.obscure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    @Test
    void emptyTest1() {
        Obscure<?> obscureEmpty = new Obscure<>("");

        Assertions.assertTrue(obscureEmpty.isEmpty());
    }

    @Test
    void emptyTest2() {
        Obscure<?> obscure = new Obscure<>("Obscure");

        Assertions.assertFalse(obscure.isEmpty());
    }

    @Test
    void isPresentTest1() {
        Obscure<?> obscure = new Obscure<>(null);

        Assertions.assertFalse(obscure.isPresent());
    }

    @Test
    void isPresentTest2() {
        Obscure<?> obscure = new Obscure<>("Obscure");

        Assertions.assertTrue(obscure.isPresent());
    }

    @Test
    void orElseTest1() {
        Obscure<?> obscure = new Obscure<>("Obscure");
        Obscure<?> object = new Obscure<>("Object");

        Object result = obscure.orElse(object);
        Object expected = obscure.get();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void orElseTest2() {
        Obscure<?> obscureNotPresent = new Obscure<>(null);
        Obscure<?> object = new Obscure<>("Object");

        Object result = obscureNotPresent.orElse(object);
        Object expected = object.get();

        Assertions.assertEquals(expected, result);
    }
}

