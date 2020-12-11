package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.example.reflection.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReflectionUtilsTest {

    private static User user;
    private static Class<? extends User> userClass;

    @BeforeEach
    void init() {
        user = new User("Ira", "Yarsh");
        userClass = user.getClass();

    }

    @Test
    void getFieldTest() throws IllegalAccessException {
        assertEquals("Ira", ReflectionUtils.getField(userClass, "firstname").get(user));
        assertEquals("Yarsh", ReflectionUtils.getField(user.getClass(),
                "lastname").get(user));
    }

    @Test
    void getMethodTest()  {
        assertEquals("int", ReflectionUtils.getMethod(userClass, "getAge").getReturnType().toString());
    }

    @Test
    void getAllMethodsArrayTest() {
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethodsArray(userClass)).contains("getAge"));
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethodsArray(userClass)).contains("getFirstname"));
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethodsArray(userClass)).contains("getLastname"));
    }

    @Test
    void getMethodOfObjectTest() {
        user.setAge(23);
        int age = (int) ReflectionUtils.getMethodOfObject(ReflectionUtils.getMethod(userClass, "getAge"), user);
        assertEquals(23, age);
    }

    @Test
    void setFieldObjectTest() {
        ReflectionUtils.setFieldObject(ReflectionUtils.getField(userClass, "age"), user, 123);
        assertEquals(123, user.getAge());
    }
}
