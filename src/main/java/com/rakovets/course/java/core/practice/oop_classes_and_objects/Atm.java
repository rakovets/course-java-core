package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm (int numberBanknotes20, int numberBanknotes50, int numberBanknotes100){
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public String isPossibleIssue( int amount){
        if (amount % 20 == 0 || amount % 50 == 0 || amount % 100 == 0){
            return "You can get the requested amount";
        } else{
            return "You can not get the requested amount";
        }
    }
    public int addBanknotes20(int number){
        return numberBanknotes20 += number;
    }
    public int addBanknotes50(int number){
        return numberBanknotes50 += number;
    }
    public int addBanknotes100(int number){
        return numberBanknotes100 += number;
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
}
