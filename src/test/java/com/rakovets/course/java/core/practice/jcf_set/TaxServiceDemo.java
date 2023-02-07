package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.tax_service.Fine;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Fines;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Person;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.TaxService;

public class TaxServiceDemo {
    public static void main(String[] args) {
        Person dzmitry = new Person("Dzmitry", "Krasiuk", "Homiel");
        TaxService belarusianTaxes = new TaxService();

        belarusianTaxes.addPerson(dzmitry);
        belarusianTaxes.addFine(dzmitry, Fines.DRIVING, 15, "29.01.2023, Homiel, Lenin ave, camera@116," +
                " breaking speed limit for 12 km/h");
        belarusianTaxes.addFine(dzmitry, Fines.DRIVING, 30, "31.01.2023, Homiel, Poleskaya st., " +
                "camera@93, breaking speed limit for 22 km/h");

        print(belarusianTaxes);
    }

    static void print(TaxService taxService) {
        for (Person person : taxService.getPersonData()) {
            System.out.println(person.getName() + " " + person.getLastName() + ", " + person.getCity() + ": ");
            for (Fine fine : person.getFines()) {
                System.out.println(fine.getId() + " " + fine.getFineDetails() + " " + fine.getSum() + "BYN");
            }
        }
        System.out.println();
    }
}
