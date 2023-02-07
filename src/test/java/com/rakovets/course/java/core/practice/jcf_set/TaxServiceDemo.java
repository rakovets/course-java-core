package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.tax_service.Fine;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Fines;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Person;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.TaxService;

public class TaxServiceDemo {
    public static void main(String[] args) {
        Person dzmitryKrasiuk = new Person("Dzmitry", "Krasiuk", "Homiel");
        Person dzmitryRakovets = new Person("Dzmitry", "Rakovets", "Minsk");
        TaxService belarusianTaxes = new TaxService();

        belarusianTaxes.addPerson(dzmitryKrasiuk);
        belarusianTaxes.addPerson(dzmitryRakovets);
        belarusianTaxes.addFine(dzmitryKrasiuk, Fines.DRIVING, 15, "29.01.2023, Homiel, Lenin ave, " +
                "camera@116, breaking speed limit for 12 km/h");
        belarusianTaxes.addFine(dzmitryKrasiuk, Fines.DRIVING, 30, "31.01.2023, Homiel, Poleskaya st., " +
                "camera@93, breaking speed limit for 23 km/h");
        belarusianTaxes.addFine(dzmitryRakovets, Fines.ADMINISTRATIVE, 120, "06.01.2023, Minsk, Lenin " +
                "ave, Administrative fine");
        belarusianTaxes.addFine(dzmitryRakovets, Fines.DRIVING, 30, "27.01.2023, Minsk, 70 let BSSR st., "
                + "camera@201, breaking speed limit for 21 km/h");

        print(belarusianTaxes);

        System.out.println(belarusianTaxes.removeFine("DzmitryRakovets@0"));

        print(belarusianTaxes);
    }

    private static void print(TaxService taxService) {
        for (Person person : taxService.getPersonData()) {
            System.out.println(person.getName() + " " + person.getLastName() + ", " + person.getCity() + ": ");
            for (Fine fine : person.getFines()) {
                System.out.println(fine.getId() + " " + fine.getFineDetails() + ", " + fine.getSum() + "BYN");
            }
            System.out.println();
        }
    }
}
