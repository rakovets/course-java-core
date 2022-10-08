package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.Atm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {
    @Test
    void testAddBanknotes20() {
        Atm atm = new Atm(10,0,0);

        atm.addBanknotes20(9);
        Assertions.assertEquals(1, atm.getNumberBanknotes20());
    }
    @Test
    void testAddBanknotes50() {
        Atm atm = new Atm(0,10,0);

        atm.addBanknotes50(9);
        Assertions.assertEquals(1, atm.getNumberBanknotes50());
    }
    @Test
    void testAddBanknotes100() {
        Atm atm = new Atm(0,0,10);

        atm.addBanknotes100(9);
        Assertions.assertEquals(1, atm.getNumberBanknotes100());
    }
}
