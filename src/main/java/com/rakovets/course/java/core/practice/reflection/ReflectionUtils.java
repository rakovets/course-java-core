package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public Field getFieldFromClassAndFieldName(Class cls, String fieldName) throws NullPointerException, SecurityException {
        Field field = null;
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            if (f.getName() == fieldName) {
                field = f;
                break;
            }
        }
        return field;
    }

    public Method getMethodFromClassAndMethodName(Class cls, String methodName) throws NullPointerException, SecurityException {
        Method method = null;
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            if (m.getName() == methodName) {
                method = m;
                break;
            }
        }
        return method;
    }

    public Method[] getArrayOfMethodsByClass(Class cls) throws SecurityException {
        return cls.getMethods();
    }

    public String executeMethodByMethodAndObject(Method method, Object object) throws InvocationTargetException, ExceptionInInitializerError, NullPointerException, IllegalAccessException, IllegalArgumentException {
        Class<?>[] paramTypes = method.getParameterTypes();
        Class cls = method.getReturnType();
        String s = null;
        if (paramTypes.length == 0 && cls != null && cls == String.class) {
            s = (String) method.invoke(object, null);
        }
        return s;
    }

    public void setIntFieldByFieldObjectAndValue(Field field, Object object, int newValue) throws IllegalAccessException {
        if (field.getType() == int.class) {
            field.setAccessible(true);
            field.setInt(object, newValue);
        }
    }

    public void setFieldByFieldObjectAndValue(Field field, Object object, String newValue) throws IllegalAccessException {
        if (field.getType() == String.class) {
            field.setAccessible(true);
            field.set(object, newValue);
        }
    }

    public Method getMethodByClassMethodNameAndParametersTypes(Class<?> cls, String methodName, Class<?>[] paramTypes) throws NoSuchMethodException, NullPointerException, SecurityException {
        Method method = null;
        if (paramTypes == null) {
            method = this.getMethodFromClassAndMethodName(cls, methodName);
        } else {
            method = cls.getMethod(methodName, paramTypes);
        }
        return method;
    }

    public void executeMethodByMethodObjectAndArguments(Method method, Object object, Object[] args) throws InvocationTargetException, ExceptionInInitializerError, NullPointerException, IllegalAccessException, IllegalArgumentException {
        method.invoke(object, args);
    }
}
