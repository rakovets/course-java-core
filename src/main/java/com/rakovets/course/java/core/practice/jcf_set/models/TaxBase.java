package com.rakovets.course.java.core.practice.jcf_set.models;

import com.rakovets.course.java.core.practice.jcf_set.enums.CityName;
import com.rakovets.course.java.core.practice.jcf_set.enums.FineType;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TaxBase {
    private Set<Payer> taxBase;

    public TaxBase(Set<Payer> taxBase) {
        this.taxBase = taxBase;
    }

    public boolean addPayer(String payerId, String name_Surname, CityName cityName, String protocolId, FineType fineType) {
        return taxBase.add(new Payer(payerId, name_Surname, cityName, new HashSet<Fine>(List.of(new Fine(protocolId, fineType)))));
    }

    public boolean addFine(String payerId, String protocolId, FineType fineType) {
        boolean addFine = false;
        for (Payer p : taxBase) {
            if (p.getPayerId() == payerId) {
                addFine = p.getFines().add(new Fine(protocolId, fineType));
            }
        }
        return addFine;
    }

    public void showTaxBaseByPayerId(String payerId) {
        Set<Payer> payers = new HashSet<>();
        payers.addAll(taxBase);
        Iterator<Payer> iterator = payers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPayerId() != payerId) {
                iterator.remove();
            }
        }
        System.out.println(payers);
    }

    public void showTaxBaseByFineType(FineType fineType) {
        Set<Payer> payers = new HashSet<>();
        payers.addAll(taxBase);
        for (Payer p : payers) {
            Iterator<Fine>iterator = p.getFines().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getFineType() != FineType.FINE_1) {
                    iterator.remove();
                }
            }
        }
        System.out.println(payers);
    }

    public void showTaxBaseByCityName(CityName cityName) {
        Set<Payer> payers = new HashSet<>();
        payers.addAll(taxBase);
        Iterator<Payer> iterator = payers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCityName() != cityName) {
                iterator.remove();
            }
        }
        System.out.println(payers);
    }

    public void showAllTaxBase() {
        System.out.println(taxBase);
    }

    public void updatePayerId(String payerCurrentId, String payerNewId) {
        for (Payer p : taxBase) {
            if (p.getPayerId() == payerCurrentId) {
                p.setPayerId(payerNewId);
            }
        }
    }

    public void updatePayerSurname(String payerID, String newPayerSurname) {
        for (Payer p : taxBase) {
            if (p.getPayerId() == payerID) {
                p.setName_Surname(newPayerSurname);
            }
        }
    }

    public void updatePayerCityName(String payerID, CityName newCityName) {
        for (Payer p : taxBase) {
            if (p.getPayerId() == payerID) {
                p.setCityName (newCityName);
            }
        }
    }

    public void updatePayerFineType (String payerId, String protocolId, FineType newFineType) {
        for (Payer p : taxBase) {
            if (p.getPayerId() == payerId) {
                for (Fine f : p.getFines()) {
                    if (f.getProtocolId() == protocolId) {
                        f.setFineType(newFineType);
                    }
                }
            }
        }
    }

    public void updatePayerFineProtocolId (String payerId, String protocolId, String newProtocolId) {
        for (Payer p : taxBase) {
            if (p.getPayerId() == payerId) {
                for (Fine f : p.getFines()) {
                    if (f.getProtocolId() == protocolId) {
                        f.setProtocolId(newProtocolId);
                    }
                }
            }
        }
    }

    public void removeFine(String protocolId) {
        for (Payer p : taxBase) {
            Iterator<Fine>iterator = p.getFines().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getProtocolId() == protocolId) {
                    iterator.remove();
                }
            }
        }
    }

    public Set<Payer> getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(Set<Payer> taxBase) {
        this.taxBase = taxBase;
    }
}
