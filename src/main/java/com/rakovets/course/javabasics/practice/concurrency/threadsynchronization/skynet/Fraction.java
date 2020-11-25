package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;
import java.util.List;

public abstract class Fraction {
    private List<Integer> headsAmount = new ArrayList<Integer>();
    private List<Integer> torsosAmount = new ArrayList<Integer>();
    private List<Integer> handsAmount = new ArrayList<Integer>();
    private List<Integer> feetAmount = new ArrayList<Integer>();

    public List<Integer> getHeadsAmount() {
        return headsAmount;
    }

    public void setHeadsAmount(List<Integer> headsAmount) {
        this.headsAmount = headsAmount;
    }

    public List<Integer> getTorsosAmount() {
        return torsosAmount;
    }

    public void setTorsosAmount(List<Integer> torsosAmount) {
        this.torsosAmount = torsosAmount;
    }

    public List<Integer> getHandsAmount() {
        return handsAmount;
    }

    public void setHandsAmount(List<Integer> handsAmount) {
        this.handsAmount = handsAmount;
    }

    public List<Integer> getFeetAmount() {
        return feetAmount;
    }

    public void setFeetAmount(List<Integer> feetAmount) {
        this.feetAmount = feetAmount;
    }

    public int getAmountRobots() {

        // найти минимальное значение из этих 4х значений и вернуть его вместо 0 headsAmount.size()  torsosAmount.size()  handsAmount.size()  feetAmount.size()>0

        ArrayList list = new ArrayList<>();
        list.add(headsAmount.size());
        list.add(torsosAmount.size());
        list.add(feetAmount.size());
        list.add(handsAmount.size());

//        return (int) Collections.min(list);
        return 1;
    }
}

