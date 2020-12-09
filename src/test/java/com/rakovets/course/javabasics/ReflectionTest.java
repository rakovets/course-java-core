package com.rakovets.course.javabasics;

import com.rakovets.course.javabasics.reflection.HomeWork;
import com.rakovets.course.javabasics.reflection.RefUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionTest {
    private Class<HomeWork> workClass = HomeWork.class;


    @Test
    void getClassFieldTest() throws NoSuchFieldException {
        String expectedResult = "mark";
        String expectedResult1 = "lessonNum";
        String actualResult = RefUtil.getClassField(this.workClass, expectedResult).getName();
        String actualResult1 = RefUtil.getClassField(this.workClass, expectedResult1).getName();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    void getClassMethodsTest() throws NoSuchMethodException {
        String expectedResult = "getLessonName";
        String expectedResult1 = "getMark";
        String expectedResult2 = "getLessonNum";
        String actualResult = RefUtil.getClassMethods(this.workClass, expectedResult).getName();
        String actualResult1 = RefUtil.getClassMethods(this.workClass, expectedResult1).getName();
        String actualResult2 = RefUtil.getClassMethods(this.workClass, expectedResult2).getName();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void getArrayOfMethodsTest() throws NoSuchMethodException {
        Method[] expectedResult = workClass.getDeclaredMethods();
        Method[] actualResult = RefUtil.getArrayOfMethods(this.workClass);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void getArrayOfMethodsReflectionTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HomeWork testObject = new HomeWork(3, "Lesson String");
        Method method = workClass.getDeclaredMethod("getLessonName");
        Method method1 = workClass.getDeclaredMethod("getLessonNum");
        assertEquals("Lesson String", RefUtil.getValueFromMethodsReflection(method, testObject));
        assertEquals(3, RefUtil.getValueFromMethodsReflection(method1, testObject));
    }
}
