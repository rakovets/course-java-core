package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.project_taxservice.*;

import java.util.HashSet;
import java.util.Set;

public class DemoTaxService {
    public static void main(String[] args) {
        Set<Taxpayer> taxpayers = new HashSet<>();
        TaxService taxService = new TaxService(taxpayers);

        /**
         * Specification of task 1:
         *  - Adding new users;
         *  - Adding a new penalty for an existing taxpayer.
         */
        taxService.addTaxpayer(new Taxpayer(1, TaxpayerCity.MINSK, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(2, TaxpayerCity.MINSK, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(3, TaxpayerCity.WARSAW, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(4, TaxpayerCity.WARSAW, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(5, TaxpayerCity.TEL_AVIV, new HashSet<>()));
        taxService.addTaxpayer(new Taxpayer(6, TaxpayerCity.TEL_AVIV, new HashSet<>()));

        taxService.addTaxpayerFine(1, new Fine(FineTypes.SMALL, 1));
        taxService.addTaxpayerFine(1, new Fine(FineTypes.MEDIUM, 2));
        taxService.addTaxpayerFine(2, new Fine(FineTypes.MEDIUM, 3));
        taxService.addTaxpayerFine(2, new Fine(FineTypes.BIG, 4));
        taxService.addTaxpayerFine(3, new Fine(FineTypes.BIG, 5));
        taxService.addTaxpayerFine(3, new Fine(FineTypes.HUGE, 6));
        taxService.addTaxpayerFine(4, new Fine(FineTypes.HUGE, 7));
        taxService.addTaxpayerFine(4, new Fine(FineTypes.NEED_TO_SELL_EVERYTHING, 8));
        taxService.addTaxpayerFine(5, new Fine(FineTypes.NEED_TO_SELL_EVERYTHING, 9));
        taxService.addTaxpayerFine(5, new Fine(FineTypes.SMALL, 10));
        taxService.addTaxpayerFine(6, new Fine(FineTypes.SMALL, 11));
        taxService.addTaxpayerFine(6, new Fine(FineTypes.MEDIUM, 12));

        /**
         * Specification of task 2:
         * - Display data for a specific identification code;
         * - Displaying data for a specific type of penalty;
         * - Display data for a specific city;
         * - Display all data.
         */
        System.out.println("Specification of task 2");
        System.out.println(taxService.showTaxpayerInfoId(1));
        System.out.println(taxService.showInfoTaxpayerFineTypes(FineTypes.SMALL));
        System.out.println(taxService.showInfoTaxpayerCity(TaxpayerCity.MINSK));
        System.out.println(taxService.showInfoTaxpayerAll());
        System.out.println("-----------------------");

        /**
         * Specification of task 3:
         * - Updating of taxpayer information;
         * - Updating information on taxpayer fines.
         */
        System.out.println("Specification of task 3");
        System.out.println(taxService.showTaxpayerInfoId(5));
        taxService.updateTaxpayerCity(5, TaxpayerCity.MINSK);
        System.out.println(taxService.showTaxpayerInfoId(5));
        System.out.println();
        System.out.println(taxService.showTaxpayerInfoId(3));
        taxService.updateTaxpayerFine(3, 5, FineTypes.SMALL);
        System.out.println(taxService.showTaxpayerInfoId(3));
        System.out.println("-----------------------");

        /**
         * Specification of task 4:
         * - Removing a penalty.
         */
        System.out.println("Specification of task 4");
        System.out.println(taxService.showTaxpayerInfoId(1));
        taxService.removeTaxpayerFine(1, 2);
        System.out.println(taxService.showTaxpayerInfoId(1));
    }
}
