package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_4.Atm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task04 {
    private static Atm atmOne;
    private static Atm atmTwo;


    @BeforeAll
    static void setUp() {
       atmOne = new Atm(100,200,500);
       atmTwo = new Atm(400,358,300);
       atmTwo.addNumberBanknotes20(44);
       atmTwo.addNumberBanknotes50(12);
       atmTwo.addNumberBanknotes100(33);
    }
    @Test
    @DisplayName("testGetNumberBanknotes20")
    void testGetNumberBanknotes20() {
        int actual = atmOne.getNumberBanknotes20();

        Assertions.assertEquals(100,actual);
    }
    @Test
    @DisplayName("testGetNumberBanknotes50")
    void testGetNumberBanknotes50() {
        int actual = atmOne.getNumberBanknotes50();

        Assertions.assertEquals(200,actual);
    }
    @Test
    @DisplayName("testGetNumberBanknotes100")
    void testGetNumberBanknotes100() {
        int actual = atmOne.getNumberBanknotes100();

        Assertions.assertEquals(500,actual);
    }
    @Test
    @DisplayName("testAddedBanknotes20")
    void testAddedBanknotes20() {
        int actual = atmTwo.getNumberBanknotes20();

        Assertions.assertEquals(444,actual);
    }
    @Test
    @DisplayName("testAddedBanknotes50")
    void testAddedBanknotes50() {
        int actual = atmTwo.getNumberBanknotes50();

        Assertions.assertEquals(370,actual);
    }
    @Test
    @DisplayName("testAddedBanknotes100")
    void testAddedBanknotes100() {
        int actual = atmTwo.getNumberBanknotes100();

        Assertions.assertEquals(333,actual);
    }
    @Test
    @DisplayName("testPossibleIssueTrue")
    void testPossibleIssue() {
        boolean actual = atmTwo.isPossibleIssue(5000);

        Assertions.assertTrue(actual);
    }
    @Test
    @DisplayName("testPossibleIssueFalse")
    void testPossibleFalse() {
        boolean actual = atmTwo.isPossibleIssue(10);

        Assertions.assertFalse(actual);
    }

}
