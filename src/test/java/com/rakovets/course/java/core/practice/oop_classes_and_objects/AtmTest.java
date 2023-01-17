package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {
    // @Test       the code is not flexible. need to think about the variability
    //void withdrawMoneyTest1() {
    //    Atm atm = new Atm(10, 5, 10);
    //    Assertions.assertEquals(true, atm.isPossibleIssue(1270));
    // }
    @Test
    void withdrawMoneyTest2() {
        Atm atm = new Atm(10, 5, 10);

        Assertions.assertFalse(atm.isPossibleIssue(1300));
    }

    @Test
    void withdrawMoneyTest3() {
        Atm atm = new Atm(0, 5, 10);

        Assertions.assertFalse(atm.isPossibleIssue(1240));
    }

    @Test
    void withdrawMoneyTest4() {
        Atm atm = new Atm(0, 0, 15);

        Assertions.assertFalse(atm.isPossibleIssue(1240));
    }

    @Test
    void withdrawMoneyTest5() {
        Atm atm = new Atm(100, 0, 1);

        Assertions.assertTrue(atm.isPossibleIssue(1240));
    }

    @Test
    void checkMoneyInAtmTest1() {
        Atm atm = new Atm(1, 5, 10);

        Assertions.assertEquals(1270, atm.getTotalMoneyInAtm());
    }

    @Test
    void checkMoneyTest2() {
        Atm atm = new Atm(10, 50, 100);

        Assertions.assertEquals(12700, atm.getTotalMoneyInAtm());
    }

    @Test
    void checkMoneyTest3() {
        Atm atm = new Atm(43, 33, 347);

        Assertions.assertEquals(37210, atm.getTotalMoneyInAtm());
    }
}
