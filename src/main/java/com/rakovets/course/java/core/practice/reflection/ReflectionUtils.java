package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public Field getField(Class clazz, String fieldName) throws NoSuchFieldException {
        Class<?> cls = clazz.getClass();
        return cls.getField(fieldName);
    }
    public Method getMethod(Class<User> clazz, String nameMethod) throws NoSuchMethodException {
        Class<?> cls = clazz.getClass();
        return cls.getMethod(nameMethod);
    }
    public Method[] getArrayMethods(Class<User> clazz) {
        Class<?> cls = clazz.getClass();
        return cls.getMethods();
    }
}
