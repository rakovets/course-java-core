package com.rakovets.course.java.core.practice.generics.obscure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    Obscure<String> obscureNull = new Obscure<>(null);
    Obscure<Integer> obscureInteger = new Obscure<>(35);
    Obscure<Boolean> obscureBoolean = new Obscure<>(true);

    @Test
    void testGetObject() {
        Obscure expected = obscureInteger;

        Obscure actual = obscureInteger.get();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsPresentNotNull() {
        boolean expected = true;

        boolean actual = obscureInteger.isPresent();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsPresentNull() {
        boolean expected = false;

        boolean actual = obscureNull.isPresent();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsEmptyNotNull() {
        boolean expected = false;

        boolean actual = obscureInteger.isEmpty();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsEmptyNull() {
        boolean expected = true;

        boolean actual = obscureNull.isEmpty();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testOrElseNull() {
        String expected = "333";

        String actual = obscureNull.orElse("333");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOrElseNotNull() {
        int expected = 15;

        int actual = obscureInteger.orElse(15);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOrElseThrowNull() throws Exception {
        Assertions.assertThrows(Exception.class, () -> obscureNull.orElseThrow(new Exception()));
    }

    @Test
    public void testOrElseThrowNotNull() throws Exception {
        int expected = 15;

        int actual = obscureInteger.orElseThrow(new Exception());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOf() {
        Obscure expected = new Obscure<>("");

        Obscure actual = Obscure.of("");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOfNull() {
        Obscure expected = new Obscure<>(null);

        Obscure actual = Obscure.of(null);

        Assertions.assertEquals(expected, actual);
    }
}
