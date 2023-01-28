package com.rakovets.course.java.core.practice.generics.obscure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    Obscure<?> obscure;
    Obscure<?> result;

    @Test
    void emptyTest1() {
        obscure = new Obscure<>("");

        Assertions.assertTrue(obscure.isEmpty());
    }

    @Test
    void emptyTest2() {
        obscure = new Obscure<>("Obscure");

        Assertions.assertFalse(obscure.isEmpty());
    }

    @Test
    void isPresentTest1() {
        obscure = new Obscure<>(null);

        Assertions.assertFalse(obscure.isPresent());
    }

    @Test
    void isPresentTest2() {
        obscure = new Obscure<>("Obscure");

        Assertions.assertTrue(obscure.isPresent());
    }

    @Test
    void orElseTest1() {
        obscure = new Obscure<>("Obscure");
        Obscure object = new Obscure<>("Name");

        result = (Obscure<?>) obscure.orElse(object);
        Obscure<?> expected = obscure;

        Assertions.assertEquals(expected, result);
    }
}
