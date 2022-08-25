package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    private static ReflectionUtils utils = new ReflectionUtils();
    private static Person person = new Person("Anna", 30);

    @Test
    void testGetField() throws NoSuchFieldException {
        String expected = "age";

        Field field=utils.getField(Person.class,"age");
        String actual=field.getName();

        Assertions.assertEquals(expected,actual);}

    @Test
    void testGetFieldException()  {
        Assertions.assertThrows(NoSuchFieldException.class, () -> utils.getField(Person.class, "surname"));
    }

    @Test
    void testGetMethod() throws  NoSuchMethodException {
        String expected = "print";

        Method method=utils.getMethod(Person.class,"print");
        String actual=method.getName();

        Assertions.assertEquals(expected,actual);}

    @Test
    void testGetMethodException()  {
        Assertions.assertThrows(NoSuchMethodException.class,
                () -> utils.getMethod(Person.class,"drive"));
    }

}
