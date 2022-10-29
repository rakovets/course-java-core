package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.Enum.City;
import com.rakovets.course.java.core.practice.jcf_set.Enum.FineType;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class TaxService {
    private final HashSet<Taxpayer> taxpayerDataBase;

    public TaxService(HashSet<Taxpayer> taxpayerData) {
        this.taxpayerDataBase = taxpayerData;
    }

    public void addNewTaxpayer(Taxpayer taxpayer) {
         this.taxpayerDataBase.add(taxpayer);
    }


    public Taxpayer showInfById(int id) {
        Taxpayer result = null;
        for (Taxpayer taxpayer : taxpayerDataBase) {
            if (taxpayer.getId() == id) {
                result = taxpayer;
            }
        }
        return result;
    }

    public Set<Taxpayer> showInfByFineType(FineType fineType) {
        Set<Taxpayer> taxpayersFineTypes = new LinkedHashSet<>();
        for (Taxpayer taxpayer : taxpayerDataBase) {
            for (Fine fine : taxpayer.getFine()) {
                if (fine.getFineType() == fineType) {
                    taxpayersFineTypes.add(taxpayer);
                }
            }
        }
        return taxpayersFineTypes;
    }

    public Set<Taxpayer> showInfByCity(City city) {
        Set<Taxpayer> taxpayersCityName = new LinkedHashSet<>();
        for (Taxpayer taxpayer : taxpayerDataBase) {
            if (taxpayer.getCity().equals(city)) {
                taxpayersCityName.add(taxpayer);
            }
        }
        return taxpayersCityName;
    }

    public Set<Taxpayer> showAllInf() {
        return taxpayerDataBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxService that = (TaxService) o;
        return Objects.equals(taxpayerDataBase, that.taxpayerDataBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxpayerDataBase);
    }
}
