package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.enums.CityName;
import com.rakovets.course.java.core.practice.jcf_set.enums.FineType;
import com.rakovets.course.java.core.practice.jcf_set.models.Fine;
import com.rakovets.course.java.core.practice.jcf_set.models.Payer;
import com.rakovets.course.java.core.practice.jcf_set.models.TaxBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaxServiceTest {

    @Test
    public void testAddPayer() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        Payer payerExpected = new Payer("0001AB5", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.addPayer("0001AB5", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void testAddFine() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB5", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB5", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5), new Fine("25102022_7_002", FineType.FINE_1))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.addFine("0001AB5", "25102022_7_002", FineType.FINE_1);

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void testRemoveFine() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB5", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        taxBaseActual.addFine("0001AB5", "25102022_7_002", FineType.FINE_1);
        Payer payerExpected = new Payer("0001AB5", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_002", FineType.FINE_1))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.removeFine("25102022_7_001");

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void testUpdatePayerId() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB5", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.updatePayerId("0001AB5", "0001AB7");

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void testUpdatePayerCityName() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Sergey Belov", CityName.MINSK_REGION, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.updatePayerCityName("0001AB7", CityName.MINSK_REGION);

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public  void testShowTaxBaseByCityName() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB5", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB5", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);
        taxBaseActual.addPayer("0001AB4", "Sergey Belov", CityName.GRODNO, "25102022_4_001", FineType.FINE_5);
        taxBaseActual.addPayer("0001AB6", "Sergey Belov", CityName.MOGILEV, "25102022_6_001", FineType.FINE_5);

        Assertions.assertEquals(taxBaseActual.showTaxBaseByCityName(CityName.MINSK).toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public  void testShowTaxBaseByFineType() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB5", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB5", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);
        taxBaseActual.addFine("0001AB5", "25102022_7_002", FineType.FINE_1);
        taxBaseActual.addFine("0001AB5", "25102022_7_003", FineType.FINE_2);

        Assertions.assertEquals(taxBaseActual.showTaxBaseByFineType(FineType.FINE_5).toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void showAllTaxBase() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        Assertions.assertEquals(taxBaseActual.showAllTaxBase().toString(), taxBaseExpected.showAllTaxBase().toString());
    }

    @Test
    public void testUpdatePayerName_Surname() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Pavel Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.updatePayerName_Surname("0001AB7", "Pavel Belov");

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void testUpdatePayerFineProtocolId() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_002", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.updatePayerFineProtocolId("0001AB7", "25102022_7_001", "25102022_7_002");

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }

    @Test
    public void testUpdatePayerFineType() {
        TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());
        taxBaseActual.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_6))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        taxBaseActual.updatePayerFineType("0001AB7", "25102022_7_001", FineType.FINE_6);

        Assertions.assertEquals(taxBaseActual.getTaxBase().toString(), taxBaseExpected.getTaxBase().toString());
    }
}
