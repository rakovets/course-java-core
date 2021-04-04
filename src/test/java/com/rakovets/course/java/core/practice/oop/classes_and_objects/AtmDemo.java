package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.util.ArrayList;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(15, 10, 100);
        System.out.println(atm.isPossibleIssue(220));
        ArrayList<Integer[]> list = atm.getOptionsCombinationBanknotes(220);
        for (Integer[] l : list) {
            System.out.println("20$ = "+l[0]+" 50$ = "+l[1]+" 100$ = "+l[2]);
        }
        System.out.println(atm.getCash(list.get(1)));
    }
}
