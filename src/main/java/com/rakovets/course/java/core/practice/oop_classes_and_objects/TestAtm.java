package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAtm {
    @Test
    public void testAtm() {
        Atm atm = new Atm(10, 20, 30);
        Assertions.assertEquals(10, atm.getNumberBanknotes20());
        Assertions.assertEquals(20, atm.getNumberBanknotes50());
        Assertions.assertEquals(30, atm.getNumberBanknotes100());
    }
    @Test
    public void testAddBanknotes20() {
        Atm atm = new Atm(15, 10, 5);
        atm.addBanknotes20(1);
        Assertions.assertEquals(16, atm.getNumberBanknotes20());
        atm.addBanknotes20(10);
        Assertions.assertEquals(26, atm.getNumberBanknotes20());
    }
    @Test
    public void testAddBanknotes50() {
        Atm atm = new Atm(15, 10, 5);
        atm.addBanknotes50(1);
        Assertions.assertEquals(11, atm.getNumberBanknotes50());
        atm.addBanknotes50(10);
        Assertions.assertEquals(21, atm.getNumberBanknotes50());
    }
    @Test
    public void testAddBanknotes100() {
        Atm atm = new Atm(15, 10, 5);
        atm.addBanknotes100(1);
        Assertions.assertEquals(6, atm.getNumberBanknotes100());
        atm.addBanknotes100(10);
        Assertions.assertEquals(16, atm.getNumberBanknotes100());
    }
    @Test
    public void testIsPossibleIssueFalse() {
        Atm atm = new Atm(30, 20, 10);
        Assertions.assertEquals(false, atm.isPossibleIssue(3320));
        Assertions.assertEquals(true, atm.isPossibleIssue(2600));
        Assertions.assertEquals(true, atm.isPossibleIssue(1340));
        Assertions.assertEquals(false, atm.isPossibleIssue(4440));
    }
}
