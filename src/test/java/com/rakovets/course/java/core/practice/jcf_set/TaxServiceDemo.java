package com.rakovets.course.java.core.practice.jcf_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TaxServiceDemo {
    public static void main(String[] args) throws Exception {
        SortedSet<Person> citizensDatabase = new TreeSet<>();
        Person citizen1 = new Person("Vin", "Disel", 35, "New York", 1);
        Person citizen2 = new Person("Yegor", "Kharitonchik", 19, "Zhodino", 2);
        Person citizen3 = new Person("Anna", "Lubava", 27, "Minsk", 3);

        citizensDatabase.add(citizen1);
        citizensDatabase.add(citizen2);
        citizensDatabase.add(citizen3);

        SortedSet<Fine> finesDatabase = new TreeSet<>();
        Fine fine1 = new Fine(1.2, "tax ticket", 10.4, 1, 1);
        Fine fine2 = new Fine(1.5, "speed ticket", 4.1, 2, 2);
        Fine fine3 = new Fine(1.5, "speed ticket", 4.1, 3, 3);
        finesDatabase.add(fine1);
        finesDatabase.add(fine2);
        finesDatabase.add(fine3);

        TaxService taxService = new TaxService(citizensDatabase, finesDatabase);

        System.out.println("All citizens from database: " + taxService.getPersons());
        try {
            System.out.println("Citizen by id: " + taxService.getInfoPersonById(2));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        try {
            System.out.println("All citizens with fine article: " + taxService.getInfoPersonByFineArticle(1.5));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        System.out.println("All citizens from city: " + taxService.getInfoPersonByCity("Zhodino"));
        System.out.println("New citizen in database: " + taxService.getLastPerson());
        System.out.println("New fine in database: " + taxService.getLastFine());
        System.out.println("All fines for citizen: " + taxService.getInfoFinesByPersonId(1));

        taxService.deleteFine(citizen1, fine1);
        System.out.println("All fines for citizen after remove fine: " + taxService.getInfoFinesByPersonId(1));

        taxService.changeInformationAboutPerson(citizen2,"Lola", "Nikola", "Grodno", 20);
        try {
            System.out.println("Citizen by id after changed local city: " + taxService.getInfoPersonById(20));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
