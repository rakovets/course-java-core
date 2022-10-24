package com.rakovets.course.java.core.practice.jcf_list;

import java.util.LinkedHashSet;

public class TaxService {
    private LinkedHashSet<Person> database;

    public TaxService(LinkedHashSet<Person> database) {
        this.database = database;
    }

    public void addNewTaxPayer(Person taxPayer) {
        database.add(taxPayer);
    }

    public Person showByID(int id) {
        for (Person taxPayer : database) {
            if (taxPayer.getId() == id) {
                return taxPayer;
            }
        }
        return null;
    }

    public Person showByFineType(FineType fineType) {
        for (Person taxPayer : database) {
            if (taxPayer.getFineType() != null) {
                for (FineType fine : taxPayer.getFineType()) {
                    if (fine.equals(fineType)) {
                        return taxPayer;
                    }
                }
            }
        }
        return null;
    }

    public Person showByCity(City city) {
        for (Person taxPayer : database) {
            if (taxPayer.getCity().equals(city))
                return taxPayer;
        }
        return null;
    }

    public String getInfoAboutTaxPayer(Person taxPayer) {
        return taxPayer.toString();
    }

    public String getInfoAboutFinesOfPayer(Person taxPayer) {
        return taxPayer.getFineType().toString();
    }

    public LinkedHashSet<Person> getDatabase() {
        return database;
    }
}
