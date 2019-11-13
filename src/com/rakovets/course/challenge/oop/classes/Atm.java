package com.rakovets.course.challenge.oop.classes;

public class Atm {
    private int sizeTwenty;
    private int sizeFifty;
    private int sizeOnehandred;


    Atm(int sizeFifty, int sizeTwenty, int sizeOnehandred) {
        this.sizeFifty = sizeFifty;
        this.sizeTwenty = sizeTwenty;
        this.sizeOnehandred = sizeOnehandred;
    }

    public void setSizeTwenty(int sizeTwenty) {
        this.sizeTwenty = sizeTwenty;
    }

    public void setSizeFifty(int sizeFifty) {
        this.sizeFifty = sizeFifty;
    }

    public void setSizeOnehandred(int sizeOnehandred) {
        this.sizeOnehandred = sizeOnehandred;
    }

    public boolean canGetMoney(int summ) {
        int CurentOnehandred = summ / 100;
        summ -= CurentOnehandred * 100;
        int CurentFifty = summ / 50;
        summ -= CurentFifty * 50;
        int CurentTwenty = summ / 20;
        summ -= CurentTwenty * 20;
        if (summ == 0) {
            System.out.println("You have 100 bills : " + CurentOnehandred + " \n" +
                    "You have 50 bills : " + CurentFifty + "\n " + "You have 20 bills : " + CurentTwenty);
        } else {
            System.out.println("Summ is not valid ! ");
        }
        return false;
    }

    void printCurrentMoney() {
        System.out.printf(" You have %s 50$ bill \n", this.sizeFifty);
        System.out.println(" ");
        System.out.printf(" You have %s 20$ bill \n", this.sizeTwenty);
        System.out.println(" ");
        System.out.printf(" You have %s 100$ bill \n", this.sizeOnehandred);

    }
}
