package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {
    @Test
    public void testAtm() {
        // GIVEN
        Atm atm = new Atm(10, 20, 30);
        // WHEN
        int actual1 = atm.getNumberBanknotes20(10);
        int actual2 = atm.getNumberBanknotes50(20);
        int actual3 = atm.getNumberBanknotes100(30);

        //THEN
        Assertions.assertEquals(10, actual1);
        Assertions.assertEquals(20, actual2);
        Assertions.assertEquals(30, actual3);
    }

    @Test
    public void testAddBanknotes() {
        // GIVEN
        Atm atm = new Atm(10, 20, 30);
        // WHEN
        int actual1 = atm.addBanknotes20(5);
        int actual2 = atm.addBanknotes50(5);
        int actual3 = atm.addBanknotes100(5);

        //THEN
        Assertions.assertEquals(15, actual1);
        Assertions.assertEquals(25, actual2);
        Assertions.assertEquals(35, actual3);
    }

    @Test
    public void testIsPossibleIssueFalse() {
        // GIVEN
        Atm atm = new Atm(10, 20, 30);

        //THEN
        Assertions.assertEquals(true, atm.isPossibleIssue(3320));
        Assertions.assertEquals(true, atm.isPossibleIssue(4200));
        Assertions.assertEquals(false, atm.isPossibleIssue(4300));
        Assertions.assertEquals(false, atm.isPossibleIssue(4440));
    }
}


