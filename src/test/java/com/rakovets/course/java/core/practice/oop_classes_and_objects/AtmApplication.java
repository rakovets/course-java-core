package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import java.util.Scanner;
public class AtmApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atm firstAtm = new Atm(6, 1,1);
        if (firstAtm.isPossibleIssue(120)) {
            System.out.println("Yes, we can give you money.");
            firstAtm.getOptionsCombinationBanknotes(120);
        }
        else {
            System.out.println("Sorry, but we cant give you such an amount");
        }
        System.out.println("Choose one of the option:");
        int input = scanner.nextInt();
        firstAtm.getCash(input);
    }
}
