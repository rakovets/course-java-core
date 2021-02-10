package com.rakovets.course.java.core.practice.jcf.map;

import com.rakovets.course.java.core.practice.jcf.map.garage.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GarageTest {
    @Test
    void park() {
        // GIVEN
        Garage example = new Garage();
        Car firstMitsubishi = new Mitsubishi("Outlander", "red", 2010, 12345);

        // WHEN
        example.park(firstMitsubishi);

        // THEN
        Assertions.assertFalse(example.getGarage().isEmpty());
    }

    @Test
    void leave() {
        // GIVEN
        Garage example = new Garage();
        Car firstMitsubishi = new Mitsubishi("Outlander", "red", 2010, 12345);
        example.park(firstMitsubishi);

        // WHEN
        example.leave(firstMitsubishi);

        // THEN
        Assertions.assertTrue(example.getGarage().isEmpty());
    }

    @Test
    void getCount() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        Car c = new Mitsubishi("Outlander", "black", 2015, 76599);
        Car d = new Mitsubishi("Pajero", "red", 2010, 659769);
        example.park(a);
        example.park(b);
        example.park(c);
        example.park(d);

        // WHEN
        int actualInt = example.getCount("Mitsubishi", "Outlander");

        // THEN
        Assertions.assertEquals(3, actualInt);
    }

    @Test
    void isExistFalse() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        example.park(a);
        example.park(b);

        // WHEN
        boolean actualBoolean = example.isExist(10000);

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void isExistTrue() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        example.park(a);
        example.park(b);

        // WHEN
        boolean actualBoolean = example.isExist(12345);

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isExistWithModelAndBrandTrue() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        example.park(a);
        example.park(b);

        // WHEN
        boolean actualBoolean = example.isExist("Mitsubishi", "Outlander", 56785);

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isExistWithModelAndBrandFalse() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        example.park(a);
        example.park(b);

        // WHEN
        boolean actualBoolean = example.isExist("Mitsubishi", "Outlander", 10000);

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void getByRegistrationNumberPositive() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        Car c = new Mitsubishi("Outlander", "black", 2015, 76599);
        Car d = new Mitsubishi("Pajero", "red", 2010, 659769);
        example.park(a);
        example.park(b);
        example.park(c);
        example.park(d);

        // WHEN
        Car actualCar = null;
        try {
            actualCar = example.getByRegistrationNumber(56785);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // THEN
        Assertions.assertEquals(b, actualCar);
    }

    void getByRegistrationNumberNegative() {
        // GIVEN
        Garage example = new Garage();
        Car a = new Mitsubishi("Outlander", "red", 2010, 12345);
        Car b = new Mitsubishi("Outlander", "white", 2020, 56785);
        Car c = new Mitsubishi("Outlander", "black", 2015, 76599);
        Car d = new Mitsubishi("Pajero", "red", 2010, 659769);
        example.park(a);
        example.park(b);
        example.park(c);
        example.park(d);

        // WHEN
        String actualString = null;
        try {
            example.getByRegistrationNumber(10000);
        } catch (Exception e) {
            actualString = e.getMessage();
        }

        // THEN
        Assertions.assertEquals("there isn't car with this registration number in the garage", actualString);
    }
}
