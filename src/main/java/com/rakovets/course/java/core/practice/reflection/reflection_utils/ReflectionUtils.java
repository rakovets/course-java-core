package com.rakovets.course.java.core.practice.reflection.reflection_utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    /**
     * The method takes "Class", the name of the field and returns "Field".
     *
     * @param className incoming parameter
     * @param fieldName incoming parameter
     * @return "Field"
     */
    public Field getFieldFromName(Class className, String fieldName) {
        try {
            Field field = className.getDeclaredField(fieldName);
            return field;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * The method takes "Class", the name of the method, and returns "Method".
     *
     * @param clazz      incoming parameter
     * @param methodName incoming parameter
     * @return "Method"
     */
    public Method getMethodFromClassAndMethodName(Class clazz, String methodName) {
        try {
            Method method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * The method takes "Class" and returns an array of all Methods.
     *
     * @param clazz incoming parameter
     * @return array of all Methods
     */
    public Method[] getMethodsArrayFromClass(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        return methods;
    }

    /**
     * The method takes "Method", an object, and calls that method on that object.
     *
     * @param method incoming parameter
     * @param object incoming parameter
     */
    public void getMethodAndObjectRunMethod(Method method, Object object) {
        Method invokeMethod = method;
        try {
            invokeMethod.setAccessible(true);
            invokeMethod.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * The method takes "Field", an object, a value (of the same type as the Field) and sets that value to that field.
     *
     * @param field  incoming parameter
     * @param object incoming parameter
     * @param value  incoming parameter
     */
    public void setValueFromFieldAndClass(Field field, Object object, int value) {
        try {
            field.setAccessible(true);
            field.setInt(object, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * The method takes "Class", method name, Class... varargs for parameters and returns "Method".
     *
     * @param clazz      incoming parameter
     * @param methodName incoming parameter
     * @param clazzes    incoming parameter
     * @return "Method"
     */
    public Method getClassMethodNameAndClassVarargs(Class clazz, String methodName, Class... clazzes) {
        try {
            Method method = clazz.getMethod(methodName, clazzes);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * The method takes "Method", object, Object... varargs as arguments to the method and calls that method on that object.
     *
     * @param method  incoming parameter
     * @param object  incoming parameter
     * @param objects incoming parameter
     */
    public void runMethodBasedOnMethodObjectAndObjectVarargs(Method method, Object object, Object... objects) {
        try {
            method.setAccessible(true);
            method.invoke(object, objects);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
