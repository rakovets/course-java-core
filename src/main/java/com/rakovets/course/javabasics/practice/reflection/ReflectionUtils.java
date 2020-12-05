package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static Field getField(Class<? extends Student> studentClass, String fieldName) {
        try {
            Field field = studentClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Method getMethod(Class<? extends Student> studentClass, String methodName, Class<?> ...param) {
        try {
            Method method = studentClass.getDeclaredMethod(methodName, param);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Method[] getMethods(Class<? extends Student> studentClass) {
        return studentClass.getMethods();
    }
}
