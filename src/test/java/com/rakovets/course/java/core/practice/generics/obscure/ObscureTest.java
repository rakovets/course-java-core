package com.rakovets.course.java.core.practice.generics.obscure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObscureTest {
    @Test
    void emptyTest() {
        Obscure<?> obscure;

        obscure = Obscure.empty();

        Assertions.assertTrue(obscure.isEmpty());
    }
}
