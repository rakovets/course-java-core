package com.rakovets.course.java.core.practice.jcf_set;
import java.util.Set;

public class TaxSystem {
    private final Set<Taxman> taxmanSet;

    public TaxSystem(Set<Taxman> taxmanSet) {
        this.taxmanSet = taxmanSet;
    }

    public void addNewTaxman(Taxman taxman) {
        taxmanSet.add(taxman);
    }

    public void addNewTypeOfTax(int id, TypeOfTax typeOfTax, Taxman taxman) {
        if (id == taxman.getId()) {
            taxman.newTypeOfTax(typeOfTax);
        }
    }

    public String getDataSpecificIdentificationCode(Taxman taxman, int identificationCode) {
        if (identificationCode == taxman.getId()) {
            return taxman.toString();
        } else {
            return "No such number exists";
        }
    }

    public String getDataTypesOfTax(TypeOfTax typeOfTax) {
        StringBuilder sb = new StringBuilder();
        int tax;
        int id;
        for (Taxman taxman : taxmanSet) {
            if (typeOfTax.equals(TypeOfTax.Hard)) {
                tax = taxman.getTax();
                id = taxman.getId();
                sb.append(tax).append(" ").append(id).append(" ");
            } else {
                return "No such type of tax exists";
            }
        }
        return sb.toString();
    }
}
