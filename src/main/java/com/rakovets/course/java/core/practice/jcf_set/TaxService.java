package com.rakovets.course.java.core.practice.jcf_set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

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

    public List<Person> showByFineType(FineType fineType) {
        List<Person> listOfTaxPayer = new ArrayList<>();
        for (Person taxPayer : database) {
            if (taxPayer.getFineType() != null) {
                for (FineType fine : taxPayer.getFineType()) {
                    if (fine.equals(fineType)) {
                        listOfTaxPayer.add(taxPayer);
                    }
                }
            }
        }
        return listOfTaxPayer;
    }

    public List<Person> showByCity(City city) {
        List<Person> listOfTaxPayer = new ArrayList<>();
        for (Person taxPayer : database) {
            if (taxPayer.getCity().equals(city))
                listOfTaxPayer.add(taxPayer);
        }
        return listOfTaxPayer;
    }

    public Person getInfoAboutTaxPayer(Person taxPayer) {
        for (Person payer : database) {
            if (payer.equals(taxPayer)) {
                return taxPayer;
            }
        }
        return null;
    }

    public String getInfoAboutFinesOfPayer(Person taxPayer) {
        return taxPayer.getFineType().toString();
    }

    public LinkedHashSet<Person> getDatabase() {
        return database;
    }
}
