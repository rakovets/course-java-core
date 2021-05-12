package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
  private int numberBanknotes20;
  private int numberBanknotes50;
  private int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    public void addBanknotes20(int banknotes20) {
        this.numberBanknotes20 = banknotes20;
    }

    public void addBanknotes50(int banknotes50) {
        this.numberBanknotes50 = banknotes50;
    }

    public void addBanknotes100(int banknotes100) {
        this.numberBanknotes100 = banknotes100;
    }

    public int getTotalSumInAtm() {
        return this.numberBanknotes20 * 20 + this.numberBanknotes50 * 50 + this.numberBanknotes100 * 100;
    }

    public String isPossibleIssue(int amount) {
        int totalSumInAtm = this.numberBanknotes20 * 20 + this.numberBanknotes50 * 50 + this.numberBanknotes100 * 100;
        int banknoteRate20 = 20;
        int banknoteRate50 = 50;
        int banknoteRate100 = 100;
        String result = "";
        if (totalSumInAtm >= amount) {

            int countBanknote100 = 0;
            int countBanknote50 = 0;
            int countBanknote20 = 0;

            for (int i = 1; amount >= banknoteRate100 && countBanknote100 < numberBanknotes100; i++) {
                amount -= banknoteRate100;
                countBanknote100++;
            }
            for (int i = 1; amount >= banknoteRate50 && countBanknote50 < numberBanknotes50; i++) {
                amount -= banknoteRate50;
                countBanknote50++;
            }

            if (amount % banknoteRate20 == 0 && numberBanknotes20 >= amount / banknoteRate20) {
                result = "===== Operation can be proceeded =====";
            } else {
                result = "===== There is no proper banknotes rate in ATM =====";
            }

        } else {
            result = "===== Sorry! There is not enough cash in the ATM ====== ";
        }

        return result;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        int numberOfRates = 3;
        int banknoteRate100 = 100;
        int banknoteRate50 = 50;
        int banknoteRate20 = 20;

        int countBanknote100 = 0;
        int countBanknote50 = 0;
        int countBanknote20 = 0;

        int totalAmountInAtm = this.numberBanknotes100 * banknoteRate100 + numberBanknotes50 * banknoteRate50 + numberBanknotes20 * banknoteRate20;
        String result = "";

        if (totalAmountInAtm > amount) {

            for (int i = 1; amount >= banknoteRate100 && countBanknote100 < numberBanknotes100; i++) {
                amount -= banknoteRate100;
                countBanknote100++;
            }
            for (int i = 1; amount >= banknoteRate50 && countBanknote50 < numberBanknotes50; i++) {
                amount -= banknoteRate50;
                countBanknote50++;
            }

            if (amount % banknoteRate20 == 0 && numberBanknotes20 >= amount / banknoteRate20) {
                countBanknote20 += amount / banknoteRate20;
            } else {
                result = "Invalid transaction";
            }

        } else {
            result = "Invalid transaction";
        }

        int possibleReplace100for50 = (numberBanknotes50 - countBanknote50) / 2;
        int possibleReplace100for20 = (numberBanknotes20 - countBanknote20) / 5;
        int x = numberOfRates * possibleReplace100for20 * 2 + possibleReplace100for50 + 3;

        if (possibleReplace100for20 == 0) {
            x = possibleReplace100for50 + 1;
        } else if (possibleReplace100for50 == 0) {
            x = 1;
        }

        if (possibleReplace100for50 == 0) {
            x = possibleReplace100for20 * 2 + 2;
        } else if (possibleReplace100for20 == 0) {
            x = 1;
        }

        if (possibleReplace100for50 > 0 || possibleReplace100for20 > 0) {
            int[][] countStack = new int[3][x];
            int banknotes100 = 0;
            int banknotes50 = 1;
            int banknotes20 = 2;
            countStack[banknotes100][0] = countBanknote100;
            countStack[banknotes50][0] = countBanknote50;
            countStack[banknotes20][0] = countBanknote20;
            int i = 0;

            for (; countStack[banknotes100][i] > 0; i++) {
                if (numberBanknotes50 - countStack[banknotes50][i] > 0 && possibleReplace100for50 > 0) {
                    countStack[banknotes100][i + 1] = countStack[banknotes100][i] - 1;
                    countStack[banknotes50][i + 1] = countStack[banknotes50][i] + 2;
                    countStack[banknotes20][i + 1] = countStack[banknotes20][i];
                    possibleReplace100for50--;
                } else {
                    break;
                }

            }
            int s = possibleReplace100for20;
            for (int j = 0; countStack[banknotes100][j] > 0 && s >= 0; j++) {
                if (numberBanknotes20 - countStack[banknotes20][j] >= 5) {
                    countStack[banknotes100][i + 1] = countStack[banknotes100][j] - 1;
                    countStack[banknotes50][i + 1] = countStack[banknotes50][j];
                    countStack[banknotes20][i + 1] = countStack[banknotes20][j] + 5;
                    i++;
                    s--;
                }
            }

            int d = possibleReplace100for20;
            for (int j = 0; countStack[banknotes50][j] >= 2 && d >= 0; j++) {
                if (numberBanknotes20 - countStack[banknotes20][j] >= 5) {
                    countStack[banknotes100][i + 1] = countStack[banknotes100][j];
                    countStack[banknotes50][i + 1] = countStack[banknotes50][j] - 2;
                    countStack[banknotes20][i + 1] = countStack[banknotes20][j] + 5;
                    i++;
                    d--;
                }
            }

            int[] temp = new int[3];
            for (int k = 0; k < countStack[banknotes100].length - 1; k++) {
                for (int l = k + 1; l < countStack[banknotes20].length; l++) {
                    if (countStack[banknotes100][k] == countStack[banknotes100][l]) {

                        if (countStack[banknotes50][k] < countStack[banknotes50][l]) {
                            temp[banknotes100] = countStack[banknotes100][k];
                            temp[banknotes50] = countStack[banknotes50][k];
                            temp[banknotes20] = countStack[banknotes20][k];

                            countStack[banknotes100][k] = countStack[banknotes100][l];
                            countStack[banknotes50][k] = countStack[banknotes50][l];
                            countStack[banknotes20][k] = countStack[banknotes20][l];

                            countStack[banknotes100][l] = temp[banknotes100];
                            countStack[banknotes50][l] = temp[banknotes50];
                            countStack[banknotes20][l] = temp[banknotes20];
                        }
                        if (countStack[banknotes50][k] == countStack[banknotes50][l]) {
                            if (countStack[banknotes20][k] < countStack[banknotes20][l]) {
                                temp[banknotes100] = countStack[banknotes100][k];
                                temp[banknotes50] = countStack[banknotes50][k];
                                temp[banknotes20] = countStack[banknotes20][k];

                                countStack[banknotes100][k] = countStack[banknotes100][l];
                                countStack[banknotes50][k] = countStack[banknotes50][l];
                                countStack[banknotes20][k] = countStack[banknotes20][l];

                                countStack[banknotes100][l] = temp[banknotes100];
                                countStack[banknotes50][l] = temp[banknotes50];
                                countStack[banknotes20][l] = temp[banknotes20];
                            }
                            if (countStack[banknotes20][k] == countStack[banknotes20][l]) {
                                countStack[banknotes100][l] = 0;
                                countStack[banknotes50][l] = 0;
                                countStack[banknotes20][l] = 0;
                            }
                        }
                    } else if (countStack[banknotes100][k] < countStack[banknotes100][l]) {
                        temp[banknotes100] = countStack[banknotes100][k];
                        temp[banknotes50] = countStack[banknotes50][k];
                        temp[banknotes20] = countStack[banknotes20][k];

                        countStack[banknotes100][k] = countStack[banknotes100][l];
                        countStack[banknotes50][k] = countStack[banknotes50][l];
                        countStack[banknotes20][k] = countStack[banknotes20][l];

                        countStack[banknotes100][l] = temp[banknotes100];
                        countStack[banknotes50][l] = temp[banknotes50];
                        countStack[banknotes20][l] = temp[banknotes20];

                    }
                }
            }

            for (int j = 0; countStack[banknotes100][j] > 0 || countStack[banknotes50][j] > 0 || countStack[banknotes20][j] > 0; j++) {
                result += j + 1 + ". ";
                if (countStack[banknotes100][j] > 0) {
                    result += countStack[banknotes100][j] + "*" + banknoteRate100 + " ";
                }
                if (countStack[banknotes50][j] > 0) {
                    result += countStack[banknotes50][j] + "*" + banknoteRate50 + " ";
                }
                if (countStack[banknotes20][j] > 0) {
                    result += countStack[2][j] + "*" + banknoteRate20 + "\n";
                }
            }

        } else {
            result += "1. " + countBanknote100 + "*" + banknoteRate100;
        }
        return result;
    }
    public int[][] getAllCombinationBanknotes(int amount) {
        int numberOfRates = 3;
        int banknoteRate100 = 100;
        int banknoteRate50 = 50;
        int banknoteRate20 = 20;

        int countBanknote100 = 0;
        int countBanknote50 = 0;
        int countBanknote20 = 0;

        int totalAmountInAtm = this.numberBanknotes100 * banknoteRate100 + numberBanknotes50 * banknoteRate50 + numberBanknotes20 * banknoteRate20;
        String result = "";

        if (totalAmountInAtm > amount) {

            for (int i = 1; amount >= banknoteRate100 && countBanknote100 < numberBanknotes100; i++) {
                amount -= banknoteRate100;
                countBanknote100++;
            }
            for (int i = 1; amount >= banknoteRate50 && countBanknote50 < numberBanknotes50; i++) {
                amount -= banknoteRate50;
                countBanknote50++;
            }

            if (amount % banknoteRate20 == 0 && numberBanknotes20 >= amount / banknoteRate20) {
                countBanknote20 += amount / banknoteRate20;
            } else {
                result = "Invalid transaction";
            }

        } else {
            result = "Invalid transaction";
        }

        int possibleReplace100for50 = (numberBanknotes50 - countBanknote50) / 2;
        int possibleReplace100for20 = (numberBanknotes20 - countBanknote20) / 5;
        int x = numberOfRates * possibleReplace100for20 * 2 + possibleReplace100for50 + 3;

        if (possibleReplace100for20 == 0) {
            x = possibleReplace100for50 + 1;
        } else if (possibleReplace100for50 == 0) {
            x = 1;
        }

        if (possibleReplace100for50 == 0) {
            x = possibleReplace100for20 * 2 + 2;
        } else if (possibleReplace100for20 == 0) {
            x = 1;
        }
        if (possibleReplace100for50 > 0 || possibleReplace100for20 > 0) {
            x = possibleReplace100for50 + 1 + possibleReplace100for20 * 2 + 2;
        }
            int[][] countStack = new int[3][x];
            int banknotes100 = 0;
            int banknotes50 = 1;
            int banknotes20 = 2;
            countStack[banknotes100][0] = countBanknote100;
            countStack[banknotes50][0] = countBanknote50;
            countStack[banknotes20][0] = countBanknote20;
            int i = 0;

            for (; countStack[banknotes100][i] > 0; i++) {
                if (numberBanknotes50 - countStack[banknotes50][i] > 0 && possibleReplace100for50 > 0) {
                    countStack[banknotes100][i + 1] = countStack[banknotes100][i] - 1;
                    countStack[banknotes50][i + 1] = countStack[banknotes50][i] + 2;
                    countStack[banknotes20][i + 1] = countStack[banknotes20][i];
                    possibleReplace100for50--;
                } else {
                    break;
                }

            }
            int s = possibleReplace100for20;
            for (int j = 0; countStack[banknotes100][j] > 0 && s >= 0; j++) {
                if (numberBanknotes20 - countStack[banknotes20][j] >= 5) {
                    countStack[banknotes100][i + 1] = countStack[banknotes100][j] - 1;
                    countStack[banknotes50][i + 1] = countStack[banknotes50][j];
                    countStack[banknotes20][i + 1] = countStack[banknotes20][j] + 5;
                    i++;
                    s--;
                }
            }

            int d = possibleReplace100for20;
            for (int j = 0; countStack[banknotes50][j] >= 2 && d >= 0; j++) {
                if (numberBanknotes20 - countStack[banknotes20][j] >= 5) {
                    countStack[banknotes100][i + 1] = countStack[banknotes100][j];
                    countStack[banknotes50][i + 1] = countStack[banknotes50][j] - 2;
                    countStack[banknotes20][i + 1] = countStack[banknotes20][j] + 5;
                    i++;
                    d--;
                }
            }

            int[] temp = new int[3];
            for (int k = 0; k < countStack[banknotes100].length - 1; k++) {
                for (int l = k + 1; l < countStack[banknotes20].length; l++) {
                    if (countStack[banknotes100][k] == countStack[banknotes100][l]) {

                        if (countStack[banknotes50][k] < countStack[banknotes50][l]) {
                            temp[banknotes100] = countStack[banknotes100][k];
                            temp[banknotes50] = countStack[banknotes50][k];
                            temp[banknotes20] = countStack[banknotes20][k];

                            countStack[banknotes100][k] = countStack[banknotes100][l];
                            countStack[banknotes50][k] = countStack[banknotes50][l];
                            countStack[banknotes20][k] = countStack[banknotes20][l];

                            countStack[banknotes100][l] = temp[banknotes100];
                            countStack[banknotes50][l] = temp[banknotes50];
                            countStack[banknotes20][l] = temp[banknotes20];
                        }
                        if (countStack[banknotes50][k] == countStack[banknotes50][l]) {
                            if (countStack[banknotes20][k] < countStack[banknotes20][l]) {
                                temp[banknotes100] = countStack[banknotes100][k];
                                temp[banknotes50] = countStack[banknotes50][k];
                                temp[banknotes20] = countStack[banknotes20][k];

                                countStack[banknotes100][k] = countStack[banknotes100][l];
                                countStack[banknotes50][k] = countStack[banknotes50][l];
                                countStack[banknotes20][k] = countStack[banknotes20][l];

                                countStack[banknotes100][l] = temp[banknotes100];
                                countStack[banknotes50][l] = temp[banknotes50];
                                countStack[banknotes20][l] = temp[banknotes20];
                            }
                            if (countStack[banknotes20][k] == countStack[banknotes20][l]) {
                                countStack[banknotes100][l] = 0;
                                countStack[banknotes50][l] = 0;
                                countStack[banknotes20][l] = 0;
                            }
                        }
                    } else if (countStack[banknotes100][k] < countStack[banknotes100][l]) {
                        temp[banknotes100] = countStack[banknotes100][k];
                        temp[banknotes50] = countStack[banknotes50][k];
                        temp[banknotes20] = countStack[banknotes20][k];

                        countStack[banknotes100][k] = countStack[banknotes100][l];
                        countStack[banknotes50][k] = countStack[banknotes50][l];
                        countStack[banknotes20][k] = countStack[banknotes20][l];

                        countStack[banknotes100][l] = temp[banknotes100];
                        countStack[banknotes50][l] = temp[banknotes50];
                        countStack[banknotes20][l] = temp[banknotes20];

                    }
                }
            }

        return countStack;
    }

    public String getCash(int option, int amount) {
       int[][] allCombinationBanknotes = this.getAllCombinationBanknotes(amount);
       numberBanknotes100 -= allCombinationBanknotes[0][option-1];
       numberBanknotes50 -= allCombinationBanknotes[1][option-1];
       numberBanknotes20 -= allCombinationBanknotes[2][option-1];
        return "===== Shut up and take my money =====";
    }
}

