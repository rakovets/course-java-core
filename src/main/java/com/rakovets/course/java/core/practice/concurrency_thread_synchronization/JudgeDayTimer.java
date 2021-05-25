package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;


public class JudgeDayTimer extends Thread {
    private boolean dayTime;
    private boolean nightTime;
    private int lengthOfTheHalfDay = 12;
    private int epicBattleTimer = 10;

    public boolean getDayTime() {
        return dayTime;
    }

    public boolean getNightTime() {
        return nightTime;
    }

    public synchronized boolean getJudgeDay() {
        if (epicBattleTimer == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public  void run() {
        while(epicBattleTimer > 0) {
            try {
                dayTime = true;
                nightTime = false;
                Thread.sleep(lengthOfTheHalfDay * 1000);
                dayTime = false;
                nightTime = true;
                Thread.sleep(lengthOfTheHalfDay * 1000);
                epicBattleTimer--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
