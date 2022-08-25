package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {
    private static ReflectionUtils utils = new ReflectionUtils();
    private static Person person = new Person("Anna", 30);

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Field name = utils.getField(Person.class, "name");
        Field age = utils.getField(Person.class, "age");

        Method print = utils.getMethod(Person.class, "print");

        Method[] methodArray = utils.getMethodArray(Person.class);

        utils.invokeMethod(print, person);

        utils.setValue(age, person, 31);
        utils.setValue(name, person, "Natasha");
        person.print();

        Method method=utils.getMethodWithParameters(Person.class, "set", String.class);

        utils.callMethods(method, person,"12345");
    }
}
