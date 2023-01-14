package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
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

    public int addBanknotes20(int number) {
        return numberBanknotes20 += number;
    }

    public int addBanknotes50(int number) {
        return numberBanknotes50 += number;
    }

    public int addBanknotes100(int number) {
        return numberBanknotes100 += number;
    }

    /*public boolean isPossibleIssue(int amount) {
        int amountBanknotes20 = getNumberBanknotes20();
        int amountBanknotes50 = getNumberBanknotes50();
        int amountBanknotes100 = getNumberBanknotes100();
        final int banknotes20 = 20;
        final int banknotes50 = 50;
        final int banknotes100 = 100;
        int counter=0;
        boolean check;
        int needSumma;
        int allSumma = banknotes20 * getNumberBanknotes20() + banknotes50 * getNumberBanknotes50() + banknotes100 * getNumberBanknotes100();
        if (allSumma < needSumma || needSumma % 10 != 0) {
            check = false;
        }else{
            if(needSumma>100 && amountBanknotes100>0){
                needSumma-=banknotes100;
                amountBanknotes100--;
            } else if (needSumma>50 && amountBanknotes50>0) {
                needSumma-=banknotes50;
                amountBanknotes50--;
            } else if (needSumma>20&& amountBanknotes20>0) {
                needSumma-=banknotes20;
                amountBanknotes20--;
            } else if (needSumma>0) {
                check= false;
            }
            check=true;
        }
        return check;
    }*/
}
