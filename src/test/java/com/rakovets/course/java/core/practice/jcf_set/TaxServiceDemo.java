package com.rakovets.course.java.core.practice.jcf_set;

import java.util.*;

public class TaxServiceDemo {
    public static void main(String[] args) {
        LinkedHashSet<Person> taxPayer = new LinkedHashSet<>();
        TaxService taxService = new TaxService(taxPayer);
        Person kate = new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999);
        Person liza = new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000);
        Person georg = new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985);
        taxService.addNewTaxPayer(kate);
        taxService.addNewTaxPayer(liza);
        taxService.addNewTaxPayer(georg);
        System.out.println(kate);
        System.out.println("Get all database of Tax Service");
        System.out.println(taxService.getDatabase());
        System.out.println("Get info by Id");
        System.out.println(taxService.showByID(8022000));
        System.out.println("Show info by fine type");
        System.out.println(taxService.showByFineType(FineType.FINE181));
        System.out.println("Show by city");
        System.out.println(taxService.showByCity(City.Minsk));
        System.out.println(taxService.getInfoAboutTaxPayer(liza));
        taxService.deleteFineType(FineType.FINE181, 10091999);
        System.out.println(kate);
        taxService.addFineType(FineType.FINE1814, 8022000);
        System.out.println(liza);
        taxService.updateInfoAboutTaxPayer(8022000, City.Grodno, taxService.getDatabase());
        System.out.println(liza);
    }
}
