package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;


import java.util.Random;

public class Factory extends Thread {
    private  int head = 0;
    private  int torso = 0;
    private  int hand = 0;
    private  int feet = 0;
    private  int dayTimeProduceLimit = 10 ;
    private static int count = 0;
    private JudgeDayTimer timer;

    public Factory(JudgeDayTimer timer) {
        this.timer = timer;
    }

    public  int getHeadInfo() {
        return head;
    }

    public synchronized   void keepHeadFormFactory() {
        head --;
    }

    public synchronized   int getTorsoInfo() {
        return torso;
    }

    public synchronized   void keepTorsoFormFactory() {
        torso --;
    }

    public synchronized int getHandInfo() {
        return hand;
    }

    public synchronized void keepHandFormFactory() {
        hand --;
    }

    public synchronized int getFeatInfo() {
        return feet;
    }

    public synchronized void keepFeatFormFactory() {
        feet --;
    }

    @Override
    public void run() {
        Random random = new Random();
        while(!timer.getJudgeDay()) {
            while (count <= dayTimeProduceLimit) {
                int produce = random.nextInt(4);
                switch (produce) {
                    case 0:
                        head++;
                        count++;
                        break;
                    case 1:
                        torso++;
                        count++;
                        break;
                    case 2:
                        hand++;
                        count++;
                        break;
                    case 3:
                        feet++;
                        count++;
                        break;
                }
            }
        }
    }
}
