package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaxService {
    private Set<Taxpayer> taxpayerSet;

    public TaxService(Set<Taxpayer> taxpayerSet) {
        this.taxpayerSet = taxpayerSet;
    }

    public void addTaxpayer(Taxpayer taxpayer) {
        taxpayerSet.add(taxpayer);
    }

    public void addFineToTaxpayer(int taxpayerId, Fine fine) {
        for (Taxpayer taxpayer : taxpayerSet) {
            if (taxpayer.getId() == taxpayerId) {
                taxpayer.addToFineSet(fine);
            }
        }
    }

    public String getInformationForId(int taxpayerId) {
        String result = "No information";
        for (Taxpayer taxpayer : taxpayerSet) {
            if (taxpayer.getId() == taxpayerId) {
                result = taxpayer.toString() + taxpayer.getFineSet().toString();
            }
        }
        return result;
    }

    public Set<Taxpayer> getInformationForTypeOfFine(FineTypes type) {
        Set<Taxpayer> hasThisFineType = new HashSet<>();
        for (Taxpayer taxpayer : taxpayerSet) {
            for (Fine fine : taxpayer.getFineSet()) {
                if (fine.getType().equals(type)) {
                    hasThisFineType.add(taxpayer);
                }
            }
        }
        return hasThisFineType;
    }

    public Set<Taxpayer> getInformationForCity(City city) {
        Set<Taxpayer> result = new HashSet<>();
        for (Taxpayer taxpayer : taxpayerSet) {
            if (taxpayer.getCity().equals(city)) {
                result.add(taxpayer);
            }
        }
        return result;
    }

    public Set<Taxpayer> getTaxpayerSet() {
        return taxpayerSet;
    }

    public void changeTaxpayerCity(int taxpayerId, City city) {
        for (Taxpayer taxpayer : taxpayerSet) {
            if (taxpayer.getId() == taxpayerId) {
                taxpayer.setCity(city);
            }
        }
    }

    public void changeTaxpayerFine(int taxpayerId, int fineNumber, FineTypes fineType) {
        for (Taxpayer taxpayer : taxpayerSet) {
            if (taxpayer.getId() == taxpayerId) {
                for (Fine fine : taxpayer.getFineSet()) {
                    if (fine.getFineNumber() == fineNumber) {
                        fine.setType(fineType);
                    }
                }
            }
        }
    }

    public void deleteTaxpayerFine(int taxpayerId, int fineNumber) {
        Iterator<Fine> fineIterator;
        for (Taxpayer taxpayer : taxpayerSet) {
            if (taxpayer.getId() == taxpayerId) {
                fineIterator = taxpayer.getFineSet().iterator();
                while (fineIterator.hasNext()) {
                    if (fineIterator.next().getFineNumber() == fineNumber) {
                        fineIterator.remove();
                    }
                }
            }
        }
    }
}
