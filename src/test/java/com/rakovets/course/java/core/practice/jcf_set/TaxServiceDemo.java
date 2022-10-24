package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_list.City;
import com.rakovets.course.java.core.practice.jcf_list.FineType;
import com.rakovets.course.java.core.practice.jcf_list.Person;
import com.rakovets.course.java.core.practice.jcf_list.TaxService;

import java.util.*;

public class TaxServiceDemo {
    public static void main(String[] args) {
        LinkedHashSet<Person> taxPayer = new LinkedHashSet<>();
        TaxService taxService = new TaxService(taxPayer);
        Person kate = new Person("Kate Komleva", City.Minsk, List.of(FineType.FINE181, FineType.FINE1811),10091999);
        Person liza = new Person("Liza Benitsrvich", City.Grodno, List.of(FineType.FINE1812),8022000);
        Person georg = new Person("Georg Shpendel", City.Mogilev, List.of(FineType.FINE181, FineType.FINE1815, FineType.FINE1814),23041985);
        taxService.addNewTaxPayer(kate);
        taxService.addNewTaxPayer(liza);
        taxService.addNewTaxPayer(georg);
        System.out.println(kate);
        System.out.println(taxService.getDatabase());

    }
}
