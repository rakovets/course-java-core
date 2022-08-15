package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public <T> Field getField(Class<T> c, String nameField) throws NoSuchFieldException {
        return c.getDeclaredField(nameField);
    }

    public <T> Method getMethod(Class<T> c, String nameMethod) throws NoSuchMethodException {
        return c.getDeclaredMethod(nameMethod);
    }

    public <T> Method[] getMethodArray(Class<T> c) {
        return c.getDeclaredMethods();
    }

    public Object invokeMethod(Method method, Object object) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(object);
    }

    public void setValue(Field field1, Object object, Field field2) throws NoSuchFieldException, IllegalAccessException {
        field1.setAccessible(true);
        Field field = object.getClass().getDeclaredField(String.valueOf(field1));
        field.set(field1, field2);


    }

}
