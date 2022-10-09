package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTests {
    Atm atm = new Atm(15, 10, 5);

    @Test
    public void testAtm() {
        Assertions.assertEquals(15, atm.getNumberBanknotes20());
        Assertions.assertEquals(10, atm.getNumberBanknotes50());
        Assertions.assertEquals(5, atm.getNumberBanknotes100());
        Assertions.assertEquals(0, atm.getCurrentIssueAmount());
    }

    @Test
    public void testAddBanknotes20() {
        atm.addBanknotes20(1);
        Assertions.assertEquals(16, atm.getNumberBanknotes20());
        atm.addBanknotes20(10);
        Assertions.assertEquals(26, atm.getNumberBanknotes20());
    }
    @Test
    public void testAddBanknotes50() {
        atm.addBanknotes50(1);
        Assertions.assertEquals(11, atm.getNumberBanknotes50());
        atm.addBanknotes50(10);
        Assertions.assertEquals(21, atm.getNumberBanknotes50());
    }
    @Test
    public void testAddBanknotes100() {
        atm.addBanknotes100(1);
        Assertions.assertEquals(6, atm.getNumberBanknotes100());
        atm.addBanknotes100(10);
        Assertions.assertEquals(16, atm.getNumberBanknotes100());
    }
    @Test
    public void testIsPossibleIssueFalse() {
        Assertions.assertEquals(false, atm.isPossibleIssue(1320));
        Assertions.assertEquals(false, atm.isPossibleIssue(1290));
        Assertions.assertEquals(false, atm.isPossibleIssue(30));
        Assertions.assertEquals(false, atm.isPossibleIssue(0));
    }
    @Test
    public void testIsPossibleIssueTrue() {
        Assertions.assertEquals(true, atm.isPossibleIssue(1300));
        Assertions.assertEquals(true, atm.isPossibleIssue(1280));
        Assertions.assertEquals(true, atm.isPossibleIssue(280));
        Assertions.assertEquals(true, atm.isPossibleIssue(20));
    }
    @Test
    public void testGetOptionsCombinationBanknotes() {
        int[][] optionsCombinationBanknotes280 = atm.getOptionsCombinationBanknotes(280);
        for (int i = 0; i < optionsCombinationBanknotes280.length; i++) {
            System.out.print("Вариант " + (i + 1) + ": ");
            System.out.print(optionsCombinationBanknotes280[i][0] + " банкнот(ы) по 20; ");
            System.out.print(optionsCombinationBanknotes280[i][1] + " банкнот(ы) по 50; ");
            System.out.print(optionsCombinationBanknotes280[i][2] + " банкнот(ы) по 100. ");
            System.out.println("");
        }
        Assertions.assertEquals(6, optionsCombinationBanknotes280.length);
        int[][] optionsCombinationBanknotes1300 = atm.getOptionsCombinationBanknotes(1300);
        Assertions.assertEquals(1, optionsCombinationBanknotes1300.length);
        int[][] optionsCombinationBanknotes20 = atm.getOptionsCombinationBanknotes(20);
        Assertions.assertEquals(1, optionsCombinationBanknotes20.length);
        int[][] optionsCombinationBanknotes100 = atm.getOptionsCombinationBanknotes(100);
        Assertions.assertEquals(3, optionsCombinationBanknotes100.length);
    }
    @Test
    public void testGetCash() {
        if (atm.isPossibleIssue(280)) {
            int[] chosenOption = atm.getCash(6);
            System.out.println("Получите деньги по выбранному Вами варианту: ");
            System.out.print(chosenOption[0] + " банкнот(ы) по 20; ");
            System.out.print(chosenOption[1] + " банкнот(ы) по 50; ");
            System.out.println(chosenOption[2] + " банкнот(ы) по 100; ");
            System.out.println("Всего к выдаче: " + (chosenOption[0] * atm.VALUE_BANKNOTES_20 + chosenOption[1] * atm.VALUE_BANKNOTES_50 + chosenOption[2] * atm.VALUE_BANKNOTES_100) + "." );
            Assertions.assertEquals(11, atm.getNumberBanknotes20());
            Assertions.assertEquals(10, atm.getNumberBanknotes50());
            Assertions.assertEquals(3, atm.getNumberBanknotes100());
            Assertions.assertEquals(0, atm.getCurrentIssueAmount());
        }
    }
}
