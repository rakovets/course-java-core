package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Fraction {
    private int headsAmount;
    private int torsosAmount;
    private int handsAmount;
    private int feetAmount;

    public int getHeadsAmount() {
        return headsAmount;
    }

    public void setHeadsAmount(int headsAmount) {
        this.headsAmount = headsAmount;
    }

    public int getTorsosAmount() {
        return torsosAmount;
    }

    public void setTorsosAmount(int torsosAmount) {
        this.torsosAmount = torsosAmount;
    }

    public int getHandsAmount() {
        return handsAmount;
    }

    public void setHandsAmount(int handsAmount) {
        this.handsAmount = handsAmount;
    }

    public int getFeetAmount() {
        return feetAmount;
    }

    public void setFeetAmount(int feetAmount) {
        this.feetAmount = feetAmount;
    }

    public synchronized void sortDetails(int details) {
        int[] arrayDetails = randomDevider(details);
        headsAmount = headsAmount + arrayDetails[0];
        torsosAmount = torsosAmount + arrayDetails[1];
        headsAmount = headsAmount + arrayDetails[2];
        feetAmount = feetAmount + arrayDetails[3];
    }

    public int getAmountRobots() {
        List<Integer> list = new ArrayList<>();
        list.add(handsAmount);
        list.add(torsosAmount);
        list.add(headsAmount);
        list.add(feetAmount);
        return Collections.max(list);
    }

    private int[] randomDevider(int details) {
        int[] nums = new int[4];
        Random rand = new Random();
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = rand.nextInt(details);
            details -= nums[i];
        }
        nums[nums.length - 1] = details;
        return nums;
    }
}
