package com.rakovets.course.java.core.practice.jcf_set;

import java.util.*;

public class TaxServiceDemo {
    public static void main(String[] args) {
        LinkedHashSet<Person> taxPayer = new LinkedHashSet<>();
        TaxService taxService = new TaxService(taxPayer);
        Person kate = new Person("Kate Komleva", City.Minsk, List.of(FineType.FINE181, FineType.FINE1811), 10091999);
        Person liza = new Person("Liza Benitsrvich", City.Minsk, List.of(FineType.FINE1812), 8022000);
        Person georg = new Person("Georg Shpendel", City.Mogilev, List.of(FineType.FINE181, FineType.FINE1815, FineType.FINE1814), 23041985);
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
        taxService.addFineType(FineType.FINE1814, 8022000);
        System.out.println(liza);
    }
}
