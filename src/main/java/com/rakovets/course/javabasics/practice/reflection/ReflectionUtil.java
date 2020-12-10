package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public static Field getField(Class<?> tClass, String fieldName) {
        Field field = null;
        try {
            field = tClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        } return field;
    }
    public static Method getMethod(Class<?> tClass, String methodName) {
        Method method = null;
        try {
            method = tClass.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException | SecurityException | NullPointerException e) {
            e.printStackTrace();
        }
        return method;
    }
    public static Method[] getMethodArray(Class<?> tClass) {
        return tClass.getDeclaredMethods();
    }
    public static Object getInvokedMethod(Method method, Student student) {
        Object obj = null;
        try {
           obj = method.invoke(student);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        } return obj;
    }
    public static void setField(Field field, Student student, Object newFee) {
        try {
            field.setAccessible(true);
            field.set(student, newFee);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


}
