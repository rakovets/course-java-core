package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static com.rakovets.course.javabasics.practice.reflection.model.Gender.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReflectionUtilsTest {
    private static Human human;
    private static Class<? extends Human> clazz;

    @BeforeEach
    void init() {
        human = new Human("Karl", 10, MALE);
        clazz = human.getClass();
    }

    @Test
    void getFieldOfClassTest() throws NoSuchFieldException, IllegalAccessException {
        assertEquals("Karl", ReflectionUtils.getFieldOfClass(clazz, "name").get(human));
    }

    @Test
    void getMethodOfClassTest() throws NoSuchMethodException {
        assertEquals("class java.lang.String", ReflectionUtils.getMethodOfClass(clazz, "isAdult", Integer.class).getReturnType().toString());
    }

    @Test
    void getMethodsOfClassTest() {
        assertTrue(Arrays.toString(ReflectionUtils.getMethodsOfClass(clazz)).contains("isAdult(java.lang.Integer)"));
    }

    @Test
    void callMethodOnObjectTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        assertEquals("no", ReflectionUtils.callMethodOnObject( ReflectionUtils.getMethodOfClass(clazz,"isAdult", Integer.class), human));
    }

    @Test
    void setNewValueTes() throws NoSuchFieldException, IllegalAccessException {
        ReflectionUtils.setNewValue(ReflectionUtils.getFieldOfClass(clazz, "name"), human, "Molly");
        assertEquals("Molly", ReflectionUtils.getFieldOfClass(clazz, "name").get(human));
    }
}
