package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.*;

public class Factory {
    private static LinkedList<Details> detail = new LinkedList<>();

    public synchronized static List<Details> getDetail() {
        return detail;
    }

    public synchronized static Details getDetails() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("kolvo : " + detail.size());
        return detail.poll();
    }

    public void createDetails() {
        int countNewDetails = new Random().nextInt(11);

        for (int i = 0; i < countNewDetails; i++) {
            int serialNumber = new Random().nextInt(4);
            switch (serialNumber) {
                case (0):
                    detail.add(Details.HEAD);
                    break;
                case (1):
                    detail.add(Details.TORSO);
                    break;
                case (2):
                    detail.add(Details.HAND);
                    break;
                case (3):
                    detail.add(Details.FEET);
                    break;
            }
        }
    }

    //   @Override
    // public void run() {
    //    createDetails();
    // }
}
