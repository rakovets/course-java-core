package com.rakovets.course.java.core.practice.reflection.reflection_utils;

import static org.junit.jupiter.api.Assertions.*;

import com.rakovets.course.java.core.practice.reflection.reflection_utils.model.Group;
import com.rakovets.course.java.core.practice.reflection.reflection_utils.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import java.lang.reflect.Field;

public class ReflectionUtilsTest {
    private static Student student;
    private static Class<? extends Student> studentClass;

    @BeforeEach
    void init() {
        student = new Student("Oxana", "Peregud");
        student.setFee(100.0);
        student.setNickname("Oksana");
        studentClass = student.getClass();
    }

    @Test
    void getField() throws IllegalAccessException {
        assertEquals(100.0, ReflectionUtils.getField(studentClass, "fee").get(student));
        assertEquals("Oksana", ReflectionUtils.getField(studentClass, "nickname").get(student));
    }

    @Test
    void getMethod() {
        Method method = ReflectionUtils.getMethod(studentClass, "getFee");
        assertEquals("double", method.getReturnType().toString());
    }

    @Test
    void getAllMethods() {
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("getGroup"));
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("getFee"));
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("getNickname"));
        assertFalse(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("getFirstName"));
    }

    @Test
    void getInvokedMethod() {
        Method method = ReflectionUtils.getMethod(studentClass, "getNickname");
        assertEquals("Oksana", ReflectionUtils.getInvokedMethod(method, student));
    }

    @Test
    void setField() {
        Field field = ReflectionUtils.getField(studentClass, "fee");
        ReflectionUtils.setField(field, student, 150.0);
        Method method = ReflectionUtils.getMethod(studentClass, "getFee");
        assertEquals(150.0, ReflectionUtils.getInvokedMethod(method, student));
    }

    @Test
    void getMethodParam() {
        Method method = ReflectionUtils.getMethodParam(studentClass, "setGroup", Group.class);
        assertEquals("void", method.getReturnType().toString());
        assertEquals(1, method.getParameterCount());
    }

    @Test
    void getMethodObject() {
        Method method = ReflectionUtils.getMethodParam(studentClass, "setNickname", String.class);
        assertNull(ReflectionUtils.getMethodObject(method, student, "Oxana Peregud"));
        method = ReflectionUtils.getMethod(studentClass, "getNickname");
        assertEquals("Oxana Peregud", ReflectionUtils.getInvokedMethod(method, student));
    }
}
