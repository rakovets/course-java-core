package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20,int numberBanknotes50,int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public void addBanknotes20(int number) {
       numberBanknotes20 = numberBanknotes20 + number;
    }
    public int addBanknotes50(int number) {
       return   numberBanknotes50 = numberBanknotes50 + number;
    }
    public int addBanknotes100(int number) {
      return  numberBanknotes100 = numberBanknotes100 + number;
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
        int banknotes20inAtm = numberBanknotes20;
        int banknotes50inAtm = numberBanknotes50;
        int banknotes100inAtm = numberBanknotes100;
        int sumAmountBanknotesInAtm = 20 * banknotes20inAtm + 50 * banknotes50inAtm + 100 * banknotes100inAtm;
        String result = "";
        if (sumAmountBanknotesInAtm < amount) {
            result = "\nDon`t have enough money!!!!";
        } else {
            while (amount > 0 && banknotes100inAtm > 0) {
                amount -= 100;
                banknotes100inAtm--;
            }
            if (amount < 0) {
                amount += 100;
                banknotes100inAtm++;
            }
            while (amount > 0 && banknotes50inAtm > 0) {
                amount -= 50;
                banknotes50inAtm--;
            }
            if (amount < 0) {
                amount += 50;
                banknotes50inAtm++;
            }
            while (amount > 0 && banknotes20inAtm > 0) {
                amount -= 20;
                banknotes20inAtm--;
            }
            if (amount < 0) {
                amount += 20;
                banknotes20inAtm++;
            }
            int riseOfTheMachines = amount %20;

            result = "\nTo issue \n100: " + (numberBanknotes100 - banknotes100inAtm) + "\n50: " + (numberBanknotes50 - banknotes50inAtm) +
                     "\n20: " + (numberBanknotes20 - banknotes20inAtm) +"\nRise of the Machines: " + riseOfTheMachines +
                      "\nRemains \n100: " + banknotes100inAtm + "\n50: " + banknotes50inAtm + "\n20: " + banknotes20inAtm + "\n";
        }
        return result;
    }

    public String getCash(int banks100, int banks50, int banks20) {
        String sumManey = "";
        int banknotes20inAtm = numberBanknotes20;
        int banknotes50inAtm = numberBanknotes50;
        int banknotes100inAtm = numberBanknotes100;
        if (banknotes100inAtm - banks100 > 0) {
            banknotes100inAtm -= banks100;
        } else {
            sumManey += "Don`t have 100\n";
        }
        if (banknotes50inAtm - banks50 > 0) {
            banknotes50inAtm -= banks50;
        } else {
            sumManey += "Don`t have 50\n";
        }
        if (banknotes20inAtm - banks20 > 0) {
            banknotes20inAtm -= banks20;
        } else {
            sumManey += "Don`t have 20\n";
        }
        sumManey +=  "To issue " + ((numberBanknotes20 - banknotes20inAtm) * 20 + (numberBanknotes50 - banknotes50inAtm) * 50 + (numberBanknotes100 - banknotes100inAtm) * 100);
        return sumManey;
    }
}
