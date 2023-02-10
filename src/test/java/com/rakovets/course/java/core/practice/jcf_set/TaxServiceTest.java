package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

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
        wantedMen.addNewTaxpayer(linaInverse);
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
        wantedMen.addFineForTaxpayer(Fines.FINE02, "$$60,000,000,000");

        int actual = vashTheStampede.getFine().size();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void addFineForTaxpayerTest2() {
        wantedMen.addFineForTaxpayer(Fines.FINE02, "$$60,000,000,000");
        wantedMen.addFineForTaxpayer(Fines.FINE05, "$$60,000,000,000");
        wantedMen.addFineForTaxpayer(Fines.FINE01, "$$60,000,000,000");

        int actual = vashTheStampede.getFine().size();
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void removeFineForTaxpayerTest1() {
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$40,040,040,040");
        wantedMen.addFineForTaxpayer(Fines.FINE01, "$$40,040,040,040");

        wantedMen.removeFineForTaxpayer("$$40,040,040,040", "$$40,040,040,040#FINE01#2");

        int actual = tetsuoShima.getFine().size();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void removeFineForTaxpayerTest2() {
        wantedMen.addFineForTaxpayer(Fines.FINE06, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE06, "$$20,020,020,020");

        wantedMen.removeFineForTaxpayer("$$20,020,020,020", "$$20,020,020,020#FINE06#1");

        int actual = linaInverse.getFine().size();
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void showTaxpayerByIdTest1() {
        Object actual = wantedMen.showTaxpayerById("$$20,020,020,020");

        Assertions.assertEquals(linaInverse, actual);
    }

    @Test
    public void showTaxpayerByIdTest2() {
        Object actual = wantedMen.showTaxpayerById("$$40,040,040,040");

        Assertions.assertEquals(tetsuoShima, actual);
    }

    @Test
    public void showTaxpayerByIdTest3() {
        Object actual = wantedMen.showTaxpayerById("$$60,000,000,000");

        Assertions.assertEquals(vashTheStampede, actual);
    }

    @Test
    public void showTaxpayersByFineTypeTest1() {
        wantedMen.addFineForTaxpayer(Fines.FINE06, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE06, "$$60,000,000,000");

        int actual = wantedMen.showTaxpayersByFineType(Fines.FINE06).size();

        Assertions.assertEquals(2, actual);
    }

    @Test
    public void showTaxpayersByFineTypeTest2() {
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$60,000,000,000");

        int actual = wantedMen.showTaxpayersByFineType(Fines.FINE04).size();

        Assertions.assertEquals(2, actual);
    }

    @Test
    public void showTaxpayersByFineTypeTest3() {
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$40,040,040,040");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$60,000,000,000");

        int actual = wantedMen.showTaxpayersByFineType(Fines.FINE04).size();

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void showTaxpayersByFineTypeTest4() {
        int actual = wantedMen.showTaxpayersByFineType(Fines.FINE04).size();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void showTaxpayersByCityTest1() {
        HashSet actual = wantedMen.showTaxpayersByCity(Cities.GOMEL);

        Assertions.assertTrue(actual.contains(linaInverse));
    }

    @Test
    public void showTaxpayersByCityTest2() {
        HashSet actual = wantedMen.showTaxpayersByCity(Cities.GOMEL);

        Assertions.assertFalse(actual.contains(tetsuoShima));
    }

    @Test
    public void showTaxpayersByCityTest3() {
        HashSet actual = wantedMen.showTaxpayersByCity(Cities.MINSK);

        Assertions.assertTrue(actual.contains(vashTheStampede));
    }

    @Test
    public void showAllFinesTest1() {
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$40,040,040,040");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$60,000,000,000");

        int actual = wantedMen.showAllFines().size();

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void showAllFinesTest2() {
        wantedMen.addFineForTaxpayer(Fines.FINE05, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE02, "$$40,040,040,040");
        wantedMen.addFineForTaxpayer(Fines.FINE03, "$$60,000,000,000");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$60,000,000,000");

        int actual = wantedMen.showAllFines().size();

        Assertions.assertEquals(4, actual);
    }

    @Test
    public void showAllFinesTest3() {
        int actual = wantedMen.showAllFines().size();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void updateTaxpayerInformationTest1() {
        wantedMen.updateTaxpayerInformation("$$60,000,000,000", "The Humanoid", "Typhoon", Cities.GOMEL);

        String actual = vashTheStampede.getFirstName();
        String actual2 = vashTheStampede.getLastName();
        Object actual3 = vashTheStampede.getCity();
        Assertions.assertEquals("The Humanoid", actual);
        Assertions.assertEquals("Typhoon", actual2);
        Assertions.assertEquals(Cities.GOMEL, actual3);
    }

    @Test
    public void updateTaxpayerFineTest1() {
        wantedMen.addFineForTaxpayer(Fines.FINE01, "$$60,000,000,000");
        wantedMen.addFineForTaxpayer(Fines.FINE02, "$$60,000,000,000");
        wantedMen.addFineForTaxpayer(Fines.FINE02, "$$40,040,040,040");

        wantedMen.updateTaxpayerFine("$$60,000,000,000#FINE02#2", Fines.FINE05);

        int actual = wantedMen.showTaxpayersByFineType(Fines.FINE02).size();
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void updateTaxpayerFineTest2() {
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$60,000,000,000");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$20,020,020,020");
        wantedMen.addFineForTaxpayer(Fines.FINE04, "$$40,040,040,040");

        wantedMen.updateTaxpayerFine("$$60,000,000,000#FINE04#1", Fines.FINE02);

        int actual = wantedMen.showTaxpayersByFineType(Fines.FINE04).size();
        Assertions.assertEquals(2, actual);
    }
}
