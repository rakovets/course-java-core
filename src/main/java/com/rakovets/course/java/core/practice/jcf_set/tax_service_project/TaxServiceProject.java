package com.rakovets.course.java.core.practice.jcf_set.tax_service_project;

import java.util.HashSet;

public class TaxServiceProject {
    private HashSet<Taxpayer> taxpayers;

    public TaxServiceProject() {
    }

    public TaxServiceProject(HashSet<Taxpayer> taxpayers) {
        this.taxpayers = taxpayers;
    }

    public void addNewTaxpayer(Taxpayer newTaxpayer) {
        taxpayers.add(newTaxpayer);
    }

    public void addFineForTaxpayer(int taxpayerId, String fineType) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayerId == taxpayer.getIdentificationNumber()) {
                taxpayer.getFinesType().add(fineType);
                taxpayer.setFineCounter(taxpayer.getFineCounter() + 1);
            }
        }
    }

    public Taxpayer getTaxpayerInfoById(int taxpayerId) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayerId == taxpayer.getIdentificationNumber()) {
                return taxpayer;
            }
        }
        return null;
    }

    public Taxpayer getTaxpayerInfoByFineType(String fineType) {
        for (Taxpayer taxpayer : taxpayers) {
            for (String fine : taxpayer.getFinesType()) {
                if (fineType.equals(fine)) {
                    return taxpayer;
                }
            }
        }
        return null;
    }

    public Taxpayer getTaxpayerInfoByCity(String city) {
        for (Taxpayer taxpayer : taxpayers) {
            if (city.equals(taxpayer.getCity())) {
                return taxpayer;
            }
        }
        return null;
    }

    public void updateTaxpayerInfo(int taxpayerId, String city) {
        Taxpayer taxpayer = getTaxpayerInfoById(taxpayerId);
        taxpayer.setCity(city);
    }

    public void updateTaxpayerFineInfo(int taxpayerId, int fineCounter, HashSet<String> finesType) {
        Taxpayer taxpayer = getTaxpayerInfoById(taxpayerId);
        taxpayer.setFineCounter(fineCounter);
        taxpayer.setFinesType(finesType);
    }

    public void removeFineForTaxpayer(int taxpayerId, String fineType) {
        Taxpayer taxpayer = getTaxpayerInfoById(taxpayerId);
        taxpayer.getFinesType().remove(fineType);
        taxpayer.setFineCounter(taxpayer.getFineCounter() - 1);
    }

    public void showInfo(Taxpayer taxpayer) {
        System.out.println(taxpayer);
    }

    public void showAllInfo(HashSet<Taxpayer> taxpayers) {
        for (Taxpayer taxpayer : taxpayers) {
            System.out.println(taxpayers);

        }
    }
}
