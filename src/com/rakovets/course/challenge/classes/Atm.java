package com.rakovets.course.challenge.classes;

public class Atm {
    int numberBanknotes100;
    int numberBanknotes50;
    int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    void addBanknotes100(int numberBanknotes100) {
        this.numberBanknotes100 = this.numberBanknotes100 + numberBanknotes100;
    }

    void addBanknotes50(int numberBanknotes50) {
        this.numberBanknotes50 = this.numberBanknotes50 + numberBanknotes50;
    }

    void addBanknotes20(int numberBanknotes20) {
        this.numberBanknotes20 = this.numberBanknotes20 + numberBanknotes20;
    }

    void isPossibleIssue(int amount1) {
        System.out.println("required amount1 is: " + amount1 + " processing...");
        if ((amount1 % 50 == 0 || amount1 % 20 == 0) & amount1 <= (numberBanknotes100 * 100 + numberBanknotes50 * 50 + numberBanknotes20 * 20)) {
            System.out.println("sure possible, kind sir");
        } else {
            System.out.println("sorry to disappoint you, but right now we are unable to give you the sum you need");
        }
    }
/*
два других метода еще не готовы
 */
    void getOptionsCombinationBanknotes(int amount2) {
        if ((amount2 % 50 == 0 || amount2 % 20 == 0) & amount2 <= (numberBanknotes100 * 100 + numberBanknotes50 * 50 + numberBanknotes20 * 20)) {
            System.out.println("sure possible, kind sir");
            System.out.println("here you can see all the options of how you can get youe money: ");
        } else {
            System.out.println("sorry to disappoint you, but right now we are unable to give you the sum you need");
        }
    }

    /*
getOptionsCombinationBanknotes(amount) - возвращает все возможное варианты для выдачы суммы
getCash(option) - выдает деньги клиенту, для выбранного им варианта

     */
}
