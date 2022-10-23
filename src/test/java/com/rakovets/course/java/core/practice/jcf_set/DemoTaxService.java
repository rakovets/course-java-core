package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Set;

public class DemoTaxService {
    public static void main(String[] args) {
        Set<Taxpayer> taxpayerSet = new HashSet<>();
        TaxService taxService = new TaxService(taxpayerSet);

        taxService.addTaxpayer(new Taxpayer(123, City.LONDON, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(225, City.MINSK, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(165, City.LONDON, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(114, City.MINSK, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(100, City.LONDON, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(130, City.NY, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(250, City.LONDON, new HashSet<>()));

        taxService.addFineToTaxpayer(123, new Fine(FineTypes.SPEED, 111222333));
        taxService.addFineToTaxpayer(123, new Fine(FineTypes.ADMIN, 111244333));
        taxService.addFineToTaxpayer(225, new Fine(FineTypes.SPEED, 114422333));
        taxService.addFineToTaxpayer(165, new Fine(FineTypes.ADMIN, 111248633));
        taxService.addFineToTaxpayer(114, new Fine(FineTypes.SPEED, 177722333));
        taxService.addFineToTaxpayer(100, new Fine(FineTypes.ADMIN, 111248733));
        taxService.addFineToTaxpayer(130, new Fine(FineTypes.SPEED, 111222333));
        taxService.addFineToTaxpayer(250, new Fine(FineTypes.SPEED, 119994333));
        taxService.addFineToTaxpayer(100, new Fine(FineTypes.ADMIN, 111244333));
        taxService.addFineToTaxpayer(130, new Fine(FineTypes.SPEED, 111224443));
        taxService.addFineToTaxpayer(250, new Fine(FineTypes.SPEED, 119644333));

        for (Taxpayer tax : taxpayerSet) {
            System.out.println(tax.toString() + tax.getFineSet().toString());
        }

        System.out.println("getInformationForId");
        System.out.println(taxService.getInformationForId(225));

        System.out.println("getInformationForTypeOfFine");
        System.out.println(taxService.getInformationForTypeOfFine(FineTypes.SPEED));

        System.out.println("getInformationForCity");
        System.out.println(taxService.getInformationForCity(City.LONDON));

        System.out.println("getTaxpayerSet");
        System.out.println(taxService.getTaxpayerSet().toString());

        System.out.println("changeTaxpayerCity");
        System.out.println(taxService.getInformationForId(123));
        taxService.changeTaxpayerCity(123, City.NY);
        System.out.println(taxService.getInformationForId(123));

        System.out.println("changeTaxpayerFine");
        System.out.println(taxService.getInformationForId(130));
        taxService.changeTaxpayerFine(130, 111224443, FineTypes.ADMIN);
        System.out.println(taxService.getInformationForId(130));

        System.out.println("deleteTaxpayerFine");
        System.out.println(taxService.getInformationForId(130));
        taxService.deleteTaxpayerFine(130, 111222333);
        System.out.println(taxService.getInformationForId(130));
    }
}
