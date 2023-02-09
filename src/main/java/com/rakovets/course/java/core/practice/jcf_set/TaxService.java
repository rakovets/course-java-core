package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Objects;

public class TaxService {
    private HashSet<Taxpayer> baseOfTaxpayers;

    public TaxService(HashSet<Taxpayer> baseOfTaxpayers) {
        this.baseOfTaxpayers = baseOfTaxpayers;
    }

    public void addNewTaxpayer(Taxpayer taxpayer) {
        baseOfTaxpayers.add(taxpayer);
    }

    public void addFineForTaxpayer(Fines typeFine, String idTaxpayer) {
        Fine fine = new Fine(typeFine);
        for (Taxpayer tax : baseOfTaxpayers) {
            if (tax.getId() == idTaxpayer) {
                fine.setUniqueNumber(idTaxpayer + '#' + typeFine);
                tax.getFine().add(fine);
            }
        }
    }

    public void removeFineForTaxpayer(String idTaxpayer, String idFine) {
        HashSet<Fine> fineNew = new HashSet<>();
        for (Taxpayer tax : baseOfTaxpayers) {
            if (tax.getId() == idTaxpayer) {
                for (Fine fine : tax.getFine()) {
                    if (!Objects.equals(fine.getUniqueNumber(), idFine)) {
                        fineNew.add(fine);
                    }
                }
                tax.setFine(fineNew);
            }
        }
    }

    public Taxpayer showTaxpayersById(String idTaxpayer) {
        Taxpayer wantedPeople = new Taxpayer();
        for (Taxpayer tax : baseOfTaxpayers) {
            if (tax.getId() == idTaxpayer) {
                wantedPeople = tax;
            }
        }
        return wantedPeople;
    }

    public HashSet<Taxpayer> showTaxpayersByFineType(Fines typeFine) {
        HashSet<Taxpayer> wantedPeople = new HashSet<>();
        for (Taxpayer tax : baseOfTaxpayers) {
            for (Fine fine : tax.getFine()) {
                if (fine.getTypeOfFine() == typeFine) {
                    wantedPeople.add(tax);
                }
            }
        }
        return wantedPeople;
    }

    public HashSet<Taxpayer> showTaxpayerByCity(Cities city) {
        HashSet<Taxpayer> wantedPeople = new HashSet<>();
        for (Taxpayer tax : baseOfTaxpayers) {
            if (tax.getCity() == city) {
                wantedPeople.add(tax);
            }
        }
        return wantedPeople;
    }

    public HashSet<Fine> showAllFines() {
        HashSet<Fine> finesSet = new HashSet<>();
        for (Taxpayer tax : baseOfTaxpayers) {
            finesSet.addAll(tax.getFine());
        }
        return finesSet;
    }

    public void updateTaxpayerInformation(String idTaxpayer, String firstName, String lastName, Cities city) {
        for (Taxpayer tax : baseOfTaxpayers) {
            if (tax.getId() == idTaxpayer) {
                tax.setFirstName(firstName);
                tax.setLastName(lastName);
                tax.setCity(city);
            }
        }
    }

    public void updateTaxpayerFine(String idFine, Fines type) {
        for (Taxpayer tax : baseOfTaxpayers) {
            for (Fine fine : tax.getFine()) {
                if (fine.getUniqueNumber() == idFine) {
                    fine.setTypeOfFine(type);
                }
            }
        }
    }

    public HashSet<Taxpayer> getBaseOfTaxpayers() {
        return baseOfTaxpayers;
    }
}
