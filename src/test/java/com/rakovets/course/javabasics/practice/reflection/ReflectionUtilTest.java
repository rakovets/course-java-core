package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class ReflectionUtilTest {
    private static Class tClass;
    Student student;
    Field field;
    @BeforeEach
    void init() {
        student = new Student("Ivan", "Ivan");
        tClass = student.getClass();
    }

    @Test
    void getFieldTest() {
        System.out.println(ReflectionUtil.getField(tClass, "nickname"));
    }
}
