package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionTest {
    private static final ReflectionUtils utils = new ReflectionUtils();
    private static Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Anna", 30);
    }

    @Test
    void testGetFieldPublic() throws NoSuchFieldException {
        String expected = "age";

        Field field = utils.getField(Person.class, "age");
        String actual = field.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetFieldPrivate() throws NoSuchFieldException {
        String expected = "name";

        Field field = utils.getField(Person.class, "name");
        String actual = field.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetFieldException() {
        Assertions.assertThrows(NoSuchFieldException.class, () -> utils.getField(Person.class, "surname"));
    }

    @Test
    void testGetMethodPublic() throws NoSuchMethodException {
        String expected = "getAge";

        Method method = utils.getMethod(Person.class, "getAge");
        String actual = method.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetMethodPrivate() throws NoSuchMethodException {
        String expected = "addOneYear";

        Method method = utils.getMethod(Person.class, "addOneYear");
        String actual = method.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetMethodException() {
        Assertions.assertThrows(NoSuchMethodException.class,
                () -> utils.getMethod(Person.class, "drive"));
    }

//    @Test
//    void testGetMethodArray() {
//        String [] expected ={"addOneYear","set","set","getAge","getName"};
//
//        Method [] methodArray=utils.getMethodArray(Person.class);
//        String [] actual=Arrays.stream(methodArray).map(e->e.getName()).toArray();
//
//        Assertions.assertArrayEquals(expected, actual);
//
//    }

    @Test
    void testInvokeMethodPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int expected = 31;

        utils.invokeMethod(utils.getMethod(Person.class, "addOneYear"), person);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testInvokeMethodNoSuchMethodException() {
        Assertions.assertThrows(NoSuchMethodException.class,
                () -> utils.invokeMethod(utils.getMethod(Person.class, "add"), person));
    }

    @Test
    void testSetValueOfFieldPrivate() throws NoSuchFieldException, IllegalAccessException {
        String expected = "Liza";

        utils.setValueOfField(utils.getField(Person.class, "name"), person, "Liza");
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetValueOfFieldPublic() throws NoSuchFieldException, IllegalAccessException {
        int expected = 32;

        utils.setValueOfField(utils.getField(Person.class, "age"), person, 32);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetValueOfFieldException() {
        Assertions.assertThrows(NoSuchFieldException.class,
                () -> utils.setValueOfField(utils.getField(Person.class, "surname"), person, 32));
    }

    @Test
    void testGetMethodWithParameters() throws NoSuchMethodException {
        Class<String> expected = String.class;
        int lengthExpected = 1;

        Method method = utils.getMethodWithParameters(Person.class, "set", String.class);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int actualLength = parameterTypes.length;
        Class<?> actual = parameterTypes[0];

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(lengthExpected, actualLength);
    }

    @Test
    void testCallMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String expected = "Liza";

        utils.callMethods
                ((utils.getMethodWithParameters(Person.class, "set", String.class)),
                        person, "Liza");
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }
}
