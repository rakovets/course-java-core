package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_4;

public class TestAtm {
    public static void main(String[] args) {
        Atm sberbank = new Atm(10,30, 40);
        sberbank.isPossibleIssue(5000);
        sberbank.getNumberBanknotes20();
        sberbank.getNumberBanknotes50();
        sberbank.getNumberBanknotes100();
        sberbank.setNumberBanknotes20(50);
        sberbank.setNumberBanknotes20(500);
        sberbank.setNumberBanknotes100(700);
    }
}
