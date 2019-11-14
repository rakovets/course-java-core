package com.rakovets.course.challenge.oop.first_task;

public class Atm {
    int amountOfMoney;
    int amountOfMoneyInATM = 10000;
    int nominalOne = 20;
    int nominalSecond = 50;
    int nominalThird = 100;
    int amountOfFirstNominalInATM = 5;
    int amountOfSecondNominalInATM = 6;
    int amountOfThirdNominalInATM = 6;
    int moneyFromATM = 0;
    void setMoney(int amountOfFirstNominal, int amountOfSecondNominal, int amountOfThirdNominal) {
        amountOfMoney = (nominalOne * amountOfFirstNominal) + (nominalSecond * amountOfSecondNominal) + (nominalThird * amountOfThirdNominal);
        System.out.println("Amount of money that you give: " + amountOfMoney);
        amountOfFirstNominalInATM += amountOfFirstNominal;
        amountOfSecondNominalInATM += amountOfSecondNominal;
        amountOfThirdNominalInATM += amountOfThirdNominal;
        amountOfMoneyInATM += amountOfMoney;
    }
    boolean getMoney(int amountOfWithdrawMoney){
        int counter1 = 0;
        while (moneyFromATM < amountOfWithdrawMoney) {
            moneyFromATM += nominalThird;
            counter1++;
        }
        System.out.printf("You get %d money with nominal %d in count %d", moneyFromATM, nominalThird, counter1);
        return amountOfWithdrawMoney <= amountOfMoneyInATM;

    }
}
