package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionUtilsTest {
    private static final ReflectionUtils UTILS = new ReflectionUtils();
    private static Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Anna", 30);
    }

    @Test
    void testGetFieldPublic() throws NoSuchFieldException {
        String expected = "age";

        Field field = UTILS.getField(Person.class, "age");
        String actual = field.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetFieldPrivate() throws NoSuchFieldException {
        String expected = "name";

        Field field = UTILS.getField(Person.class, "name");
        String actual = field.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetFieldException() {
        Assertions.assertThrows(NoSuchFieldException.class, () -> UTILS.getField(Person.class, "surname"));
    }

    @Test
    void testGetMethodPublic() throws NoSuchMethodException {
        String expected = "getAge";

        Method method = UTILS.getMethod(Person.class, "getAge");
        String actual = method.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetMethodPrivate() throws NoSuchMethodException {
        String expected = "addOneYear";

        Method method = UTILS.getMethod(Person.class, "addOneYear");
        String actual = method.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetMethodException() {
        Assertions.assertThrows(NoSuchMethodException.class,
                () -> UTILS.getMethod(Person.class, "drive"));
    }

    @Test
    void testGetMethodArray() {
        List<String> expected = List.of("addOneYear", "addTwoYears", "getAge", "getName", "set", "set");

        Method[] methodArray = UTILS.getMethodArray(Person.class);
        List<String> list = new ArrayList<>();
        Arrays.stream(methodArray).forEach(e -> list.add(e.getName()));
        List<String> actual = list.stream().sorted().collect(Collectors.toList());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testInvokeMethodPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int expected = 31;

        UTILS.invokeMethod(UTILS.getMethod(Person.class, "addOneYear"), person);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testInvokeMethodPublic() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int expected = 32;

        UTILS.invokeMethod(UTILS.getMethod(Person.class, "addTwoYears"), person);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testInvokeMethodNoSuchMethodException() {
        Assertions.assertThrows(NoSuchMethodException.class,
                () -> UTILS.invokeMethod(UTILS.getMethod(Person.class, "add"), person));
    }

    @Test
    void testSetValueOfFieldPrivate() throws NoSuchFieldException, IllegalAccessException {
        String expected = "Liza";

        UTILS.setValueOfField(UTILS.getField(Person.class, "name"), person, "Liza");
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetValueOfFieldPublic() throws NoSuchFieldException, IllegalAccessException {
        int expected = 32;

        UTILS.setValueOfField(UTILS.getField(Person.class, "age"), person, 32);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetValueOfFieldException() {
        Assertions.assertThrows(NoSuchFieldException.class,
                () -> UTILS.setValueOfField(UTILS.getField(Person.class, "surname"), person, 32));
    }

    @Test
    void testGetMethodWithParameters() throws NoSuchMethodException {
        Class<String> expected = String.class;
        int lengthExpected = 1;

        Method method = UTILS.getMethodWithParameters(Person.class, "set", String.class);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int actualLength = parameterTypes.length;
        Class<?> actual = parameterTypes[0];

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(lengthExpected, actualLength);
    }

    @Test
    void testCallMethodsPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String expected = "Liza";

        UTILS.callMethods
                ((UTILS.getMethodWithParameters(Person.class, "set", String.class)),
                        person, "Liza");
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCallMethodsPublic() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int expected = 20;

        UTILS.callMethods
                ((UTILS.getMethodWithParameters(Person.class, "set", int.class)),
                        person, 20);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }
}
