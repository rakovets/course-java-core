package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.garage.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class GarageTests {

    private LinkedList<Car> cars = new LinkedList<>();

    @BeforeEach
    void inputData() {

        cars.add(new BMW("X5", "Black", 2005, 10010));
        cars.add(new BMW("X7", "Black", 2020, 10010));
        cars.add(new BMW("X1", "Pink", 2014, 10013));
        cars.add(new BMW("X5", "White", 2015, 10012));
        cars.add(new Ford("Kuga", "Black", 2010, 10014));
        cars.add(new Honda("Civic", "Red", 2009, 10015));
        cars.add(new Kia("Sorento", "Grey", 2013, 10016));
        cars.add(new Kia("Ceed", "Blue Metalic", 2000, 10017));

    }

    @Test
    void getByRegistrationNumber() {

        Garage garageList = new Garage(cars);

        Kia kiaAtos = new Kia("Atos", "Red", 2009, 10018);
        Assertions.assertNotSame(kiaAtos, garageList.getByRegistrationNumber(10018));
        garageList.park(kiaAtos);
        Assertions.assertEquals(kiaAtos, garageList.getByRegistrationNumber(10018));

        Kia kiaSportage = new Kia("Sportage", "White", 2012, 10019);
        Assertions.assertNotSame(kiaSportage, garageList.getByRegistrationNumber(10019));
        garageList.park(kiaSportage);
        Assertions.assertEquals(kiaSportage, garageList.getByRegistrationNumber(10019));
    }
    
    @Test
    void parkTest() {

        Garage garageList = new Garage(cars);
        Kia kiaAtos = new Kia("Atos", "Red", 2009, 10018);
        garageList.park(kiaAtos);
        Kia kiaSportage = new Kia("Sportage", "White", 2012, 10019);
        garageList.park(kiaSportage);
        Car actual = garageList.getByRegistrationNumber(10018);
        Car actual1 = garageList.getByRegistrationNumber(10019);
        Assertions.assertSame(kiaAtos, actual);
        Assertions.assertSame(kiaSportage, actual1);
    }

    @Test
    void leaveTest() {

        Garage garageList = new Garage(cars);
        Kia kiaAtos = new Kia("Atos", "Red", 2009, 10018);
        garageList.leave(kiaAtos);
        Car actual = garageList.getByRegistrationNumber(10018);
        Assertions.assertNotSame(kiaAtos, actual);
    }

    @Test
    void getCountTest() {

        Garage garageList = new Garage(cars);
        Assertions.assertEquals(2, garageList.getCount("BMW", "X5"));
        Assertions.assertEquals(0, garageList.getCount("BMW", "X8"));
        Assertions.assertEquals(0, garageList.getCount("Ford", "X8"));
        Assertions.assertEquals(1, garageList.getCount("Kia", "Ceed"));
    }

    @Test
    void isExistTest() {

        Garage garageList = new Garage(cars);
        Assertions.assertTrue(garageList.isExist(10010));
        Assertions.assertFalse(garageList.isExist(3322));
    }

    @Test
    void isExistTestOver() {

        Garage garageList = new Garage(cars);
        Assertions.assertTrue(garageList.isExist("Kia", "Sorento", 10016));
        Assertions.assertFalse(garageList.isExist("Kia", "Atos", 10020));
    }




}
