package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatTest {
    @Test
    void cat() {
        Assertions.assertEquals("Lily", new Cat("Lily").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("mew", new Cat("Lily").mew());
    }

    @Test
    void pur() {
        Assertions.assertEquals("pur", new Cat("Lily").pur());
    }

    @Test
    void getName() {
        Cat Lily = new Cat("Lily");
        Assertions.assertEquals("Lily", Lily.getName());
    }

    @Test
    void setName() {
        Cat Lily = new Cat("Lily");
        Lily.setName("Lily2");
        Assertions.assertEquals("Lily2", Lily.getName());
    }
}

