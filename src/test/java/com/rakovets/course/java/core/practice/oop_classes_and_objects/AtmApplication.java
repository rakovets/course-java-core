package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class AtmApplication {
    public static void main(String[] args) {
        Atm atm = new Atm(2, 3, 5);
        Customer customer = new Customer(5000);
        if (customer > isPossibleIssue()) {
            System.out.println("Please, enter the amount less");
        }
    }
}
