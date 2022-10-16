package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    public int numberBanknotes20;
    public int numberBanknotes50;
    public int numberBanknotes100;
    public int totalamoung = numberBanknotes20 * 20 + numberBanknotes50 * 50 + numberBanknotes100 * 100;
    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public int addBanknotes20(int numberBanknotes20) {
        return this.numberBanknotes20 += numberBanknotes20;
    }
    public int addBanknotes50(int numberBanknotes50) {
        return this.numberBanknotes50 += numberBanknotes50;
    }
    public int addBanknotes100(int numberBanknotes100) {
        return this.numberBanknotes100 += numberBanknotes100;
    }
    public boolean isPossibleIssue(int amount) {
        return amount <= totalamoung;
    }
        public int getNumberBanknotes20(int numberBanknotes20) {
            return numberBanknotes20;
        }

        public int getNumberBanknotes50(int numberBanknotes50) {
            return numberBanknotes50;
        }

        public int getNumberBanknotes100(int numberBanknotes100) {
            return numberBanknotes100;
        }
    }

