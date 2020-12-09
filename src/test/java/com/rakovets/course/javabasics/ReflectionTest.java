package com.rakovets.course.javabasics;

import com.rakovets.course.javabasics.reflection.HomeWork;
import com.rakovets.course.javabasics.reflection.ReflectionUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionTest {
    private Class<HomeWork> workClass = HomeWork.class;


    @Test
    void getClassFieldTest() throws NoSuchFieldException {
        String expectedResult = "mark";
        String expectedResult1 = "lessonNumber";
        String actualResult = ReflectionUtil.getClassField(this.workClass, expectedResult).getName();
        String actualResult1 = ReflectionUtil.getClassField(this.workClass, expectedResult1).getName();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    void getClassMethodsTest() throws NoSuchMethodException {
        String expectedResult = "getLessonName";
        String expectedResult1 = "getMark";
        String expectedResult2 = "getLessonNumber";
        String actualResult = ReflectionUtil.getClassMethods(this.workClass, expectedResult).getName();
        String actualResult1 = ReflectionUtil.getClassMethods(this.workClass, expectedResult1).getName();
        String actualResult2 = ReflectionUtil.getClassMethods(this.workClass, expectedResult2).getName();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void getArrayOfMethodsTest() {
        Method[] expectedResult = workClass.getDeclaredMethods();
        Method[] actualResult = ReflectionUtil.getArrayOfMethods(this.workClass);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void getArrayOfMethodsReflectionTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HomeWork testObject = new HomeWork(3, "Lesson String");
        Method method = workClass.getDeclaredMethod("getLessonName");
        Method method1 = workClass.getDeclaredMethod("getLessonNumber");
        assertEquals("Lesson String", ReflectionUtil.getValueFromMethodsReflection(method, testObject));
        assertEquals(3, ReflectionUtil.getValueFromMethodsReflection(method1, testObject));
    }

    @Test
    void setValueFromInputTest() throws NoSuchFieldException, IllegalAccessException {
        int expectedMark = 10;
        String expectedLessonName = "Reflection";
        int expectedLessonNumber = 18;
        HomeWork testObject = new HomeWork();
        ReflectionUtil.setValueFromInput(workClass.getDeclaredField("mark"), testObject, expectedMark);
        ReflectionUtil.setValueFromInput(workClass.getDeclaredField("lessonName"), testObject, expectedLessonName);
        ReflectionUtil.setValueFromInput(workClass.getDeclaredField("lessonNumber"), testObject, expectedLessonNumber);
        assertEquals(expectedLessonName,testObject.getLessonName());
        assertEquals(expectedMark,testObject.getMark());
        assertEquals(expectedLessonNumber,testObject.getLessonNumber());
    }
}
