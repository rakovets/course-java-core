package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class TestReflectionUtils {
    final Logger logger = Logger.getLogger(TestReflectionUtils.class.getName());
    ReflectionUtils rf = new ReflectionUtils();
    Person person = new Person("Victor", "Polonnikov", "man", 43);

    @Test
    public void testGetFieldFromClassAndFieldName() {
        Field field = null;
        try {
            field = rf.getFieldFromClassAndFieldName(Person.class, "age");
            logger.info(field.toString());
        } catch (NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }

        String actual = field.getName();
        String expected = "age";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMethodFromClassAndMethodName() {
        Method method = null;
        try {
            method = rf.getMethodFromClassAndMethodName(Person.class, "getFullName");
            logger.info(method.toString());
        } catch (NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }
        String actual = method.getName();
        String expected = "getFullName";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetArrayOfMethodsByClass() {
        Method[] methods = null;
        try {
            methods = rf.getArrayOfMethodsByClass(Person.class);
            for (Method m : methods) {
                logger.info(m.getName());
            }
        } catch (SecurityException e) {
            logger.warning(e.getMessage());
        }

        int numberOfMethodsInClassActual = methods.length;
        int numberOfMethodsInClassExpected = 19;

        Assertions.assertEquals(numberOfMethodsInClassExpected, numberOfMethodsInClassActual);
    }

    @Test
    public void testExecuteMethodByMethodAndObject() {
        String actual = null;
        try {
            actual = rf.executeMethodByMethodAndObject(rf.getMethodFromClassAndMethodName(Person.class, "toString"), person);
        } catch (InvocationTargetException | ExceptionInInitializerError | NullPointerException | IllegalAccessException | IllegalArgumentException  e) {
            logger.warning(e.getMessage());
        }
        String expected = "Victor Polonnikov, возраст 43 лет, man.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetIntFieldByFieldObjectAndValue() {
        Person personThisTest = new Person("Victor", "Polonnikov", "man", 43);

        try {
            rf.setIntFieldByFieldObjectAndValue(rf.getFieldFromClassAndFieldName(Person.class, "age"), personThisTest, 60);
        } catch (IllegalAccessException e) {
            logger.warning(e.getMessage());
        }
        int actual = personThisTest.getAge();
        int expected = 60;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMethodByClassMethodNameAndParametersTypes() {
        Method method = null;
        try {
            method = rf.getMethodByClassMethodNameAndParametersTypes(person.getClass(), "setData", new Class[] {String.class, String.class, String.class, int.class});
        } catch (NoSuchMethodException | NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }

        String actual = method.getName();
        String expected = "setData";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testExecuteMethodByMethodObjectAndArguments() {
        Person personThisTest = new Person("Victor", "Polonnikov", "man", 43);

        try {
            rf.executeMethodByMethodObjectAndArguments(rf.getMethodByClassMethodNameAndParametersTypes(personThisTest.getClass(), "setData", new Class[] {String.class, String.class, String.class, int.class}), personThisTest, new Object[] {new String("Olga"), new String("Ivanova"), new String("woman"), (int) 25});
        } catch (InvocationTargetException | ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | SecurityException e) {
            logger.warning(e.getMessage());
        }
        String actual = personThisTest.toString();
        String expected = "Olga Ivanova, возраст 25 лет, woman.";

        Assertions.assertEquals(expected, actual);
    }
}
