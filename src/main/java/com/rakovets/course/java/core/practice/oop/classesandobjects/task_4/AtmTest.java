package com.rakovets.course.java.core.practice.oop.classesandobjects.task_4;

import com.rakovets.course.java.core.practice.oop.classesandobjects.task_4.model.Atm;

public class AtmTest {
    public static void main(String[] args) {
        Atm i = new Atm(10,10,8);
        i.addBanknotes20(2);
        i.addBanknotes50(3);
        i.addBanknotes100(3);
        i.getOptionsCombinationBanknotes(300);
        i.getCash(6);
        i.isPossible(400);
    }
}
