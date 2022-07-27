package com.rakovets.course.java.core.practice.jcf_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TaxServiceDemo {
    public static void main(String[] args) {
        SortedSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "Tony", "Montana", "Minsk"));
        personSet.add(new Person(2, "Ivan", "Ivanov", "Brest"));
        personSet.add(new Person(3, "Petr", "Petrov", "Vitebsk"));

        SortedSet<Fine> fineSet = new TreeSet<>();
        fineSet.add(new Fine(1,"Speeding", 1, true));
        fineSet.add(new Fine(2,"Robbery", 2, false));
        fineSet.add(new Fine(3,"Road accident", 2, true));

        TaxService taxService = new TaxService(personSet, fineSet);

        System.out.println("Person database: " + taxService.getPersonDataBase());
        System.out.println("Fine database: " + taxService.getFineDataBase());
        System.out.println("get person by id = 2: " + taxService.getPersonById(2));
        System.out.println("get person by not existing id: " + taxService.getPersonById(5));
        System.out.println("get fine by fine type 'Robbery': " + taxService.getFineByType("Robbery"));
        System.out.println("get person by city 'Brest': " + taxService.getPersonByCity("Brest"));
        System.out.println("get new person: " + taxService.getLastAddedPerson());
        System.out.println("get unpaid(new) fines for personId = 2: " + taxService.getPersonNewFines(2));
        taxService.deleteFineFromDatabaseById(3);
        System.out.println("fine with fineId = 3 removed: " + taxService.getFineDataBase());
        taxService.changePersonInformation(1, "Bob", "Smith", "London");
        System.out.println("Information about personId = 1 changed: " + taxService.getPersonDataBase());
        taxService.changePersonFineInformation(2, "Road accident", true);
        System.out.println("Information about person's fine with fineId = 2 changed: " + taxService.getFineDataBase());
    }
}
