package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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

    public static Method[] getAllMethods(Class<? extends Student> studentClass) {
        return studentClass.getDeclaredMethods();
    }

    public static Object runMethod(Student student, Method method, Object ...param) {
        try {
            return method.invoke(student, param);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return "Error!";
    }

    public static void setField(Field field, Student student, Object value) {
        String obj = value.getClass().getSimpleName();
        try {
            if (obj.equals("Integer")) field.setInt(student, (Integer) value);
            else field.set(student, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
