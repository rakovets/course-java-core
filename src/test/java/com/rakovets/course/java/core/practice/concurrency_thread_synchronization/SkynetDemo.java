package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class SkynetDemo {
    public static void main(String[] args) {
        JudgeDayTimer timer = new JudgeDayTimer();
         SkyNet skyNet = new SkyNet(timer,factory);
         Wednesday wednesday = new Wednesday(timer,factory);
         Factory factory = new Factory(timer);

         new Thread(timer).start();
         new Thread(skyNet).start();
         new Thread(wednesday).start();
         new Thread(factory).start();
    }
}
