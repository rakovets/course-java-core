package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionUtilsTest {

    @Test
    void getField() throws NoSuchFieldException {
        //Given
        String expectedResult = "private java.lang.String com.rakovets.course.java.core.practice.reflection.Bike.brand";

        //When
        String actualResult = ReflectionUtils.getField(Bike.class, "brand").toString();

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getMethod() throws NoSuchMethodException {
        //Given
        String expectedResult = "private java.lang.String com.rakovets.course.java.core.practice.reflection.Bike.getBikeCountry()";

        //When
        String actualResult = ReflectionUtils.getMethod(Bike.class, "getBikeCountry").toString();

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getMethodsArray() {
        //Given
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("getBikeCountry");
        expectedResult.add("getBrand");
        expectedResult.add("getEngineVolume");
        expectedResult.add("getModel");
        expectedResult.add("getNumberPlate");

        //When
        List<String> actualResult = ReflectionUtils.getMethodsArray(Bike.class);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void startMethodWithObject() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Given
        Bike kawasaki = new Bike("Kawasaki", "ZX-14", 1400);
        String expectedResult = "Japan";
        //When
        String actualResult = ReflectionUtils.startMethodWithObject
                (kawasaki, Bike.class.getDeclaredMethod("getBikeCountry"));
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void changeFieldWithString() throws NoSuchFieldException, IllegalAccessException {
        //Given
        Bike ducati = new Bike("Ducati", "Panigale", 1099);
        String expectedResult = "Ducati Diavel 1099";

        //When
        ReflectionUtils.changeField(Bike.class.getDeclaredField("model"), ducati, "Diavel");
        String actualResult = String.format("%s %s %s", ducati.getBrand(), ducati.getModel(), ducati.getEngineVolume());

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testChangeFieldWithInt() throws NoSuchFieldException, IllegalAccessException {
        //Given
        Bike ducati = new Bike("Ducati", "Panigale", 1099);
        String expectedResult = "Ducati Panigale 1299";

        //When
        ReflectionUtils.changeField(Bike.class.getDeclaredField("engineVolume"), ducati, 1299);
        String actualResult = String.format("%s %s %s", ducati.getBrand(), ducati.getModel(), ducati.getEngineVolume());

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getMethodWithParams() throws NoSuchMethodException {
        //Given
        String expectedResult =
                "private java.lang.String com.rakovets.course.java.core.practice.reflection.Bike.getNumberPlate(java.lang.String)";

        //When
        String actualResult = ReflectionUtils.getMethodWithParams
                (Bike.class, "getNumberPlate", new Class[]{String.class}).toString();

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void startMethodWithObjectParams() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Given
        Bike izh = new Bike("IZH", "Planeta Sport", 350);
        String expectedResult = "IZH Planeta Sport 350 9097 MT-5";
        //When
        String actualResult = ReflectionUtils.startMethodWithObjectParams(
                Bike.class.getDeclaredMethod("getNumberPlate", String.class), izh, new Object[]{"9097 MT-5"});
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
