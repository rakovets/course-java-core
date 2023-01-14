package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {
    @Test
    void getTest() {
        Atm atm = new Atm(100, 101, 102);
        Assertions.assertEquals(100, atm.getNumberBanknotes20());
        Assertions.assertEquals(101, atm.getNumberBanknotes50());
        Assertions.assertEquals(102, atm.getNumberBanknotes100());
    }

    @Test
    void addTest() {
        Atm atm = new Atm(100, 101, 102);
        atm.addBanknotes20(5);
        atm.addBanknotes50(10);
        atm.addBanknotes100(15);
        Assertions.assertEquals(105, atm.getNumberBanknotes20());
        Assertions.assertEquals(111, atm.getNumberBanknotes50());
        Assertions.assertEquals(117, atm.getNumberBanknotes100());
    }
}
