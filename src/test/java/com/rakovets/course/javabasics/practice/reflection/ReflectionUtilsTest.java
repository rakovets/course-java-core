package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Student;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class ReflectionUtilsTest {

    private static Student student;
    private static Class<? extends Student> studentClass;

    @BeforeAll
    static void init() {
        student = new Student("Yury", "Sudak");
        student.setBirthday(LocalDate.of(1982, 8, 24));
        studentClass = student.getClass();
    }

    @Test
    void task1() throws IllegalAccessException {
        assertEquals("Yury", ReflectionUtils.getField(studentClass, "name").get(student));
        assertEquals("Sudak", ReflectionUtils.getField(student.getClass(), "surname").get(student));
    }

    @Test
    void task2() {
        assertEquals("void", ReflectionUtils.getMethod(studentClass, "setBirthday", LocalDate.class).getReturnType().toString());
        assertEquals(1, ReflectionUtils.getMethod(studentClass, "setBirthday", LocalDate.class).getParameterCount());
        assertEquals("int", ReflectionUtils.getMethod(studentClass, "getAge").getReturnType().toString());
        assertEquals(0, ReflectionUtils.getMethod(studentClass, "getAge").getParameterCount());
    }

    @Test
    void task3() {
        assertTrue(Arrays.toString(ReflectionUtils.getMethods(studentClass)).contains("setBirthday(java.time.LocalDate)"));
        assertTrue(Arrays.toString(ReflectionUtils.getMethods(studentClass)).contains("getAge"));
        System.out.println(Arrays.toString(ReflectionUtils.getMethods(studentClass)));
    }
}
