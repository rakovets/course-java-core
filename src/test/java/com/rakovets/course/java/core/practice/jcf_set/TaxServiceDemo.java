package com.rakovets.course.java.core.practice.jcf_set;

import java.util.*;

public class TaxServiceDemo {
    public static void main(String[] args) {
        SortedSet<Citizen> citizensDatabase = new TreeSet<>();
        citizensDatabase.add(new Citizen("Ivan", "Ivanov", "Minsk", 1958, 1));
        citizensDatabase.add(new Citizen("Petr", "Petrov", "Grodno", 1963, 2));
        citizensDatabase.add(new Citizen("Inna", "Sviridova", "Vitebsk", 1970, 3));
        citizensDatabase.add(new Citizen("Tom", "Cat", "Brest", 1981, 4));
        citizensDatabase.add(new Citizen("Sergej", "Smirnov", "Gomel", 1983, 5));
        citizensDatabase.add(new Citizen("Stepan", "Petrov", "Mogilev", 1985, 6));
        citizensDatabase.add(new Citizen("Suleiman", "Nurdov", "Baranovichi", 1989, 7));
        citizensDatabase.add(new Citizen("Ivona", "Helestova", "Gomel", 1990, 8));
        citizensDatabase.add(new Citizen("Anna", "Semenovich", "Minsk", 1995, 9));
        citizensDatabase.add(new Citizen("Olga", "Maximova", "Grodno", 2000, 10));
        citizensDatabase.add(new Citizen("Alex", "Alexandrov", "Brest", 2022, 11));

        SortedSet<Fine> finesDatabase = new TreeSet<>();
        finesDatabase.add(new Fine(1.1, "tax ticket", 20.7, false, 10, 1));
        finesDatabase.add(new Fine(1.5, "speed ticket", 10.1, false, 1, 2));
        finesDatabase.add(new Fine(1.5, "speed ticket", 10.1, false, 2, 3));
        finesDatabase.add(new Fine(1.3, "pedestrian ticket", 15.5, false, 3, 4));
        finesDatabase.add(new Fine(1.1, "tax ticket", 20.7, false, 1, 5));

        TaxService taxService = new TaxService(citizensDatabase, finesDatabase);

        System.out.println("All citizens from database: " + taxService.getCitizens());
        System.out.println("Citizen by id: " + taxService.getCitizenById(2));
        System.out.println("All citizens with fine article: " + taxService.getCitizensByFineArticle(1.5));
        System.out.println("All citizens from city: " + taxService.getCitizensByCity("Grodno"));
        System.out.println("New citizen in database: " + taxService.getLastCitizen());
        System.out.println("New fine in database: " + taxService.getLastFine());
        System.out.println("All fines for citizen: " + taxService.getFinesByCitizenId(1));

        taxService.removeFineById(5);
        System.out.println("All fines for citizen after remove fine: " + taxService.getFinesByCitizenId(1));

        taxService.changeCitizenLocationCity(11, "Grodno");
        System.out.println("Citizen by id after changed local city: " + taxService.getCitizenById(11));

        taxService.changeFinePaid(3, true);
        System.out.println("Fine after changed paid status: " + taxService.getFineById(3));
    }
}
