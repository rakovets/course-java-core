package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20,int numberBanknotes50,int numberBanknotes100) {
        this.numberBanknotes20=numberBanknotes20;
        this.numberBanknotes50=numberBanknotes50;
        this.numberBanknotes100=numberBanknotes100;
    }
    public int addBanknotes20(int number) {
       return numberBanknotes20 = numberBanknotes20+number;
    }
    public int addBanknotes50(int number) {
       return   numberBanknotes50 = numberBanknotes50+number;
    }
    public int addBanknotes100(int number) {
      return  numberBanknotes100 = numberBanknotes100+number;
    }
    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }
    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }
    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }
    public String isPossibleIssue(int amount) {
        int banknotes20inAtm=numberBanknotes20;
        int banknotes50inAtm=numberBanknotes50;
        int banknotes100inAtm=numberBanknotes100;
        int sumAmountBanknotesInAtm = 20 * banknotes20inAtm + 50 * banknotes50inAtm + 100 * banknotes100inAtm;
        String result;
        if (sumAmountBanknotesInAtm < amount) {
            result = "\nDon`t have enough money!!!!";
        } else {
            int issueBanknotes100 = amount / 100;
            int issueBanknotes50 = (amount -issueBanknotes100 * 100) / 50;
            int issueBanknotes20 = (amount -issueBanknotes100 * 100 -issueBanknotes50 * 50 ) /20;
            int riseOfTheMachines = amount %20;
            result = "\nTo issue \n100: " + issueBanknotes100 + "\n50: " + issueBanknotes50 + "\n20: " +issueBanknotes20 +
            "\nRise of the Machines:" + riseOfTheMachines;
        }
        return result;
    }
}
