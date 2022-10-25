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
    TaxBase taxBaseActual = new TaxBase(new HashSet<Payer>());

    @Test
    public void testAddPayer() {

        taxBaseActual.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        Payer payerExpected = new Payer("0001AB7", "Sergey Belov", CityName.MINSK, new HashSet<Fine>(List.of(new Fine("25102022_7_001", FineType.FINE_5))));
        Set<Payer> payersExpected = new HashSet<>(List.of(payerExpected));
        TaxBase taxBaseExpected = new TaxBase(payersExpected);

        Assertions.assertEquals(taxBaseActual.toString(), taxBaseActual.toString());
    }
}
