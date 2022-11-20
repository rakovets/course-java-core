package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public Field getFieldByClassFieldName(Class className, String fieldName)
            throws NoSuchFieldException {
        return className.getDeclaredField(fieldName);
    }

    public Method getMethodByClassMethodName(Class className, String methodName)
            throws NoSuchMethodException {
        return className.getDeclaredMethod(methodName);
    }

    public Method[] getArrayAllMethodsByClass(Class className) {
        return className.getDeclaredMethods();
    }

    public void callObjectMethod(Object object, Method method)
            throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        method.invoke(object);
    }

    public <T> void setValueInObjectField(Field field, Object object, T value)
            throws IllegalAccessException {
        field.setAccessible(true);
        field.set(object, value);
    }

    public Method getClassMethod(Class className, String methodName, Class... parameters)
            throws NoSuchMethodException {
        return className.getDeclaredMethod(methodName, parameters);
    }

    public void callObjectMethodWithArguments(Method method, Object object, Object... arguments)
            throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        method.invoke(object, arguments);
    }
}
