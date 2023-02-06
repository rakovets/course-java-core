package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.tax_service.Fine;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Person;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.TaxService;

public class TaxServiceDemo {
    public static void main(String[] args) {
        Fine fineForWrongParking = new Fine("Fine for wrong parking", 40);
        Fine fineForBreakingSpeedLimit = new Fine("Fine for breaking speed limit", 120);
        Fine fineForDrivingDrunk = new Fine("Fine for driving drunk", 5000);
        Person dzmitryRakovets = new Person("Dzmitry", "Rakovets", "Minsk");
        Person alexanderKrasiuk = new Person("Alex", "Krasiuk", "Homiel");
        Person evgeniyVolosov = new Person("Evgeniy", "Volosov", "Homiel");
        Person juliaVolosova = new Person("Julia", "Volosova", "Homiel");
        TaxService belarusTaxData = new TaxService();

        belarusTaxData.addPerson(dzmitryRakovets);
        belarusTaxData.addPerson(alexanderKrasiuk);
        belarusTaxData.addPerson(evgeniyVolosov);
        belarusTaxData.addPerson(juliaVolosova);

        dzmitryRakovets.addFine(fineForBreakingSpeedLimit);
        dzmitryRakovets.addFine(fineForWrongParking);
        alexanderKrasiuk.addFine(fineForWrongParking);
        evgeniyVolosov.addFine(fineForDrivingDrunk);
        juliaVolosova.addFine(fineForBreakingSpeedLimit);

        print(belarusTaxData);


    }

    static void print(TaxService taxService) {
        for (Person person : taxService.getPersonData()) {
            System.out.print("\n" + person.getCity() + " city - " + person.getName() + " " + person.getLastName()
                    + ": ");
            for (Fine fine : person.getFines()) {
                System.out.printf("\n" + fine.getFineName() + ", sum " + fine.getSum() + " BYN. Id is "
                        + fine.getHashCode());
            }
            System.out.println();
        }
    }
}

