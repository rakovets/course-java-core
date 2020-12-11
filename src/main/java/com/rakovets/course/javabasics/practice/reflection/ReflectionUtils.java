package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.Human;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getFieldOfClass(Class<?> clazz, String fieldOfClass) throws NoSuchFieldException {
        Field field = clazz.getDeclaredField(fieldOfClass);
        field.setAccessible(true);
        return field;
    }

    public static Method getMethodOfClass(Class<?> clazz, String methodOfClass, Class<?> ...params) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(methodOfClass, params);
    }

    public static Method[] getMethodsOfClass(Class<?> clazz) {
        return  clazz.getDeclaredMethods();
    }

    public static Object callMethodOnObject(Method method, Human human) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(human);
    }

    public static void setNewValue(Field field, Human human, Object value) throws IllegalAccessException {
        field.set(human, value);
    }


}
