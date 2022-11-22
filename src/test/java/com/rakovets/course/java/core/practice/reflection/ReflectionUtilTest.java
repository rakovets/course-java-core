package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionUtilTest {
    private static final ReflectionUtil util = new ReflectionUtil();
    private static final Person person = new Person("Sveta", 29);


    @Test
    public void testFieldOfClassPublic() throws NoSuchFieldException {
        String expected = "age";

        Field field = util.getFieldOfClass(Person.class, "age");
        String actual = field.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFieldOfClassPrivate() throws NoSuchFieldException {
        String expected = "name";

        Field field = util.getFieldOfClass(Person.class, "name");
        String actual = field.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodOfClassPublic() throws NoSuchMethodException {
        String expected = "getAge";

        Method method = util.getMethodOfClass(Person.class, "getAge");
        String actual = method.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodOfClassPrivate() throws NoSuchMethodException {
        String expected = "getName";

        Method method = util.getMethodOfClass(Person.class, "getName");
        String actual = method.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMethodArray() {
        List<String> expected = List.of("getAge", "getName", "setAge");

        Method[] methodArray = util.getMethodArray(Person.class);
        List<String> list = new ArrayList<>();
        Arrays.stream(methodArray).forEach(e -> list.add(e.getName()));
        List<String> actual = list.stream().sorted().collect(Collectors.toList());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetValueOfFieldPrivate() throws NoSuchFieldException, IllegalAccessException {
        String expected = "Sveta";

        util.setValueOfField(util.getFieldOfClass(Person.class, "name"), person, "Sveta");
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetValueOfFieldPublic() throws NoSuchFieldException, IllegalAccessException {
        int expected = 29;

        util.setValueOfField(util.getFieldOfClass(Person.class, "age"), person, 29);
        int actual = person.getAge();

        Assertions.assertEquals(expected, actual);
    }
}
