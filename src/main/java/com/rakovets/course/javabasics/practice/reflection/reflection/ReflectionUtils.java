package com.rakovets.course.javabasics.practice.reflection.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static Field getFieldByName(Class cl, String fieldName) throws NoSuchFieldException {
        return cl.getDeclaredField(fieldName);
    }

    public static Method getMethoddByName(Class cl, String methodName) throws NoSuchMethodException {
        return cl.getDeclaredMethod(methodName, null);
    }

    public static Method[] getMethods(Class cl) {
        return cl.getDeclaredMethods();
    }

    public static void invokeMethod(Method method, SomethingClass object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        method = object.getClass().getMethod(method.getName(), null);
        method.invoke(object, null);

    }

    public static void setValueInField(Field field, SomethingClass object, int value) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(object, value);
    }
}
