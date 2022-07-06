package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    Obscure<Integer> full = new Obscure<>(5);
    Obscure<Integer> defaultInteger = new Obscure<>(null);

    @Test
    public void testGet() {
        Assertions.assertEquals(full, full.get());
    }

    @Test
    public void testIsPresentNotNull() {
        Assertions.assertTrue(full.isPresent());
    }

    @Test
    public void testIsPresentNull() {
        Assertions.assertFalse(defaultInteger.isPresent());
    }

    @Test
    public void testIsEmptyNotNull() {
        Assertions.assertFalse(full.isEmpty());
    }

    @Test
    public void testIsEmptyNull() {
        Assertions.assertTrue(defaultInteger.isEmpty());
    }

    @Test
    public void testOrElseNull() {
        Assertions.assertEquals(5555, defaultInteger.orElse(5555));
    }

    @Test
    public void testOrElseNotNull() {
        Assertions.assertEquals(5, full.orElse(10));
    }

    @Test
    public void testOrElseThrowNull() throws Exception {
        Assertions.assertThrows(Exception.class, () -> defaultInteger.orElseThrow(new Exception()));
    }

    @Test
    public void testOrElseThrowNotNull() throws Exception {
        Assertions.assertEquals(5, full.orElseThrow(new Exception()));
    }

    @Test
    public void testOf() {
        Assertions.assertEquals(new Obscure<>(""), Obscure.of(""));
    }

    @Test
    public void testOfNull() {
        Assertions.assertEquals(new Obscure<>(null), Obscure.of(null));
    }

    @Test
    public void testEmpty() {
        Assertions.assertEquals(new Obscure<>(null), Obscure.empty());
    }
}
