package com.rakovets.course.java.core.practice.generics;

import com.rakovets.course.java.core.practice.generics.project_obscure.Obscure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTests {
    Obscure<Integer>obscureInteger = new Obscure<>(5);
    Obscure<Integer>ObscureIntegerNull = new Obscure<>(null);
    Obscure<String>obscureString = new Obscure<>("John");
    Obscure<String>obscureStringNull = new Obscure<>(null);

    @Test
    public void testGetItem() {
        Assertions.assertEquals(5, obscureInteger.getItem());
        Assertions.assertNull(ObscureIntegerNull.getItem());
        Assertions.assertEquals("John", obscureString.getItem());
        Assertions.assertNull(obscureStringNull.getItem());
    }

    @Test
    public void testIsPresent() {
        Assertions.assertTrue(obscureInteger.isPresent());
        Assertions.assertFalse(ObscureIntegerNull.isPresent());
        Assertions.assertTrue(obscureString.isPresent());
        Assertions.assertFalse(obscureStringNull.isPresent());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertFalse(obscureInteger.isEmpty());
        Assertions.assertTrue(ObscureIntegerNull.isEmpty());
        Assertions.assertFalse(obscureString.isEmpty());
        Assertions.assertTrue(obscureStringNull.isEmpty());
    }

    @Test
    public void testOrElse() {
        Assertions.assertEquals(5, obscureInteger.orElse(3));
        Assertions.assertEquals(3, ObscureIntegerNull.orElse(3));
        Assertions.assertEquals("John", obscureString.orElse("Bob"));
        Assertions.assertEquals("Bob", obscureStringNull.orElse("Bob"));
    }

    @Test
    public void testOf() {
        Assertions.assertEquals(3, Obscure.of(3).getItem());
        Assertions.assertNull(Obscure.of(null).getItem());
        Assertions.assertEquals("Bob", Obscure.of("Bob").getItem());
        Assertions.assertNull(Obscure.of(null).getItem());
    }

    @Test
    public void testEmpty() {
        Assertions.assertNull(Obscure.empty().getItem());
    }
}
