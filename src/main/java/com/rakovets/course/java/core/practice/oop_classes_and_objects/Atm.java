package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private int amount;

    final int BANKNOTE_100_VALUE = 100;
    final int BANKNOTE_50_VALUE = 50;
    final int BANKNOTE_20_VALUE = 20;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100){
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public String isPossibleIssue(int amount){
        if (amount % 20 == 0 || amount % 50 == 0 || amount % 100 == 0){
            return "You can get the requested amount";
        }else{
            return "You can't get the requested amount";
        }
    }

    public String getOptionsCombinationBanknotes(int amount) {
        int numberBanknotes100 = 0;
        int numberBanknotes50 = 0;
        int numberBanknotes20 = 0;
        if (amount >= BANKNOTE_100_VALUE){
            numberBanknotes100 = amount / BANKNOTE_100_VALUE;
            numberBanknotes50 = (amount - numberBanknotes100 * BANKNOTE_100_VALUE) / BANKNOTE_50_VALUE;
            numberBanknotes20 = ((amount - numberBanknotes100 * BANKNOTE_100_VALUE) - numberBanknotes50 * BANKNOTE_50_VALUE) / BANKNOTE_20_VALUE;
        } else if (amount >= BANKNOTE_50_VALUE) {
            numberBanknotes50 = amount / BANKNOTE_50_VALUE;
            numberBanknotes20 = (amount - numberBanknotes50 * BANKNOTE_50_VALUE) / BANKNOTE_20_VALUE;
        } else if (amount >= BANKNOTE_20_VALUE) {
            numberBanknotes20 = amount / BANKNOTE_20_VALUE;
        }
        return "Hundreds: " + numberBanknotes100 + ", fifties: " + numberBanknotes50 + ", twenties: " + numberBanknotes20;
    }
    public void addBanknotes20(int number){
        numberBanknotes20 += number;
    }
    public void addBanknotes50(int number){
        numberBanknotes50 += number;
    }
    public void addBanknotes100(int number){
        numberBanknotes100 += number;
    }
    public int getNumberBanknotes20(){
        return this.numberBanknotes20;
    }
    public int getNumberBanknotes50(){
        return this.numberBanknotes50;
    }
    public int getNumberBanknotes100(){
        return this.numberBanknotes100;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}


