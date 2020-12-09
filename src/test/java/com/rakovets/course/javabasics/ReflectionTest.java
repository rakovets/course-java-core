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
        String expectedResult1 = "lessonNumber";
        String actualResult = RefUtil.getClassField(this.workClass, expectedResult).getName();
        String actualResult1 = RefUtil.getClassField(this.workClass, expectedResult1).getName();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    void getClassMethodsTest() throws NoSuchMethodException {
        String expectedResult = "getLessonName";
        String expectedResult1 = "getMark";
        String expectedResult2 = "getLessonNumber";
        String actualResult = RefUtil.getClassMethods(this.workClass, expectedResult).getName();
        String actualResult1 = RefUtil.getClassMethods(this.workClass, expectedResult1).getName();
        String actualResult2 = RefUtil.getClassMethods(this.workClass, expectedResult2).getName();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void getArrayOfMethodsTest() {
        Method[] expectedResult = workClass.getDeclaredMethods();
        Method[] actualResult = RefUtil.getArrayOfMethods(this.workClass);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void getArrayOfMethodsReflectionTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HomeWork testObject = new HomeWork(3, "Lesson String");
        Method method = workClass.getDeclaredMethod("getLessonName");
        Method method1 = workClass.getDeclaredMethod("getLessonNumber");
        assertEquals("Lesson String", RefUtil.getValueFromMethodsReflection(method, testObject));
        assertEquals(3, RefUtil.getValueFromMethodsReflection(method1, testObject));
    }

    @Test
    void setValueFromInputTest() throws NoSuchFieldException, IllegalAccessException {
        int expectedMark = 10;
        String expectedLessonName = "Reflection";
        int expectedLessonNumber = 18;
        HomeWork testObject = new HomeWork();
        RefUtil.setValueFromInput(workClass.getDeclaredField("mark"), testObject, expectedMark);
        RefUtil.setValueFromInput(workClass.getDeclaredField("lessonName"), testObject, expectedLessonName);
        RefUtil.setValueFromInput(workClass.getDeclaredField("lessonNumber"), testObject, expectedLessonNumber);
        assertEquals(expectedLessonName,testObject.getLessonName());
        assertEquals(expectedMark,testObject.getMark());
        assertEquals(expectedLessonNumber,testObject.getLessonNumber());
    }
}
