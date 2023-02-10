package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaxServiceTest {
    private TaxService wantedPeople;
    private TaxService wantedMen;
    private Taxpayer vashTheStampede = new Taxpayer("Vash", "TheStampede", Cities.MINSK, "$$60,000,000,000");
    private Taxpayer linaInverse = new Taxpayer("Lina", "Inverse", Cities.GOMEL, "$$20,020,020,020");
    private Taxpayer tetsuoShima = new Taxpayer("Tetsuo", "Shima", Cities.BREST, "$$40,040,040,040");

    @BeforeEach
    public void init() {
        wantedPeople = new TaxService();
        wantedMen = new TaxService();
        wantedMen.addNewTaxpayer(vashTheStampede);
        wantedMen.addNewTaxpayer(tetsuoShima);
    }

    @Test
    public void addNewTaxpayerTest1() {
        wantedPeople.addNewTaxpayer(vashTheStampede);

        Assertions.assertFalse(wantedPeople.addNewTaxpayer(vashTheStampede));
    }

    @Test
    public void addNewTaxpayerTest2() {
        wantedPeople.addNewTaxpayer(linaInverse);

        Assertions.assertTrue(wantedPeople.addNewTaxpayer(vashTheStampede));
    }

    @Test
    public void addFineForTaxpayerTest1() {
        wantedPeople.addNewTaxpayer(vashTheStampede);
        wantedPeople.addFineForTaxpayer(Fines.FINE02, "$$60,000,000,000");

        int actual = vashTheStampede.getFine().size();

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void addFineForTaxpayerTest2() {
        wantedPeople.addNewTaxpayer(vashTheStampede);
        wantedPeople.addFineForTaxpayer(Fines.FINE02, "$$60,000,000,000");

        int actual = vashTheStampede.getFine().size();

        Assertions.assertEquals(1, actual);
    }
}
