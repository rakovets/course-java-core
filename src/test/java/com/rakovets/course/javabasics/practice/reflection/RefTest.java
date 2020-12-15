package com.rakovets.course.javabasics.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class RefTest {
    @Test
    void testGetField() throws NoSuchFieldException {
        Assertions.assertEquals(Car.class.getDeclaredField("brand"),
                RefUtil.getField(Car.class, "brand"));
    }
    @Test
    void testGetMethod() throws  NoSuchMethodException {
        Assertions.assertEquals(Car.class.getDeclaredMethod("getBrand"),
                RefUtil.getMethod(Car.class, "getBrand"));
    }
    @Test
    void testGetArrayOfMethods(){
        Method[] expected = Car.class.getDeclaredMethods();
        Method[] actual = RefUtil.getArrayOfMethods(Car.class);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testGetInvokeMethod() throws NoSuchMethodException {
        Car car = new Car("BMW", "X5", 2017);
        Assertions.assertEquals(2017,
                RefUtil.getInvokeMethod((Car.class.getMethod("getYearofissue")), car));
    }

    @Test
    void setValueToFieldTest()throws NoSuchFieldException{
        Car car = new Car("Mazda", "6", 2018);
        RefUtil.setValueToField(Car.class.getDeclaredField("yearofissue"), car, 2018);
        Assertions.assertEquals(2018, car.getYearofissue());
    }
}
