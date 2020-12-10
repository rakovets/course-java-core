package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUtilTest {
    private static Class tClass;
    Student student;
    @BeforeEach
    void init() {
        student = new Student("Ivan", "Ivan");
        tClass = Student.class;
    }

    @Test
    void getFieldTest() {
        Assertions.assertEquals("java.lang.String", ReflectionUtil.getField(tClass, "nickname").getType().getName());
    }
    @Test
    void getMethodTest() {
        Assertions.assertEquals("double", ReflectionUtil.getMethod(tClass, "getFee").getReturnType().getName());
    }
    @Test
    void getMethodArrayTest() {
        Method[] methods = ReflectionUtil.getMethodArray(tClass);
        for (Method method : methods) {
            System.out.println(method.getName());
            }
    }
    @Test
    void getInvokedMethodTest() {
        Method method = ReflectionUtil.getMethod(tClass, "getFee");
        student.setFee(100);
        double fee = (double) ReflectionUtil.getInvokedMethod(method, student);
        Assertions.assertEquals(100, fee);
    }
    @Test
    void setFieldTest() {
        Field field = ReflectionUtil.getField(tClass, "fee");
        ReflectionUtil.setField(field, student, 200);
        Assertions.assertEquals(200, student.getFee());
    }
}
