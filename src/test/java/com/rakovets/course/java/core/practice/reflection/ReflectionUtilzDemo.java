package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.reflection.model.Car;

import java.util.Arrays;

public class ReflectionUtilzDemo {
    public static void main(String[] args) {
        String brand = "BMW";
        String neBrand = "Volksvagen";
        String model = "M5";
        String fieldName = "model";
        String methodName = "getBrand";
        String anotherMethodName = "rideBack";
        String meters = "100";
        Car car = new Car(brand, model);
        Class<Car> carClass = Car.class;
        Class<String> stringClass = String.class;
        System.out.println(ReflectionUtils.getField(carClass,fieldName));
        System.out.println(ReflectionUtils.getMethod(carClass,methodName));
        System.out.println(Arrays.toString(ReflectionUtils.getAllMethod(carClass)));
        ReflectionUtils.invokeMethod(ReflectionUtils.getMethod(carClass,methodName),car);
        ReflectionUtils.setField(ReflectionUtils.getField(carClass,fieldName),car,neBrand);
        System.out.println(car.model);
        ReflectionUtils.invokeAnotherMethod(ReflectionUtils.getAnotherMethod(carClass,anotherMethodName,stringClass),car, meters);

    }
}
