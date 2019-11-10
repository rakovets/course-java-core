package com.rakovets.course.challenge.classes;

public class Atm {
    private int nominalBanknote20;
    private int nominalBanknote50;
    private int nominalBanknote100;

    Atm(int nominalBanknote20, int nominalBanknote50, int nominalBanknote100){
        this.nominalBanknote20 = nominalBanknote20;
        this.nominalBanknote50 = nominalBanknote50;
        this.nominalBanknote100 = nominalBanknote100;
    }

    public void setNominalBanknote20(int nominalBanknote20) {
        this.nominalBanknote20 = this.nominalBanknote20 + nominalBanknote20;
    }

    public void setNominalBanknote50(int nominalBanknote50) {
        this.nominalBanknote50 = this.nominalBanknote50 + nominalBanknote50;
    }

    public void setNominalBanknote100(int nominalBanknote100) {
        this.nominalBanknote100 = this.nominalBanknote100 + nominalBanknote100;
    }

    public int getNominalBanknote20() {
        return nominalBanknote20;
    }

    public int getNominalBanknote50() {
        return nominalBanknote50;
    }

    public int getNominalBanknote100() {
        return nominalBanknote100;
    }

    //public int
}
