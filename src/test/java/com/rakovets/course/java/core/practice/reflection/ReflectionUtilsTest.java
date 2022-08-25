package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class eflectionUtilsTest {

    @Test
    public <T> Field getField(Class<T> c, String nameField) throws NoSuchFieldException {
        return c.getDeclaredField(nameField);
}}
