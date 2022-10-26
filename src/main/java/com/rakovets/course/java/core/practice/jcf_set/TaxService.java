package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class TaxService {
    private Set<TaxPayer> taxPayersDataBase;
    private Set<Fine> finesDataBase;

    public TaxService(Set<TaxPayer> taxPayers, Set<Fine> fines) {
        this.taxPayersDataBase = taxPayers;
        this.finesDataBase = fines;
    }

    public void addNewTaxPayer(TaxPayer taxPayer) {
        taxPayersDataBase.add(taxPayer);
    }

    public void addNewFineTaxPayer(int idTaxPayer, Fine fine) {
        for (TaxPayer taxPayer : taxPayersDataBase) {
            if (taxPayer.getIdTaxPayer() == idTaxPayer) {
                taxPayer.addNewFine(fine);
            }
        }
    }

    public Set<TaxPayer> getTaxPayerByID(int idTaxPayer) {
        Set<TaxPayer> taxPayers = new HashSet<>();
        for (TaxPayer taxPayer : taxPayersDataBase) {
            if (taxPayer.getIdTaxPayer() == idTaxPayer) {
                taxPayers.add(taxPayer);
            }
        }
        return taxPayers;
    }

    public Set<TaxPayer> getTaxPayerFineTypes(Fine fineType) {
        Set<TaxPayer> taxPayers = new HashSet<>();
        for (TaxPayer taxPayer : taxPayersDataBase) {
            for (Fine fine : taxPayer.getFinesTaxPayer()) {
                if (fine.getTypeFine().equals(fineType)) {
                    taxPayers.add(taxPayer);
                }
            }
        }
        return taxPayers;
    }

    public Set<TaxPayer> getTaxPayerByCity(String city) {
        Set<TaxPayer> taxPayers = new HashSet<>();
        for (TaxPayer taxPayer : taxPayersDataBase) {
            if (taxPayer.getCity() == city) {
                taxPayers.add(taxPayer);
            }
        }
        return taxPayers;
    }

    public Set<TaxPayer> getDataBase() {
        return this.taxPayersDataBase;
    }

    public void updateInfoTaxPayer(int idTaxPayer, String city) {
        for (TaxPayer taxPayer : taxPayersDataBase) {
            if (taxPayer.getIdTaxPayer() == idTaxPayer) {
                taxPayer.setCity(city);
            }
        }
    }

    public void updateInfoFine(int fineId, int fineAmount) {
        for (Fine fine : finesDataBase) {
            if (fine.getFineId() == fineId) {
                fine.setFineAmount(fineAmount);
            }
        }
    }

    public void removeFine(Fine fine, int idTaxPayer) {
        for (TaxPayer taxPayer : taxPayersDataBase) {
            if (taxPayer.getIdTaxPayer() == idTaxPayer) {
                taxPayer.getFinesTaxPayer().remove(fine);
            }
        }
    }

    public Set<TaxPayer> getTaxPayers() {
        return taxPayersDataBase;
    }

    public Set<Fine> getFines() {
        return finesDataBase;
    }
}
