package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ReflectionTest {
    private static ReflectionUtils utils;
    private static Person person;
    private static Class personClass;

    @BeforeEach
    void init() {
        person = new Person("Anna","Bouch",23);
        personClass = person.getClass();
    }

    @Test
    void getClassFieldTest() throws IllegalAccessException {
        Assertions.assertEquals("Anna", utils.getClassField(personClass,"firstname").get(person));
        Assertions.assertEquals(23, utils.getClassField(personClass,"age").get(person));
    }

    @Test
    void getClassMethodTest()  {
        Assertions.assertEquals("getLastname", utils.getClassMethod(personClass,"getLastname").getName());
    }

    @Test
    void getClassMethodsTest()  {
        Method[] methods = utils.getClassMethods(personClass);
        Assertions.assertEquals(6, methods.length);
    }

    @Test
    void applyClassMethodTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(23, utils.applyClassMethod(person.getClass().getMethod("getAge"), person));
    }

    @Test
    void setValueTest() throws NoSuchFieldException, IllegalAccessException {
        utils.setValue(person.getClass().getDeclaredField("age"),person,12 );
        Assertions.assertEquals(12, utils.getClassField(personClass,"age").get(person));
    }

}
