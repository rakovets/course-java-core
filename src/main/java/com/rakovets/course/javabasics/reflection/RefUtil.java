package com.rakovets.course.javabasics.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RefUtil {


    public static Field getClassField (Class clas, String name) throws NoSuchFieldException {
            Field result = clas.getDeclaredField(name);

        return result;

    }

    public static Method getClassMethods (Class clas, String name) throws NoSuchFieldException {
        Method result = null;
        try {
            result = clas.getDeclaredMethod(name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return result;

    }

    public static Method[] getArrayOfMethods (Class clazz)  {
        Method[] result = clazz.getDeclaredMethods();
        return result;

    }

    public static void getArrayOfMethodsReflection (Method method, Class clazz)  {
        clazz.getMethods();

    }


}
