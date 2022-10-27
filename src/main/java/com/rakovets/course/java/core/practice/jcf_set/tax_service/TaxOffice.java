package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.LinkedHashSet;
import java.util.Set;

public class TaxOffice {
    private Set<Taxpayer> taxpayers;

    public TaxOffice(Set<Taxpayer> taxpayers) {
        this.taxpayers = taxpayers;
    }

    public void addFine(int codIdTaxpayer, String fine) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getCodId() == codIdTaxpayer) {
                if (taxpayer.getFines().contains("No fines")) {
                    taxpayer.getFines().remove("No fines");
                }
                taxpayer.getFines().add(fine);
            }
        }
    }

    public void removeFine(int idCodTaxpayer, String fine) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getCodId() == idCodTaxpayer) {
                taxpayer.getFines().remove(fine);
                if (taxpayer.getFines().isEmpty()) {
                    taxpayer.getFines().add("No fines");
                }
            }
        }
    }

    public String showInfoByCodId(int codId) {
        String info = "Incorrect ID!";
        for (Taxpayer taxpayer : taxpayers) {
            if (codId == taxpayer.getCodId()) {
                info = taxpayer.toString();
            }
        }
        return info;
    }

    public Set<Taxpayer> showInfoByFine(String fineType) {
        Set<Taxpayer> info = new LinkedHashSet<>();
        for (Taxpayer taxpayer : taxpayers) {
            for (String fine : taxpayer.getFines()) {
                if (fine == fineType) {
                    info.add(taxpayer);
                }
            }
        }
        return info;
    }

    public Set<Taxpayer> showInfoByCity(String city) {
        Set<Taxpayer> info = new LinkedHashSet<>();
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getCity() == city) {
                info.add(taxpayer);
            }
        }
        return info;
    }
}
