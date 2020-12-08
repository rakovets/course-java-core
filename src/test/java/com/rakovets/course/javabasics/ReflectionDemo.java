package com.rakovets.course.javabasics;

import com.rakovets.course.javabasics.reflection.HomeWork;
import com.rakovets.course.javabasics.reflection.RefUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchFieldException {

        Class<HomeWork> demo = HomeWork.class;

        Field result = RefUtil.getClassField(demo, "mark");
        System.out.println(result.getName());

        Method methods = RefUtil.getClassMethods(demo, "getLessonNum");
        System.out.println(methods.getName());
        Method[] arrayOfmethods = RefUtil.getArrayOfMethods(demo);
        System.out.println("-------------------------------");
        for (Method method: arrayOfmethods ) {
            System.out.println(method.getName());
        }


      //  Class<HomeWork> demo1 = HomeWork.class;
        RefUtil.getArrayOfMethodsReflection(methods, demo);

    }


}
