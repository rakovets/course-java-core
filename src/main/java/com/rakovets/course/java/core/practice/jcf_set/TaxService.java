package com.rakovets.course.java.core.practice.jcf_set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class TaxService {
    private final LinkedHashSet<Person> database;

    public TaxService(LinkedHashSet<Person> database) {
        this.database = database;
    }

    public void addNewTaxPayer(Person taxPayer) {
        database.add(taxPayer);
    }

    public void addFineType(FineType fine, int idTaxPayer) {
        for (Person person : database) {
            if (person.getId() == idTaxPayer) {
                person.getFineType().add(fine);
            }
        }
    }

    public void deleteFineType(FineType fine, int idTaxPayer) {
        for (Person person : database) {
            if (person.getId() == idTaxPayer) {
                person.getFineType().remove(fine);
            }
        }
    }

    public void updateInfoAboutTaxPayer(int idTaxPayer, City city, LinkedHashSet<Person> database) {
        for (Person person : database) {
            if (person.getId() == idTaxPayer) {
                person.setCity(city);
            }
        }
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

    public List getInfoAboutFinesOfPayer(Person taxPayer) {
        return taxPayer.getFineType();
    }

    public LinkedHashSet<Person> getDatabase() {
        return database;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxService taxService = (TaxService) o;
        return database == taxService.database;
    }

    @Override
    public int hashCode() {
        return Objects.hash(database);
    }
}
