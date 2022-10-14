package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {
    @Test
    public void testBanknotes() {
        Atm atm = new Atm(1000,1020,997);
        Assertions.assertEquals(1000, atm.getNumberBanknotes20());
        Assertions.assertEquals(1020,atm.getNumberBanknotes50());
        Assertions.assertEquals(997, atm.getNumberBanknotes100());
    }

    @Test
    public void testAddBanknotes() {
        Atm atm = new Atm(10,20,40);
        atm.addBanknotes20(5);
        Assertions.assertEquals(15, atm.getNumberBanknotes20());
        atm.addBanknotes50(12);
        Assertions.assertEquals(32, atm.getNumberBanknotes50());
        atm.addBanknotes100(5);
        Assertions.assertEquals(45, atm.getNumberBanknotes100());
    }

    @Test
    public void testIsPossibleIssue() {
        Atm atm = new Atm(10,10,20);
        Assertions.assertEquals(true, atm.isPossibleIssue(200));
        Assertions.assertEquals(false, atm.isPossibleIssue(3000));
        Assertions.assertEquals(true, atm.isPossibleIssue(2500));
        Assertions.assertEquals(false, atm.isPossibleIssue(2701));
    }
}
