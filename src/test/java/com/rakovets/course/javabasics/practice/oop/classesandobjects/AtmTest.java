package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import com.rakovets.course.javabasics.practice.oop.classesandobjects.constants.ColorConsants;

import java.util.Scanner;

public class AtmTest {
    public static void main(String[] args) {
        Atm cash = new Atm(1, 2, 5);
        System.out.println(ColorConsants.ANSI_GREEN + "...Please inter amount of cash... \n" + ColorConsants.ANSI_RESET);
        Scanner in = new Scanner(System.in);
        int amountCash = in.nextInt();
        Scanner optIn = new Scanner(System.in);

        if (cash.isPossibleIssue(amountCash)) {
            System.out.println(ColorConsants.ANSI_GREEN + "...Please choose options... \n" + ColorConsants.ANSI_RESET + cash.getOptionsCombinationBanknotes(amountCash));
            cash.getOptionsCombinationBanknotes(amountCash);
            int options = in.nextInt();
            if(cash.getOptionsCombinationBanknotes(amountCash)!=0){
                cash.getCash(options, amountCash);
            }
        } else
            System.out.println(ColorConsants.ANSI_RED + "...Sorry, ATM hasn't this cash... \n" + ColorConsants.ANSI_RESET + cash.getOptionsCombinationBanknotes(amountCash));





    }
}
