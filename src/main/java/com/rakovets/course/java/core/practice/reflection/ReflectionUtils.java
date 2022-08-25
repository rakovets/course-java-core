package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public <T> Field getField(Class<T> c, String fieldName) throws NoSuchFieldException {
        return c.getDeclaredField(fieldName);
    }

    public <T> Method getMethod(Class<T> c, String methodName) throws NoSuchMethodException {
        return c.getDeclaredMethod(methodName);
    }

    public <T> Method[] getMethodArray(Class<T> c) {
        return c.getDeclaredMethods();
    }

    public Object invokeMethod(Method method, Object object) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(object);
    }

    public <T> void setValue(Field field, Object object, T value) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(object, value);
    }

    public Method getMethodWithParameters(Class c, String methodName, Class... params)
            throws NoSuchMethodException {
        return c.getDeclaredMethod(methodName, params);
    }

    public void callMethods(Method m, Object obj, Object... args)
            throws InvocationTargetException, IllegalAccessException {
        m.invoke(obj, args);
    }
}
