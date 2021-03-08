package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionsUtilsTest {


    ModelClass testModel = new ModelClass("TestName", 20, 'W');

    @Test
    void getField() {
        try {
            Assertions.assertEquals("name", ReflectionsUtils.getField(testModel.getClass(), "name").getName());
        } catch (CustomException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    void getMethod() {
        try {
            Assertions.assertEquals("getName", ReflectionsUtils.getMethod(testModel.getClass(), "getName").getName());
        } catch (CustomException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    void getAllMethods() {
        Assertions.assertTrue(Arrays.toString(ReflectionsUtils.getAllMethods(testModel.getClass())).contains("getName"));
        Assertions.assertTrue(Arrays.toString(ReflectionsUtils.getAllMethods(testModel.getClass())).contains("setName"));
    }

    @Test
    void invokeMethod() {
        try {
            Method invokedMethod = ReflectionsUtils.getMethod(testModel.getClass(), "incrementAge");
            Object obj = ReflectionsUtils.invokeMethod(testModel, invokedMethod);

            Assertions.assertEquals(21, testModel.getAge());
            Assertions.assertNull(obj);
        } catch (CustomException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    void setField() {
        try {
            Field uName = ReflectionsUtils.getField(testModel.getClass(), "name");
            ReflectionsUtils.setField(uName, testModel, "UpdatedName");
        } catch (CustomException ex) {
            ex.printStackTrace();
        }
        Assertions.assertEquals("UpdatedName", testModel.getName());
    }
}
