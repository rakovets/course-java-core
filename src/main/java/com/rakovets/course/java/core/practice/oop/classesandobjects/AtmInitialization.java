package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class AtmInitialization {
    public static void main(String[] args) {

        Atm rich = new Atm(14, 3,1);
        rich.addBanknotes20(5);
        rich.addBanknotes50(6);
        rich.addBanknotes100(1);

        if (rich.isPossibleIssue(1690)) {
            System.out.println("it's possible operation");
        } else {
            System.out.println("operation is not possible");
        }

        String[] myVariants = rich.getOptionsCombinationBanknotes(1250);
        for (String myVariant : myVariants) {
            System.out.println(myVariant);
        }

        rich.getCash("15*100BYN, 9*50BYN, 6*20BYN"); // снимает все деньги
        if (rich.isPossibleIssue(20)) {
            System.out.println("it's possible operation");
        } else {
            System.out.println("operation is not possible");
        }
    }
}
