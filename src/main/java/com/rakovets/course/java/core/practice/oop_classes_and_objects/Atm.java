package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private int isPossibleIssue;


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

    public void isPossibleIssue(int isPossibleIssue) {
        this.isPossibleIssue = numberBanknotes20 * 20 + numberBanknotes50 * 50 + numberBanknotes100 * 100;
    }
}
class Customer {
    private int customer;

    public Customer(int customer) {
        if (customer < 0) {
            System.out.println("Please, enter value > 20");
            return;
        } else {
            this.customer = customer;
        }
    }

    public int getСustomer() {
        return customer;
    }
}
