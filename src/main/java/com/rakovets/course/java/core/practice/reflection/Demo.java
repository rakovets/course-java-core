package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        final Logger logger = Logger.getLogger(Demo.class.getName());
        ReflectionUtils rf = new ReflectionUtils();
        Person person = new Person("Victor", "Polonnikov", "man", 43);

        Field field = null;
        try {
            field = rf.getFieldFromClassAndFieldName(Person.class, "age");
            logger.info(field.toString());
        } catch (NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }

        Method method;
        try {
            method = rf.getMethodFromClassAndMethodName(Person.class, "getFullName");
            logger.info(method.toString());
        } catch (NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }

        Method[] methods;
        try {
            methods = rf.getArrayOfMethodsByClass(Person.class);
            for (Method m : methods) {
                logger.info(m.getName());
            }
        } catch (SecurityException e) {
            logger.warning(e.getMessage());
        }

        try {
            logger.info(rf.executeMethodByMethodAndObject(rf.getMethodFromClassAndMethodName(Person.class, "toString"), person));
        } catch (InvocationTargetException | ExceptionInInitializerError | NullPointerException | IllegalAccessException | IllegalArgumentException  e) {
            logger.warning(e.getMessage());
        }

        try {
            rf.setIntFieldByFieldObjectAndValue(rf.getFieldFromClassAndFieldName(Person.class, "age"), person, 60);
        } catch (IllegalAccessException e) {
            logger.warning(e.getMessage());
        }
        logger.info(String.valueOf(person.getAge()));

        try {
            logger.info(rf.getMethodByClassMethodNameAndParametersTypes(person.getClass(), "setData", new Class[] {String.class, String.class, String.class, int.class}).getName());
        } catch (NoSuchMethodException | NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }

        try {
            rf.executeMethodByMethodObjectAndArguments(rf.getMethodByClassMethodNameAndParametersTypes(person.getClass(), "setData", new Class[] {String.class, String.class, String.class, int.class}), person, new Object[] {new String("Olga"), new String("Ivanova"), new String("woman"), (int) 25});
        } catch (InvocationTargetException | ExceptionInInitializerError | NullPointerException | IllegalAccessException | IllegalArgumentException e) {
            logger.warning(e.getMessage());
        }
        logger.info(person.toString());
    }
}
