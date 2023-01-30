package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    Obscure<String> obscureNull = new Obscure<>(null);
    Obscure<Integer> obscureInteger = new Obscure<>(20);
    Obscure<Boolean> obscureBoolean = new Obscure<>(true);

    @Test
    void getObjectTest() {
        Obscure actual = obscureInteger.get();
        Assertions.assertEquals(actual, obscureInteger);
    }

    @Test
    public void isPresentNotNullTest() {
        boolean actual = obscureInteger.isPresent();
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void isPresentNullTest() {
        boolean actual = obscureNull.isPresent();
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void emptyTest() {
        Obscure expected = new Obscure<>(null);
        Obscure actual = Obscure.empty("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyNotNullTest() {
        boolean actual = obscureInteger.isEmpty();
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void isEmptyNullTest() {
        boolean actual = obscureNull.isEmpty();
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void orElseNullTest() {
        String actual = obscureNull.orElse("12");
        Assertions.assertEquals("12", actual);
    }

    @Test
    public void orElseNotNullTest() {
        int actual = obscureInteger.orElse(20);
        Assertions.assertEquals(20,actual);
    }

    @Test
    public void orElseThrowNullTest() throws Exception {
        Assertions.assertThrows(Exception.class, ()-> obscureNull.orElseThrow(new Exception()));
    }

    @Test
    public void orElseThrowNotNullTest() throws Exception {
        int actual = obscureInteger.orElseThrow(new Exception());
        Assertions.assertEquals(20, actual);
    }

    @Test
    public void ofTest() {
        Obscure expected = new Obscure<>("");
        Obscure actual = Obscure.of("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ofNull() {
        Obscure expected = new Obscure<>(null);
        Obscure actual = Obscure.of(null);
        Assertions.assertEquals(expected, actual);
    }
}
