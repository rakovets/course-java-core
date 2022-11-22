package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public Field getRequestedClassField(Class<?> clazzName, String fieldName) throws UserInputException {
        try {
            return clazzName.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new UserInputException("There is no such class");
        }
    }

    public Method getMethodByClass(Class<?> clazzName, String methodName) {
        try {
            Method method = clazzName.getDeclaredMethod(methodName);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            throw new UserInputException("There is no such class");
        }
    }

    public Method[] getMethodsArray(Class<?> clazzName) {
        return clazzName.getDeclaredMethods();
    }

    public void getMethodOnThisObject(Method method, Object object) {
        try {
            method.setAccessible(true);
            method.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new UserInputException("There is no such method");
        }
    }

    public void setValueByFieldAndClass(Field field, Object object, int value) {
        try {
            field.setAccessible(true);
            field.setInt(object, value);
        } catch (IllegalAccessException e) {
            throw new UserInputException("There is no such field");
        }
    }

    public Method getMethod(Class<?> clazzName, String methodName, Class... classes) {
        try {
            Method method = clazzName.getMethod(methodName, classes);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            throw new UserInputException("There is no such class");
        }
    }

    public void invokeMethodByObject(Method method, Object object, Object... objects) {
        try {
            method.setAccessible(true);
            method.invoke(object, objects);
        } catch (IllegalAccessException | InvocationTargetException ex) {
            throw new UserInputException("There is no such class");
        }
    }
}

