package com.rakovets.course.javabasics.practice.reflection.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static com.rakovets.course.javabasics.practice.reflection.reflection.ReflectionUtils.*;

public class ReflectionUtilsDemo {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Field field = getFieldByName(SomethingClass.class, "field1");
        System.out.println(field.getType());

        Method method = getMethoddByName(SomethingClass.class, "getField1");
        System.out.println(method.getDeclaringClass());

        Method[] methods = getMethods(SomethingClass.class);
        System.out.println(Arrays.toString(methods));

        SomethingClass object = new SomethingClass(1, 2, 3);

        Method method2 = getMethoddByName(SomethingClass.class, "sayHello");
        invokeMethod(method2, object);

        setValueInField(field, object, 25);
        System.out.println(object.getField1());
    }
}
