package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class TaxServiceDemo {
    public static void main(String[] args) {
       Set<TaxPayer> taxPayersDataBase = new HashSet<>();
       Set<Fine> finesDataBase = new HashSet<>();
       TaxService taxService = new TaxService(taxPayersDataBase, finesDataBase);

        /**
         * Specification of task 1
         */
        taxService.addNewTaxPayer(new TaxPayer("Odin", "Asgard", 120, new HashSet<>()));
        taxService.addNewTaxPayer(new TaxPayer("Thor", "Midgard", 121, new HashSet<>()));
        taxService.addNewTaxPayer(new TaxPayer("Loki", "Jotunheim", 122, new HashSet<>()));

        taxService.addNewFineTaxPayer(120, new Fine(1, 100, "Over speed", "New York"));
        taxService.addNewFineTaxPayer(121, new Fine(1, 120, "Flight without license", "Rome"));
        taxService.addNewFineTaxPayer(122, new Fine(1, 200, "Fraud", "Paris"));

        /**
         * Specification of task 2
         */
        System.out.println(taxService.getTaxPayerByID(120));
        System.out.println(taxService.getTaxPayerByID(121));
        System.out.println(taxService.getTaxPayerByID(122));

        System.out.println(taxService.getTaxPayerFineTypes(new Fine("Over speed")));
        System.out.println(taxService.getTaxPayerFineTypes(new Fine("Flight without license")));
        System.out.println(taxService.getTaxPayerFineTypes(new Fine("Fraud")));

        System.out.println(taxService.getTaxPayerByCity("New York"));
        System.out.println(taxService.getTaxPayerByCity("Rome"));
        System.out.println(taxService.getTaxPayerByCity("Paris"));

        System.out.println(taxService.getDataBase());

        /**
         * Specification of task 3
         */
        System.out.println(taxService.getTaxPayerByID(120));
        taxService.updateInfoTaxPayer(120, "Los Angeles");
        System.out.println(taxService.getTaxPayerByID(120));
        System.out.println(taxService.getTaxPayerByID(121));
        taxService.updateInfoTaxPayer(121, "Milan");
        System.out.println(taxService.getTaxPayerByID(121));

        System.out.println(taxService.getTaxPayerByID(120));
        taxService.updateInfoFine(1, 500);
        System.out.println(taxService.getTaxPayerByID(120));
        System.out.println(taxService.getTaxPayerByID(121));
        taxService.updateInfoFine(1, 2000);
        System.out.println(taxService.getTaxPayerByID(121));

        /**
         * Specification of task 4
         */
        System.out.println(taxService.getTaxPayerByID(122));
        taxService.removeFine(new Fine(1, 200, "Fraud", "Paris"), 122);
        System.out.println(taxService.getTaxPayerByID(122));
    }
}
