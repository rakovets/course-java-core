package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.util.Scanner;

public class CensorTargetInput {
    public static String[] inputTargetData() {
        Scanner scanner = new Scanner(System.in);
        int firstAgreement = 0;
        int secondAgreement = 0;
        String filepath = "";
        String searchWord = "";

        while (secondAgreement != 1) {
            try {
                System.out.println("Enter your filepath:\n(To exit the program, enter '-1')");
                filepath = scanner.nextLine();

                if (filepath.equals("-1")) {
                    System.out.println("The app is closing");
                    break;
                } else {
                    System.out.println("Your filepath is " + filepath);
                    System.out.println("If your filepath is correct - enter 1");
                    System.out.println("(You can enter another digit to correct your data)");
                    try {
                        Scanner scannerAgreement = new Scanner(System.in);
                        firstAgreement = scannerAgreement.nextInt();
                    } catch (Exception exception) {
                        System.out.println("Your value is not a digit");
                    }
                    if (firstAgreement != 1) {
                        continue;
                    }
                }
                System.out.println("Enter your search word");
                Scanner scannerWord = new Scanner(System.in);
                searchWord = scannerWord.nextLine();
                System.out.println("Your filepath is " + filepath + "\nYour search word is " + searchWord);
                System.out.println("If your filepath and search word are correct - enter 1");
                System.out.println("(You can enter another digit to correct your data)");
                try {
                    Scanner scannerAgreement = new Scanner(System.in);
                    secondAgreement = scannerAgreement.nextInt();
                } catch (Exception exception) {
                    System.out.println("Your value is not a digit");
                }
            } catch (Exception exp) {
                System.out.println("Something went wrong");
            }
        }
        return new String[] {filepath, searchWord};
    }
}

