package com.rakovets.course.java.core.practice.jcf.map.project_garage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

class GarageTest {

    @Test
    void park() {
        //Given
        Garage garage = new Garage();
        Car audi = new Audi("Audi", "RS6", "Blue", 2015, "6317-BO5");
        Car mercedes = new Mercedes("Mercedes", "E-class", "White", 2010, "7070-OM7");
        Car bmw = new BMW("BMW", "M5", "Black", 2018, "7870-IM7");
        Car volkswagen = new Volkswagen("Volkswagen", "Golf R", "Blue", 2015, "6742-OM5");
        int expectedResult = 4;

        //When
        garage.park(audi);
        garage.park(mercedes);
        garage.park(bmw);
        garage.park(volkswagen);
        Collection<List<Car>> collection = garage.getGarageMap().values();
        int actualResult = collection.size();

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void leave() {
        //Given
        Garage garage = new Garage();
        Car audi = new Audi("Audi", "RS6", "Blue", 2015, "6317-BO5");
        Car mercedes = new Mercedes("Mercedes", "E-class", "White", 2010, "7070-OM7");
        garage.park(audi);
        garage.park(mercedes);
        int expectedResult = 2;

        //When
        garage.leave(audi);
        Collection<List<Car>> collection = garage.getGarageMap().values();
        int actualResult = collection.size();

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getCount() {
        //Given
        Garage garage = new Garage();
        Car audi = new Audi("Audi", "RS6", "Blue", 2015, "6317-BO5");
        Car audi1 = new Audi("Audi", "RS6", "Graphite", 2016, "6614-BO8");
        Car mercedes = new Mercedes("Mercedes", "E-class", "White", 2010, "7070-OM7");
        garage.park(audi);
        garage.park(audi1);
        garage.park(mercedes);
        int expectedResult = 2;

        //When
        int actualResult = garage.getCount("Audi", "RS6");

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void isExist() {
        //Given
        Garage garage = new Garage();
        Car audi = new Audi("Audi", "RS6", "Blue", 2015, "6317-BO5");
        Car audi1 = new Audi("Audi", "RS6", "Graphite", 2016, "6614-BO8");
        Car mercedes = new Mercedes("Mercedes", "E-class", "White", 2010, "7070-OM7");
        garage.park(audi);
        garage.park(audi1);
        garage.park(mercedes);

        //When
        boolean actualResult = garage.isExist("6317-BO5");

        //Than
        Assertions.assertTrue(actualResult);
    }

    @Test
    void testIsExist() {
        //Given
        Garage garage = new Garage();
        Car audi = new Audi("Audi", "RS6", "Blue", 2015, "6317-BO5");
        Car audi1 = new Audi("Audi", "RS6", "Graphite", 2016, "6614-BO8");
        Car mercedes = new Mercedes("Mercedes", "E-class", "White", 2010, "7070-OM7");
        garage.park(audi);
        garage.park(audi1);
        garage.park(mercedes);

        //When
        boolean actualResult = garage.isExist("Mercedes", "E-class", "7070-OM7");

        //Than
        Assertions.assertTrue(actualResult);
    }

    @Test
    void getByRegistrationNumber() {
        //Given
        Garage garage = new Garage();
        Car audi = new Audi("Audi", "RS6", "Blue", 2015, "6317-BO5");
        Car audi1 = new Audi("Audi", "RS6", "Graphite", 2016, "6614-BO8");
        Car mercedes = new Mercedes("Mercedes", "E-class", "White", 2010, "7070-OM7");
        garage.park(audi);
        garage.park(audi1);
        garage.park(mercedes);

        //When
        Car actualResult = garage.getByRegistrationNumber("7070-OM7");

        //Than
        Assertions.assertEquals(mercedes, actualResult);
    }
}
