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
        Assertions.assertEquals(null, ObscureIntegerNull.getItem());
        Assertions.assertEquals("John", obscureString.getItem());
        Assertions.assertEquals(null, obscureStringNull.getItem());
    }

    @Test
    public void testIsPresent() {
        Assertions.assertEquals(true, obscureInteger.isPresent());
        Assertions.assertEquals(false, ObscureIntegerNull.isPresent());
        Assertions.assertEquals(true, obscureString.isPresent());
        Assertions.assertEquals(false, obscureStringNull.isPresent());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertEquals(false, obscureInteger.isEmpty());
        Assertions.assertEquals(true, ObscureIntegerNull.isEmpty());
        Assertions.assertEquals(false, obscureString.isEmpty());
        Assertions.assertEquals(true, obscureStringNull.isEmpty());
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
        Assertions.assertEquals(null, Obscure.of(null).getItem());
        Assertions.assertEquals("Bob", Obscure.of("Bob").getItem());
        Assertions.assertEquals(null, Obscure.of(null).getItem());
    }

    @Test
    public void testEmpty() {
        Assertions.assertEquals(null, Obscure.empty().getItem());
        Assertions.assertEquals(null, Obscure.empty().getItem());
        Assertions.assertEquals(null, Obscure.empty().getItem());
        Assertions.assertEquals(null, Obscure.empty().getItem());
    }
}
