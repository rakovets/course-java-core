package com.rakovets.course.java.core.practice.jcf_set.project_taxservice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaxService {
    private Set<Taxpayer> taxpayers;

    public TaxService(Set<Taxpayer> taxpayers) {
        this.taxpayers = taxpayers;
    }

    public void addTaxpayer(Taxpayer taxpayer) {
        taxpayers.add(taxpayer);
    }

    public void addTaxpayerFine(int identificationCode, Fine fine) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getIDENTIFICATION_CODE() == identificationCode) {
                taxpayer.addTaxpayerFine(fine);
            }
        }
    }

    public String showTaxpayerInfoId(int identificationCode) {
        String infoMessage = "There is no such identification code";
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getIDENTIFICATION_CODE() == identificationCode) {
                infoMessage = taxpayer.toString();
            }
        }
        return infoMessage;
    }

    public Set<Taxpayer> showInfoTaxpayerFineTypes(FineTypes fineType) {
        Set<Taxpayer> taxpayerFineTypes = new HashSet<>();

        for (Taxpayer taxpayer : taxpayers) {
            for (Fine fine : taxpayer.getListFines()) {
                if (fine.getFineType().equals(fineType)) {
                    taxpayerFineTypes.add(taxpayer);
                }
            }
        }
        return taxpayerFineTypes;
    }

    public Set<Taxpayer> showInfoTaxpayerCity(TaxpayerCity city) {
        Set<Taxpayer> taxpayerCity = new HashSet<>();

        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getCity().equals(city)) {
                taxpayerCity.add(taxpayer);
            }
        }
        return taxpayerCity;
    }

    public Set<Taxpayer> showInfoTaxpayerAll() {
        return this.taxpayers;
    }

    public void removeTaxpayerFine(int identificationCode, int fineId) {
        Iterator<Fine> fine;

        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getIDENTIFICATION_CODE() == identificationCode) {
                fine = taxpayer.getListFines().iterator();
                while (fine.hasNext()) {
                    if (fine.next().getFineId() == fineId) {
                        fine.remove();
                    }
                }
            }
        }
    }

    public void updateTaxpayerCity(int identificationCode, TaxpayerCity city) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getIDENTIFICATION_CODE() == identificationCode) {
                taxpayer.setCity(city);
            }
        }
    }

    public void updateTaxpayerFine(int identificationCode, int fineId, FineTypes fineType) {
        for (Taxpayer taxpayer : taxpayers) {
            if (taxpayer.getIDENTIFICATION_CODE() == identificationCode) {
                Set<Fine> fines = taxpayer.getListFines();
                for (Fine fine : fines) {
                    if (fine.getFineId() == fineId) {
                        fine.setFineType(fineType);
                    }
                }
            }
        }
    }
}
