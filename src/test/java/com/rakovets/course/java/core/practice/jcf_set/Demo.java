package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.List;

import static com.rakovets.course.java.core.practice.jcf_set.enum_set.CityEnum.*;
import static com.rakovets.course.java.core.practice.jcf_set.enum_set.FineTypeEnum.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        HashSet<Fine> finesDB = new HashSet<>();
        Fine payment = new Fine(1, NON_PAYMENT, 32);
        Fine tax = new Fine(2, TAX, 64);
        Fine delay = new Fine(3, PAYMENT_DELAY, 16);
        Fine pen = new Fine(4, PENALTY, 32);
        Fine late = new Fine(5, LATE_PAYMENT, 64);
        Fine pen2 = new Fine(6, PENALTY, 32);
        Fine late2 = new Fine(7, LATE_PAYMENT, 64);
        Fine tax2 = new Fine(8, TAX, 64);
        Fine delay2 = new Fine(9, PAYMENT_DELAY, 16);
        finesDB.add(payment);
        finesDB.add(tax);
        finesDB.add(delay);
        finesDB.add(pen);
        finesDB.add(late);
        HashSet<Person> peopleDB = new HashSet<>();
        Person ivan = new Person(new HashSet<>(List.of(new Fine(1, NON_PAYMENT, 32), new Fine(2, TAX, 64))),
                "Ivan Ivanov", 123456889, BREST);
        Person sveta = new Person(new HashSet<>(List.of(new Fine(3, PAYMENT_DELAY, 16))), "Sveta Svetik", 132435465, MINSK);
        Person alex = new Person(new HashSet<>(List.of(new Fine(4, NON_PAYMENT, 32))), "Alex Pushkin", 987654321, GOMEL);
        Person misha = new Person(new HashSet<>(List.of(new Fine(5, LATE_PAYMENT, 64))), "Michail Petrov", 132435466, MINSK);
        Person kot = new Person(new HashSet<>(List.of(new Fine(6, PENALTY, 64))), "Kot Koteykin", 756453434, GRODNO);
        Person slava = new Person(new HashSet<>(List.of(new Fine(7, NON_PAYMENT, 64))), "Slava Slavochkin", 132435460, MINSK);
        Person max = new Person(new HashSet<>(List.of(new Fine(8, TAX, 128))), "Maksim Maksimov", 766443434, MOGILEV);
        Person slav = new Person(new HashSet<>(List.of(new Fine(9, PAYMENT_DELAY, 32))), "Slav Slavochkin", 132435469, VITEBSK);
        peopleDB.add(ivan);
        peopleDB.add(sveta);
        peopleDB.add(alex);
        peopleDB.add(misha);
        peopleDB.add(kot);
        peopleDB.add(slava);
        peopleDB.add(max);
        peopleDB.add(slav);
        TaxService taxService = new TaxService(peopleDB);
        System.out.println("Show all information for TaxService:");
        System.out.println(taxService.showAll());
        System.out.println("-------------------------------------------------------------------------------------------");
        taxService.addNewPerson(new Person(new HashSet<>(finesDB), "Kot Kochkin", 121234567, VITEBSK));
        System.out.println("Show all information for TaxService with new Person:");
        System.out.println(taxService.showAll());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Show data by City:");
        System.out.println(taxService.getPersonByCity(MINSK));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Show data by personalIdCod:");
        System.out.println(taxService.getPersonById(756453434));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Show data by typeFine");
        System.out.println(taxService.getFinesByType(PAYMENT_DELAY));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Add new fine for an existing Person");
        Fine fine = new Fine(10, LATE_PAYMENT, 64);
        slav.addNewFineForExistPerson(fine, peopleDB);
        System.out.println(taxService.showAll());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Delete new fine");
        slav.deleteFineFromDatabaseById(fine.getIdFine(), peopleDB);
        System.out.println(taxService.showAll());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Updating taxpayer information");
        System.out.println(slav.updatePersonInformation(132435469, MINSK, peopleDB));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Show data by City" + taxService.getPersonByCity(MINSK));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Updating information on taxpayer fines");
        System.out.println(slav.updateFineInformation(9, TAX, 128, peopleDB));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Show data by typeFine" + taxService.getFinesByType(TAX));
    }
}
