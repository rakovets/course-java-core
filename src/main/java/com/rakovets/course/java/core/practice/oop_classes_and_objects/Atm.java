package com.rakovets.course.java.core.practice.oop_classes_and_objects;

/**
 * Создать class Atm описывающий банкомат.
 * Создать Fields:
 * numberBanknotes20
 * numberBanknotes50
 * numberBanknotes100
 * Создать Constructors:
 * Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100)
 * Создать Methods:
 * addBanknotes20(number)
 * addBanknotes50(number)
 * addBanknotes100(number)
 * Создать Methods:
 * isPossibleIssue(amount) - проверяет, возможно ли выдать сумму, которую запросил клиент
 * getOptionsCombinationBanknotes(amount) - возвращает все возможные варианты для суммы выдаваемых купюр
 * getCash(option) - выдает деньги клиенту, для выбранного им варианта
 */
public class Atm {
    public int numberBanknotes20;
    public int numberBanknotes50;
    public int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int addBanknotes20(int number) {
        return number;
    }

    public int addBanknotes50(int number) {
        return number;
    }

    public int addBanknotes100(int number) {
        return number;
    }

    public boolean isPossibleIssue(int amount) {
        return amount > addBanknotes20(amount) + addBanknotes50(amount) + addBanknotes100(amount);
    }
}
