package com.rakovets.course.java.core.practice.jcf.map.Garage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GarageTest {

    @Test
    void testGarage() {
        Garage garage = new Garage();
        garage.park(new Mazda("Mazda", "CX-5", "Red", 2020,
                "1928PY7"));
        garage.park(new Porsche("Porsche", "Cayman", "Black", 2018,
                "8273RT7"));
        garage.park(new Audi("Audi", "RS3", "Grey", 2021,
                "0058UI7"));
        garage.park(new Ferrari("Ferrari", "Monza", "Purple", 2019,
                "0298NR7"));
        assertEquals(1, garage.getCount("Porsche", "Cayman"));
        assertTrue(garage.isExist("8273RT7"));
        assertTrue(garage.isExist("Audi", "RS3", "0058UI7"));
        garage.leave(new Ferrari("Ferrari", "Monza", "Purple", 2019,
                "0298NR7"));
        assertTrue(garage.isExist("0298NR7"));
        assertEquals("CX-5", garage.getByRegistrationNumber("1928PY7").getModel());
    }
}
