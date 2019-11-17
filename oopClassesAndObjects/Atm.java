package com.rakovets.course.challenge.oopClassesAndObjects;

public class Atm {
    private int countBanknoteNominal20;
    private int countBanknoteNominal50;
    private int countBanknoteNominal100;

    public void setCountBanknoteNominal20(int countBanknoteNominal20) {
        this.countBanknoteNominal20 = countBanknoteNominal20;
    }

    public void setCountBanknoteNominal50(int countBanknoteNominal50) {
        this.countBanknoteNominal50 = countBanknoteNominal50;
    }

    public void setCountBanknoteNominal100(int countBanknoteNominal100) {
        this.countBanknoteNominal100 = countBanknoteNominal100;
    }

    public boolean checkCurrentRequestSum(int sum) {
        boolean result = false;
        int countBanknoteNominal20 = 0;
        int countBanknoteNominal50 = 0;
        int countBanknoteNominal100 = 0;
        if (sum % 10 == 0) {
            for(int i = 0; i <= countBanknoteNominal20 && !result; i++) {
                for(int j = 0; j <= countBanknoteNominal50 && !result; j++) {
                    for(int k = 0; k <= countBanknoteNominal100 && !result; k++) {
                        if (sum == i * 20 + j * 50 + k * 100) {
                            result = true;
                            countBanknoteNominal20 = i;
                            countBanknoteNominal50 = j;
                            countBanknoteNominal100 = k;
                            System.out.println(i + j + k);
                        }

                    }
                }
            }
        } else {
            System.out.println("NOT VALID SUM!");
        }
        return result;
    }
    void display() {
        System.out.printf("100: %d, 50: %d, 20: %d\n", this.countBanknoteNominal100, this.countBanknoteNominal50, this.countBanknoteNominal20);
    }
}
