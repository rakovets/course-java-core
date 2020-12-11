package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.practice.reflection.model.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtilTest {

    @Test
    void testGetField() {
        Field expected = null;
        try {
            expected = MyClass.class.getDeclaredField("str");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Field actual = ReflectionUtil.getField(MyClass.class, "str");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetMethod() {
        Method expected = null;
        try {
            expected = MyClass.class.getDeclaredMethod("printStr");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Method actual = ReflectionUtil.getMethod(MyClass.class, "printStr");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetArrayOfMethods() {
        Method[] expected = MyClass.class.getDeclaredMethods();

        Method[] actual = ReflectionUtil.getArrayOfMethods(MyClass.class);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testGetInvokedMethod() throws NoSuchMethodException {
        MyClass obj = new MyClass("mrrrmrmr", 7);
        String expected = "mrrrmrmr";

        Method method = MyClass.class.getMethod("getStr");
        Object actual = ReflectionUtil.getInvokedMethod(method, obj);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValueToFieldTest() {
        MyClass obj = new MyClass("qwerty", 1);
        int expected = 77;
        try {
            ReflectionUtil.setValueToField(MyClass.class.getDeclaredField("number"), obj, expected);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Object actual = obj.getNumber();

        Assertions.assertEquals(expected, actual);
    }
}
