package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Student;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;

public class ReflectionUtilsTest {

    private static Student student;
    private static Class<? extends Student> studentClass;

    @BeforeEach
    void init() {
        student = new Student("Yury", "Sudak");
        student.setBirthday(LocalDate.of(1982, 8, 24));
        studentClass = student.getClass();
    }

    @Test
    void getField() throws IllegalAccessException {
        assertEquals("Yury", ReflectionUtils.getField(studentClass, "name").get(student));
        assertEquals("Sudak", ReflectionUtils.getField(student.getClass(), "surname").get(student));
        assertEquals(38, ReflectionUtils.getField(student.getClass(), "age").get(student));
    }

    @Test
    void getMethod() {
        Method method = ReflectionUtils.getMethod(studentClass, "setBirthday", LocalDate.class);
        assertEquals("void", method.getReturnType().toString());
        assertEquals(1, method.getParameterCount());
        method = ReflectionUtils.getMethod(studentClass, "getAge");
        assertEquals("int", method.getReturnType().toString());
        assertEquals(0, method.getParameterCount());
    }

    @Test
    void getAllMethods() {
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("setBirthday(java.time.LocalDate)"));
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("getAge"));
        assertTrue(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)).contains("getName"));
        System.out.println(Arrays.toString(ReflectionUtils.getAllMethods(studentClass)));
    }

    @Test
    void runMethod() {
        Method method = ReflectionUtils.getMethod(studentClass, "getAge");
        assertEquals(38, ReflectionUtils.runMethod(student, method));
        method = ReflectionUtils.getMethod(studentClass, "getName");
        assertEquals("Yury", ReflectionUtils.runMethod(student, method));
        method = ReflectionUtils.getMethod(studentClass, "setName", String.class);
        assertNull(ReflectionUtils.runMethod(student, method, "Yura"));
        method = ReflectionUtils.getMethod(studentClass, "getName");
        assertEquals("Yura", ReflectionUtils.runMethod(student, method));
    }

    @Test
    void setField() {
        Field field = ReflectionUtils.getField(studentClass, "name");
        ReflectionUtils.setField(field, student, "Yuras");
        Method method = ReflectionUtils.getMethod(studentClass, "getName");
        assertEquals("Yuras", ReflectionUtils.runMethod(student, method));

        field = ReflectionUtils.getField(studentClass, "age");
        ReflectionUtils.setField(field, student, 37);
        method = ReflectionUtils.getMethod(studentClass, "getAge");
        assertEquals(37, ReflectionUtils.runMethod(student, method));
    }
}
