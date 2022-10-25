package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.enums.CityName;
import com.rakovets.course.java.core.practice.jcf_set.enums.FineType;
import com.rakovets.course.java.core.practice.jcf_set.models.Fine;
import com.rakovets.course.java.core.practice.jcf_set.models.Payer;
import com.rakovets.course.java.core.practice.jcf_set.models.TaxBase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoTaxService {
    public static void main(String[] args) {
        Set<Payer> payers = new HashSet<>();
        payers.add(new Payer("0001AA7", "Victor Polonnikov", CityName.MINSK, new HashSet<>(List.of(new Fine("24102022_7_001", FineType.FINE_1)))));
        System.out.println(payers);
        for (Payer p : payers) {
            if (p.getPayerId() == "0001AA7") {
                p.getFines().add(new Fine("24102022_7_002", FineType.FINE_2));
                p.getFines().add(new Fine("24102022_7_003", FineType.FINE_3));
            }
        }
        TaxBase taxBase = new TaxBase(new HashSet<Payer>());
        boolean addPayer = taxBase.addPayer("0001AB5", "Andrew Belov", CityName.MINSK_REGION, "25102022_5_001", FineType.FINE_4);
        System.out.println(taxBase.getTaxBase());
        System.out.println(addPayer);

        boolean addFine = taxBase.addFine("0001AB5", "25102022", FineType.FINE_1);
        System.out.println(taxBase.getTaxBase());
        System.out.println(addFine);

        taxBase.addPayer("0001AB7", "Sergey Belov", CityName.MINSK, "25102022_7_001", FineType.FINE_5);
        System.out.println(taxBase.getTaxBase());
        taxBase.addFine("0001AB7", "25102022_7_002", FineType.FINE_1);

        taxBase.addPayer("0001AB4", "Victor Belov", CityName.GRODNO, "25102022_4_001", FineType.FINE_1);
        taxBase.addFine("0001AB4", "25102022_4_002", FineType.FINE_1);
        taxBase.addFine("0001AB4", "25102022_4_002", FineType.FINE_2);
        taxBase.addFine("0001AB4", "25102022_4_003", FineType.FINE_2);
        System.out.println(taxBase.getTaxBase());

        taxBase.showTaxBaseByPayerId("0001AB4");
        taxBase.showTaxBaseByFineType(FineType.FINE_1);
        taxBase.addPayer("0002AB4", "Pavel Belov", CityName.GRODNO, "25102022_4_002", FineType.FINE_6);
        taxBase.showTaxBaseByCityName(CityName.GRODNO);
        taxBase.showAllTaxBase();
        taxBase.updatePayerId("0002AB4", "0003AB4");
        taxBase.showTaxBaseByPayerId("0003AB4");
        taxBase.updatePayerSurname("0003AB4", "Pavel Chernov");
        taxBase.showTaxBaseByPayerId("0003AB4");
        taxBase.updatePayerCityName("0003AB4", CityName.MINSK);
        taxBase.showTaxBaseByPayerId("0003AB4");
        taxBase.updatePayerFineType("0003AB4", "25102022_4_002", FineType.FINE_1);
        taxBase.showTaxBaseByPayerId("0003AB4");
        taxBase.updatePayerFineProtocolId("0003AB4", "25102022_4_002", "25102022_4_003");
        taxBase.showTaxBaseByPayerId("0003AB4");
        taxBase.removeFine("25102022_4_003");
        taxBase.showTaxBaseByPayerId("0003AB4");
    }
}
