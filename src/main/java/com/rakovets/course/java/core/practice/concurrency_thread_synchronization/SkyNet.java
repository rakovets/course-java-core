package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class SkyNet extends Thread {
    private int robotsCount = 0;
    private  int head = 0;
    private  int torso = 0;
    private  int hand = 0;
    private  int feet = 0;
    private int maxLoad = 5;
    private Factory factory;
    private JudgeDayTimer timer;

    public SkyNet(JudgeDayTimer timer,Factory factory) {
        this.timer = timer;
        this.factory = factory;
    }

    @Override
    public void run() {
        while(!timer.getJudgeDay()) {
            while(timer.getNightTime()) {
                for (int i = 0; i <= maxLoad; i++) {
                    if (factory.getHeadInfo() > 0) {
                        factory.keepHeadFormFactory();
                        head++;
                    } else if (factory.getTorsoInfo() > 0) {
                        factory.keepTorsoFormFactory();
                        torso++;
                    } else if (factory.getHandInfo() > 0) {
                        factory.keepHandFormFactory();
                        hand++;
                    } else if (factory.getFeatInfo() > 0) {
                        factory.keepFeatFormFactory();
                        feet++;
                    }
                }
                if (head >= 1 && torso >= 1 && hand >= 1 && feet >= 2) {
                    robotsCount++;
                    head--;
                    torso--;
                    hand -= 2;
                    feet -= 2;
                }
            }
        }
    }
}
